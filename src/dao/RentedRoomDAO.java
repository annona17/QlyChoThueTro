package dao;

import model.Client;
import model.RentedRoom;
import model.Room;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class RentedRoomDAO extends DAO {
    public RentedRoomDAO() {
        super();
    }
    public ArrayList<RentedRoom> loadUnBillRoom(String month) {
        ArrayList<RentedRoom> result = new ArrayList<>();
        String sql = "SELECT rr.ID, rr.price, rr.startDateRent, rr.endDateRent, rr.deposit, rr.debt FROM RentedRoom rr WHERE rr.startDateRent < ? AND rr.endDateRent > ? AND rr.ID NOT IN(SELECT b.rentedRoomID FROM MonthlyBill b WHERE b.forMonth = ?); ";
        try {
            // month nhap vao co dang MM-yyyy chuyen ve dang yyyy-MM
            String month2 = month.substring(3) + "-" + month.substring(0, 2) + "-28";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, month2);
            ps.setString(2, month2);
            ps.setString(3, month);
            //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                RentedRoom rr = new RentedRoom();
                rr.setID(rs.getInt("ID"));
                rr.setPrice(rs.getFloat("price"));
                rr.setStartDateRent(rs.getDate("startDateRent"));
                rr.setEndDateRent(rs.getDate("endDateRent"));
                rr.setDeposit(rs.getFloat("deposit"));
                rr.setDebt(rs.getFloat("debt"));
                rr.setRoom(getRoomInfo(rr.getID()));
                result.add(rr);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    public Room getRoomInfo(int rentedRoomID){
        Room room = new Room();
        String sql = "SELECT r.ID, r.name, r.type, r.description, r.price, r.status, r.elecIndex, r.waterIndex FROM Room r, RentedRoom rr WHERE r.ID = rr.roomID AND rr.ID = ?;";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rentedRoomID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                room.setID(rs.getInt("ID"));
                room.setName(rs.getString("name"));
                room.setType(rs.getString("type"));
                room.setDescription(rs.getString("description"));
                room.setPrice(rs.getFloat("price"));
                room.setStatus(rs.getString("status"));
                room.setElecIndex(rs.getInt("elecIndex"));
                room.setWaterIndex(rs.getInt("waterIndex"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return room;
    }
    public Client getClientInfo(int rentedRoomID) {
        Client client = new Client();
        String sql = "SELECT cl.ID, cl.name, cl.dob, cl.cccd, cl.tel, cl.hometown FROM RentedRoom rr, Contract c, Client cl WHERE rr.ID = ? AND rr.contractID = c.ID AND c.clientID = cl.ID";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, rentedRoomID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                client.setID(rs.getInt("ID"));
                client.setName(rs.getString("name"));
                client.setDob(rs.getDate("dob"));
                client.setCccd(rs.getString("cccd"));
                client.setTel(rs.getString("tel"));
                client.setHometown(rs.getString("hometown"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return client;
    }
}
