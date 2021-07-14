package controller;

import model.Employee;
import model.Service;
import utils.FileReader;
import view.ServiceView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class ServiceController {
    private static ServiceController instance;
    private List<Service> serviceList;
    private ServiceView serviceView;
    private Boolean hasUpdated;

    private ServiceController() {
        serviceList = new ArrayList<>();
        serviceView = new ServiceView();
        hasUpdated = false;
    }

    public static ServiceController getInstance() {
        if (instance == null) {
            instance = new ServiceController();
        }

        return instance;
    }

    public void readDataFromFile(String pathname) {
        hasUpdated = false;
        List<String> data = FileReader.read(pathname);
        for (String s : data) {
            try {
                String[] values = s.split(";");
                if (values[0].length() != 4) {
                    throw new Exception("ID không hợp lệ");
                }
                serviceList.add(new Service(Integer.parseInt(values[0]),
                        values[1], Double.parseDouble(values[2]),
                        Double.parseDouble(values[3]),
                        values[4])
                );
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void updateDataTable() {
        String[] headerArray = {"ID", "Tên DV", "Gía", "Giá cước", "Loại DV"};
        Vector<String> headers = new Vector<>(Arrays.asList(headerArray));
        Vector<Vector<Object>> data = new Vector<>();
        for (Service e : serviceList) {
            data.add(e.getVectorData());
        }
        this.serviceView.updateTable(headers, data);
    }


    public void display() {
        if (!hasUpdated) {
            updateDataTable();
            hasUpdated = true;
        }
        serviceView.setVisible(true);
    }

    public void hide() {
        serviceView.dispose();
    }

}
