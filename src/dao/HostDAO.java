package dao;

import model.Host;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HostDAO extends DAO {
    public HostDAO() {
        super();
    }
    public boolean checkLogin(Host host) {
        boolean result = false;
        String sql = "SELECT id, name FROM Host WHERE username = ? AND password = ? ";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, host.getUsername());
            ps.setString(2, host.getPassword());
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                host.setID(rs.getInt("ID"));
                host.setName(rs.getString("name"));
                result = true;
            }
        }catch(Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
