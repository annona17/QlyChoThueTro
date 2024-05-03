package model;

import java.io.Serializable;
import java.sql.Date;
import java.util.ArrayList;

public class Contract implements Serializable {
    private int ID;
    private Date creaDate;
    private Host host;
    private Client client;
    private RentedRoom rentedRoom;

    public Contract() {
        super();
        rentedRoom = new RentedRoom();
    }
    public Contract(Host host, Client client, Date creaDate, RentedRoom rentedRoom) {
        super();
        this.creaDate = creaDate;
        this.host = host;
        this.client = client;
        this.rentedRoom = rentedRoom;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Date getCreaDate() {
        return creaDate;
    }
    public void setCreaDate(Date creaDate) {
        this.creaDate = creaDate;
    }
    public Host getHost() {
        return host;
    }
    public void setHost(Host host) {
        this.host = host;
    }
    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public RentedRoom getRentedRoom() {
        return rentedRoom;
    }
    public void setRentedRoom(RentedRoom rentedRoom) {
        this.rentedRoom = rentedRoom;
    }
}
