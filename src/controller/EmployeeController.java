package controller;

import model.Employee;
import utils.FileReader;
import view.EmployeeView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;

public class EmployeeController {
    private static EmployeeController instance;
    private List<Employee> employeeList;
    private final EmployeeView employeeView;
    private Boolean hasUpdated;


    private EmployeeController(){
        employeeList = new ArrayList<>();
        employeeView = new EmployeeView();
        hasUpdated = false;
    };

    public static EmployeeController getInstance() {
        if (instance == null) {
            instance = new EmployeeController();
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
                employeeList.add(new Employee(Integer.parseInt(values[0]), values[1], values[2], values[3]));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private void updateDataTable() {
        String[] headerArray = {"ID", "Tên NV", "Địa chỉ", "Số ĐT"};
        Vector<String> headers = new Vector<>(Arrays.asList(headerArray));
        Vector<Vector<Object>> data = new Vector<>();
        for (Employee e: employeeList) {
            data.add(e.getVectorData());
        }
        this.employeeView.updateTable(headers, data);
    }


    public void display() {
        if (!hasUpdated) {
            updateDataTable();
            hasUpdated = true;
        }
        employeeView.setVisible(true);
    }

    public void hide() {
        employeeView.dispose();
    }

}
