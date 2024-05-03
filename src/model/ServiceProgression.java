package model;

import java.io.Serializable;

public class ServiceProgression implements Serializable {
    private int ID;
    private int step;
    private int fromIndex;
    private int toIndex;
    private float price;

    public ServiceProgression() {
        super();
    }

    public ServiceProgression(int ID, int step, int fromIndex, int toIndex, float price) {
        super();
        this.ID = ID;
        this.step = step;
        this.fromIndex = fromIndex;
        this.toIndex = toIndex;
        this.price = price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getStep() {
        return step;
    }

    public void setStep(int step) {
        this.step = step;
    }

    public int getFromIndex() {
        return this.fromIndex;
    }

    public void setFromIndex(int fromIndex) {
        this.fromIndex = fromIndex;
    }

    public int getToIndex() {
        return toIndex;
    }

    public void setToIndex(int toIndex) {
        this.toIndex = toIndex;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
