package model;

import java.io.Serializable;
import java.text.SimpleDateFormat;
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
    public String getCreatedDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(createdDate);
    }
    public void setCreatedDate() {
        this.createdDate = new Date();
    }
    public String getPaymentTerm() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(paymentTerm);
    }
    public void setPaymentTerm() {
        // set paymentTerm = ngay 5 cua thang sau trong thang forMonth
        String[] arr = forMonth.split("-");
        int month = Integer.parseInt(arr[0]);
        int year = Integer.parseInt(arr[1]);
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        String str = year + "-" + month + "-05";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        try {
            this.paymentTerm = sdf.parse(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    public String showTotal() {
        return "TotalAmount: " + totalAmount + " VND" +
                "\nCreatedDate: " + createdDate +
                "\nPaymentTerm: " + paymentTerm;

    }

}
