package model;

import java.io.Serializable;
import java.util.ArrayList;

public class PostpaidService implements Serializable {
    private int ID;
    private String name;
    private String note;
    private ArrayList<ServiceProgression> serviceProgression;

    public PostpaidService() {
        super();
        serviceProgression = new ArrayList<ServiceProgression>();
    }

    public PostpaidService(int ID, String name, String note) {
        super();
        this.ID = ID;
        this.name = name;
        this.note = note;
        serviceProgression = new ArrayList<ServiceProgression>();
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
    public ArrayList<ServiceProgression> getServiceProgression() {
        return serviceProgression;
    }
    public void setServiceProgression(ArrayList<ServiceProgression> serviceProgression) {
        this.serviceProgression = serviceProgression;
    }

}
