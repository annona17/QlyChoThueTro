package model;

import java.io.Serializable;

public class Host implements Serializable {
    private int ID;
    private String username;
    private String password;
    private String name;
    private String cccd;
    private String tel;

    public Host() {
        super();
    }
    public Host(int ID, String username, String password, String name, String cccd, String tel) {
        super();
        this.ID = ID;
        this.username = username;
        this.password = password;
        this.name = name;
        this.cccd = cccd;
        this.tel = tel;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCccd() {
        return cccd;
    }
    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }

}
