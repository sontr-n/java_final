package dao;

import model.Employee;
import model.Service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ServiceDAO extends BaseDAO<Service> {
    @Override
    public List<Service> findAll() {
        String sql = "SELECT * FROM service";
        List<Service> services = new ArrayList<>();
        try {
            Statement stm = connect().createStatement();
            ResultSet resultSet = stm.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return services;
    }

    @Override
    public void deleteById(int id) {

    }

    @Override
    public void addOne(Service service) {

    }

    @Override
    public void update(Service service) {

    }
}
