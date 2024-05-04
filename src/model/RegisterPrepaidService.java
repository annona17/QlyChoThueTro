package model;

import java.io.Serializable;

public class RegisterPrepaidService implements Serializable {
    private int ID;
    private int quantity;
    private int totalAmount;
    private PrepaidService prepaidService;

    public RegisterPrepaidService() {
        super();
    }

    public RegisterPrepaidService(int ID, int quantity, int totalAmount, PrepaidService prepaidService) {
        super();
        this.ID = ID;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.prepaidService = prepaidService;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount() {
        this.totalAmount = this.quantity * prepaidService.getPrice();
    }

    public PrepaidService getPrepaidService() {
        return prepaidService;
    }

    public void setPrepaidService(PrepaidService prepaidService) {
        this.prepaidService = prepaidService;
    }
    public String showRegisterPrepaidService() {
        return prepaidService.getName() + ": " + prepaidService.getPrice() + " x " + quantity + " = " + totalAmount;
    }
}
