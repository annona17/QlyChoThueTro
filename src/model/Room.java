package model;

import java.io.Serializable;

public class Room implements Serializable{
    private int ID;
    private String name;
    private String type;
    private float price;
    private String description;
    private String status;
    private int elecIndex;
    private int waterIndex;

    public Room() {
        super();
    }

    public Room(int ID, String name, String type, String description, float price, String status, int elecIndex, int waterIndex) {
        super();
        this.ID = ID;
        this.name = name;
        this.type = type;
        this.description = description;
        this.price = price;
        this.status = status;
        this.elecIndex = elecIndex;
        this.waterIndex = waterIndex;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getElecIndex() {
        return elecIndex;
    }
    public void setElecIndex(int elecIndex) {
        this.elecIndex = elecIndex;
    }
    public int getWaterIndex() {
        return waterIndex;
    }
    public void setWaterIndex(int waterIndex) {
        this.waterIndex = waterIndex;
    }
}
