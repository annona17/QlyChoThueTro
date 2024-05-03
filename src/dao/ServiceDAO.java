package dao;

import model.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import static dao.DAO.con;

public class ServiceDAO {
    public ServiceDAO() {
        super();
    }

    public ArrayList<PostpaidService> getPostPaidServiceInfo(){
        ArrayList<PostpaidService> lstPostS = new ArrayList<>();
        String sql = "SELECT * FROM PostpaidService";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                PostpaidService postS = new PostpaidService();
                postS.setID(rs.getInt("ID"));
                postS.setName(rs.getString("name"));
                postS.setNote(rs.getString("note"));
                postS.setServiceProgression(getServiceProgressionInfo(postS.getID()));
                lstPostS.add(postS);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstPostS;
    }
    public ArrayList<ServiceProgression> getServiceProgressionInfo(int postpaidServiceID) {
        ArrayList<ServiceProgression> lstSP = new ArrayList<>();
        String sql = "SELECT s.ID, s.step, s.fromIndex, s.toIndex, s.price FROM ServiceProgression s WHERE postpaidServiceID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, postpaidServiceID);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                ServiceProgression sp = new ServiceProgression();
                sp.setID(rs.getInt("ID"));
                sp.setStep(rs.getInt("step"));
                sp.setFromIndex(rs.getInt("fromIndex"));
                sp.setToIndex(rs.getInt("toIndex"));
                sp.setPrice(rs.getInt("price"));
                lstSP.add(sp);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstSP;
    }
    // lay thong tin cac dich vu tra truoc
    public ArrayList<RegisterPrepaidService> getRegisterPrepaidServiceInfo(int rentedRoomID){
        ArrayList<RegisterPrepaidService> lstRegPreS = new ArrayList<>();
        String sql = "SELECT * FROM RegisterPrepaidService rps WHERE rps.rentedRoomID = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RegisterPrepaidService rps = new RegisterPrepaidService();
                rps.setID(rs.getInt("ID"));
                rps.setQuantity(rs.getInt("quantity"));
                rps.setPrepaidService(getPrepaidServiceInfo(rps.getID()));
                rps.setTotalAmount();
                lstRegPreS.add(rps);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return lstRegPreS;
    }
    public PrepaidService getPrepaidServiceInfo(int rpsID) {
        PrepaidService preS = new PrepaidService();
        String sql = "SELECT ps.ID, ps.name, ps.price, ps.note FROM PrepaidService ps, RegisterPrepaidService rpsWHERE rps.ID = ? AND rps.prepaidServiceID = ps.ID";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            ps.setInt(1, rpsID);
            if (rs.next()) {
                preS.setID(rs.getInt("ID"));
                preS.setName(rs.getString("name"));
                preS.setPrice(rs.getInt("price"));
                preS.setNote(rs.getString("note"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return preS;
    }
}
