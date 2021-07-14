package model;

import java.util.Map;

public class SalesHistory {
    private Employee employee;
    private Map<Service, Integer> sales;
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Map<Service, Integer> getSales() {
        return sales;
    }

    public void setSales(Map<Service, Integer> sales) {
        this.sales = sales;
    }
}
