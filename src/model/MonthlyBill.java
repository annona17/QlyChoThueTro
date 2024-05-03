package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

public class MonthlyBill implements Serializable {
    private int ID;
    private String forMonth;
    private float totalAmount;
    private Date createdDate;
    private Date paymentTerm;
    private RentedRoom rentedRoom;
    private Host host;
    private Client client;

    public MonthlyBill() {
        super();

    }
    public MonthlyBill(String forMonth, float totalAmount, Date createdDate, Date paymentTerm, RentedRoom rentedRoom, Host host, Client client) {
        super();
        this.forMonth = forMonth;
        this.totalAmount = totalAmount;
        this.createdDate = createdDate;
        this.paymentTerm = paymentTerm;
        this.rentedRoom = rentedRoom;
        this.host = host;
        this.client = client;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public String getForMonth() {
        return forMonth;
    }
    public void setForMonth(String forMonth) {
        this.forMonth = forMonth;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount() {
        float sum = 0;
        // sum = price of rentedRoom + totalAmount of usedPostpaidService + totalAmount of registerPrepaidService + debt of rentedRoom
        sum = rentedRoom.getPrice() + rentedRoom.getDebt();
        for (UsedPostpaidService ups : rentedRoom.getLstUPS()) {
            sum += ups.getTotalAmount();
        }
        for (RegisterPrepaidService rps : rentedRoom.getLstRPS()) {
            sum += rps.getTotalAmount();
        }
        this.totalAmount = sum;
    }
    public Date getCreatedDate() {
        return createdDate;
    }
    public void setCreatedDate() {
        // set createdDate = current date
        this.createdDate = new Date();

    }
    public Date getPaymentTerm() {
        return paymentTerm;
    }
    public void setPaymentTerm() {
        // set paymentTerm = ngay 5 cua thang sau trong thang forMonth
        String[] arr = forMonth.split("-");
        int month = Integer.parseInt(arr[1]);
        int year = Integer.parseInt(arr[0]);
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        this.paymentTerm = new Date(year, month, 5);
    }
    public RentedRoom getRentedRoom() {
        return rentedRoom;
    }
    public void setRentedRoom(RentedRoom rentedRoom) {
        this.rentedRoom = rentedRoom;
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


}
