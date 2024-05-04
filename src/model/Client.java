package model;

import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable {
    private int ID;
    private String name;
    private Date dob;
    private String cccd;
    private String tel;
    private String hometown;

    public Client() {
        super();
    }
    public Client(int ID, String name, Date dob, String cccd, String tel, String hometown) {
        super();
        this.ID = ID;
        this.name = name;
        this.dob = dob;
        this.cccd = cccd;
        this.tel = tel;
        this.hometown = hometown;
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
    public Date getDob() {
        return dob;
    }
    public void setDob(Date dob) {
        this.dob = dob;
    }
    public String getCccd() {
        return cccd;
    }
    public void setCccd(String cccd) {
        this.cccd = cccd;
    }
    public String getTel() {
        return tel;
    }
    public void setTel(String tel) {
        this.tel = tel;
    }
    public String getHometown() {
        return hometown;
    }
    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public String showClientInfo(){
        return  "* ID :   " + ID + "\n" +
                "* Name :   " + name + "\n" +
                "* DOB :   " + dob + "\n" +
                "* CCCD :   " + cccd + "\n" +
                "* Tel :   " + tel + "\n" +
                "* Hometown :   " + hometown;
    }

}
