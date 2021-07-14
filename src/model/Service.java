package model;

import java.util.Arrays;
import java.util.Vector;

public class Service {
    private int id;
    private String name;
    private double price;
    private double rates;
    private String serviceType;

    public Service(int id, String name, double price, double rates, String serviceType) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rates = rates;
        this.serviceType = serviceType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getRates() {
        return rates;
    }

    public void setRates(double rates) {
        this.rates = rates;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public Vector<Object> getVectorData() {
        Object[] data = {id, name, price, rates, serviceType};
        return new Vector<>(Arrays.asList(data));
    }
}
