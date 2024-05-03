package model;

import java.io.Serializable;

public class PrepaidService implements Serializable {
    private int ID;
    private String name;
    private String note;
    private int price;

    public PrepaidService() {
        super();
    }
    public PrepaidService(int ID, String name, String note, int price) {
        super();
        this.ID = ID;
        this.name = name;
        this.note = note;
        this.price = price;
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
    public String getNote() {
        return note;
    }
    public void setNote(String note) {
        this.note = note;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }

}
