package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public abstract class BaseDAO<T> {

    protected Connection connect() {
        Connection conn = null;
        try {
            String password = "password";
            String user = "postgres";
            String url = "jdbc:postgresql://localhost:5432/test";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println("connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return conn;
    }

    public abstract List<T> findAll();
    public abstract void deleteById(int id);
    public abstract void addOne(T t);
    public abstract void update(T t);
}
