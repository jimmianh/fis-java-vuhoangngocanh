package com.company.ex2;

public abstract class IXe {
    private int soPhieu;
    private double price;

    public int getSoPhieu() {
        return soPhieu;
    }

    public void setSoPhieu(int soPhieu) {
        this.soPhieu = soPhieu;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public IXe() {
    }

    public IXe(int soPhieu, double price) {
        this.soPhieu = soPhieu;
        this.price = price;
    }
}
