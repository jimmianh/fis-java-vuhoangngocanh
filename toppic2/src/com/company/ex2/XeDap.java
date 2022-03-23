package com.company.ex2;

public class XeDap extends IXe{
    private int soPhieu;
    private double price = 500;

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

    public XeDap() {
    }

    public XeDap(int soPhieu, double price) {
        super(soPhieu, price);
    }
}
