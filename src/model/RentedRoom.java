package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class RentedRoom implements Serializable {
    private int ID;
    private Room room;
    private float price;
    private Date startDateRent;
    private Date endDateRent;
    private float deposit;
    private float debt;
    private ArrayList<UsedPostpaidService> lstUPS;
    private ArrayList<RegisterPrepaidService> lstRPS;

    public RentedRoom() {
        super();
        lstUPS = new ArrayList<UsedPostpaidService>();
        lstRPS = new ArrayList<RegisterPrepaidService>();
    }
    public RentedRoom(Room room, float price, Date startDateRent, Date endDateRent, float deposit, float debt, ArrayList<UsedPostpaidService> usedPostpaidService, ArrayList<RegisterPrepaidService> registerPrepaidService) {
        super();
        this.room = room;
        this.price = price;
        this.startDateRent = startDateRent;
        this.endDateRent = endDateRent;
        this.deposit = deposit;
        this.debt = debt;
        this.lstUPS = usedPostpaidService;
        this.lstRPS = registerPrepaidService;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public Room getRoom() {
        return room;
    }
    public void setRoom(Room room) {
        this.room = room;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public Date getStartDateRent() {
        return startDateRent;
    }
    public void setStartDateRent(Date startDateRent) {
        this.startDateRent = startDateRent;
    }
    public Date getEndDateRent() {
        return endDateRent;
    }
    public void setEndDateRent(Date endDateRent) {
        this.endDateRent = endDateRent;
    }
    public float getDeposit() {
        return deposit;
    }
    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }
    public float getDebt() {
        return debt;
    }
    public void setDebt(float debt) {
        this.debt = debt;
    }

    public ArrayList<UsedPostpaidService> getLstUPS() {
        return lstUPS;
    }

    public void setLstUPS(ArrayList<UsedPostpaidService> lstUPS) {
        this.lstUPS = lstUPS;
    }

    public ArrayList<RegisterPrepaidService> getLstRPS() {
        return lstRPS;
    }

    public void setLstRPS(ArrayList<RegisterPrepaidService> lstRPS) {
        this.lstRPS = lstRPS;
    }
}
