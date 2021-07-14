import controller.EmployeeController;
import controller.ServiceController;
import view.Menu;

public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu();
        menu.setVisible(true);
        EmployeeController employeeController = EmployeeController.getInstance();
        employeeController.readDataFromFile("NV.txt");
        ServiceController serviceController = ServiceController.getInstance();
        serviceController.readDataFromFile("DV.txt");
    }
}
