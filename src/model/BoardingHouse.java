package model;

import java.io.Serializable;

public class BoardingHouse implements Serializable {
    private int ID;
    private String name;
    private String address;
    private String description;

    public BoardingHouse() {
        super();
    }

    public BoardingHouse(int ID, String name, String address, String tel, String email, String description, String image) {
        super();
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.description = description;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
