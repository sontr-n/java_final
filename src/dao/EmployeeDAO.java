package dao;

import model.Employee;

import javax.swing.plaf.nimbus.State;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO extends BaseDAO<Employee> {


    @Override
    public List<Employee> findAll() {
        String sql = "SELECT * FROM employee";
        List<Employee> employees = new ArrayList<>();
        try {
            Statement stm  = connect().createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return employees;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void addOne(Employee employee) {

    }

    @Override
    public void update(Employee employee) {

    }
}
