package dao;

import model.MonthlyBill;
import model.UsedPostpaidService;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MonthlyBillDAO extends DAO {
    public MonthlyBillDAO() {
        super();
    }
    public int getIDofNewBill() {
        int result = 0;
        String sql = "SELECT MAX(ID) FROM MonthlyBill";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                result = rs.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ++result;
    }
    public boolean addUsedPostpaidService(MonthlyBill monthlyBill) {
        boolean result = true;
        String sql = "INSERT INTO UsedPostpaidService VALUES(?,?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            for (UsedPostpaidService usp : monthlyBill.getRentedRoom().getLstUPS()) {
                ps.setInt(1, usp.getOldIndex());
                ps.setInt(2, usp.getNewIndex());
                ps.setString(3, monthlyBill.getForMonth());
                ps.setInt(4, usp.getPostpaidService().getID());
                ps.setInt(5, monthlyBill.getRentedRoom().getID());
                ps.addBatch();
            }
            ps.executeBatch();

        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }
    public boolean addMonthlyBill(MonthlyBill monthlyBill) {
        boolean result = true;
        String sql = "INSERT INTO MonthlyBill VALUES(?, ?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, monthlyBill.getForMonth());
            ps.setFloat(2, monthlyBill.getTotalAmount());
            ps.setString(3, monthlyBill.getCreatedDate());
            ps.setString(4, monthlyBill.getPaymentTerm());
            ps.setFloat(5, monthlyBill.getHost().getID());
            ps.setInt(6, monthlyBill.getRentedRoom().getID());
            ps.setInt(7, monthlyBill.getClient().getID());
            ps.executeUpdate();
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }
    public boolean updateRoom (MonthlyBill monthlyBill) {
        boolean result = true;
        String sql = "UPDATE Room SET elecIndex = ?, waterIndex = ? WHERE ID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, monthlyBill.getRentedRoom().getLstUPS().get(0).getNewIndex());
            ps.setInt(2, monthlyBill.getRentedRoom().getLstUPS().get(1).getNewIndex());
            ps.setInt(3, monthlyBill.getRentedRoom().getRoom().getID());
            ps.executeUpdate();
        } catch (Exception e) {
            result = false;
            e.printStackTrace();
        }
        return result;
    }
}
