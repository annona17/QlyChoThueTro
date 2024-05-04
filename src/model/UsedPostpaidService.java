package model;

import java.io.Serializable;

public class UsedPostpaidService implements Serializable {
    private int ID;
    private int oldIndex;
    private int newIndex;
    private String forMonth;
    private int quantity;
    private float totalAmount;
    private PostpaidService postpaidService;

    public UsedPostpaidService() {
        super();
    }
    public UsedPostpaidService(int ID, int oldIndex, int newIndex, String forMonth, int quantity, float totalAmount, PostpaidService postpaidService) {
        super();
        this.ID = ID;
        this.oldIndex = oldIndex;
        this.newIndex = newIndex;
        this.forMonth = forMonth;
        this.quantity = quantity;
        this.totalAmount = totalAmount;
        this.postpaidService = postpaidService;
    }

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getOldIndex() {
        return oldIndex;
    }
    public void setOldIndex(int oldIndex) {
        this.oldIndex = oldIndex;
    }
    public int getNewIndex() {
        return newIndex;
    }
    public void setNewIndex(int newIndex) {
        this.newIndex = newIndex;
    }
    public String getForMonth() {
        return forMonth;
    }
    public void setForMonth(String forMonth) {
        this.forMonth = forMonth;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity() {
        this.quantity = this.newIndex - this.oldIndex;
    }
    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount() {
        float sum = 0;
        for (ServiceProgression sp : postpaidService.getServiceProgression()) {
            if (quantity >= sp.getToIndex()) {
                sum += (sp.getToIndex()- sp.getFromIndex() +1) * sp.getPrice();
            }else if (quantity >= sp.getFromIndex() && quantity < sp.getToIndex()) {
                sum += (quantity - sp.getFromIndex() + 1) * sp.getPrice();
            }else {
                break;
            }
        }
        this.totalAmount = sum;
    }
    public PostpaidService getPostpaidService() {
        return postpaidService;
    }
    public void setPostpaidService(PostpaidService postpaidService) {
        this.postpaidService = postpaidService;
    }
    public String showUsedPostpaidService(){
        String s = "";
        s += "  Old Index: " + oldIndex + ",   " +  "New Index: " + newIndex + ",   " + "Quantity: " + quantity + "\n";
        int i = 1;
        for (ServiceProgression sp : postpaidService.getServiceProgression()) {
            if (quantity >= sp.getToIndex()) {
                s += "      + Step " + i + " (" + sp.getFromIndex() + " - " + sp.getToIndex() + "): " +
                        sp.getPrice() + " x " + (sp.getToIndex()- sp.getFromIndex() + 1)  + " = " +
                        (sp.getToIndex()- sp.getFromIndex()) * sp.getPrice() + "\n";
            }else if (quantity >= sp.getFromIndex() && quantity < sp.getToIndex()) {
                s += "      + Step " + i + " ("+ sp.getFromIndex() + " - " + sp.getToIndex() + "): " +
                        sp.getPrice() + " x " + (quantity - sp.getFromIndex() + 1) + " = " +
                        (quantity - sp.getFromIndex()) * sp.getPrice() + "\n";
            }else {
                s += "      + Step " + i + " (" + sp.getFromIndex() + " - " + sp.getToIndex() + "): " +
                        sp.getPrice() + " x " + 0 + " = " + 0 + "\n";
            }
            i++;
        }
        s += " => Total amount: " + totalAmount + "\n";
        return s;
    }
}
