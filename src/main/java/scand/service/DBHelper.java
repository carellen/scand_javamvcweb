package scand.service;

import java.sql.*;
import java.util.ResourceBundle;

public class DBHelper {
    public static final String SQL_READ_ALL = "SELECT * FROM employees";
    public static final String SQL_READ_BY_ID = "SELECT * FROM employees WHERE id = ?";
    public static final String SQL_INSERT_ALL =
            "INSERT INTO employees (firstname, lastname, position, department, characteristic) VALUES (?, ?, ?, ?, ?)";
    public static final String SQL_UPDATE =
            "UPDATE employees SET firstname = ?, lastname = ?, position = ?, department = ?, characteristic = ? WHERE id = ?";

    private ResourceBundle bundle = ResourceBundle.getBundle("database");

    private static DBHelper helper;

    private DBHelper(){

    }

    public static DBHelper getInstance() {
        if (helper == null) {
            helper = new DBHelper();
        }
        return helper;
    }

    public ResultSet readAll() throws SQLException {
        return getReadAllPreparedStatement().executeQuery();
    }

    public ResultSet readById(int id) throws SQLException {
        return getByIdPreparedStatement(id).executeQuery();
    }
    public void update(int id, String fName, String lName, String position, String department, String characteristic) throws SQLException {
        getUpdatePreparedStatement(id, fName, lName, position, department, characteristic).executeUpdate();
    }

    private Connection getConnection() throws SQLException {
        String url = bundle.getString("db.url");
        String user = bundle.getString("db.user");
        String pass = bundle.getString("db.password");
        DriverManager.registerDriver(new com.mysql.jdbc.Driver());
        return DriverManager.getConnection(url, user, pass);
    }

    private PreparedStatement getReadAllPreparedStatement() {
        PreparedStatement statement = null;
        try {
            statement = getConnection().prepareStatement(SQL_READ_ALL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
    private PreparedStatement getByIdPreparedStatement(int id) {
        PreparedStatement statement = null;
        try {
            statement = getConnection().prepareStatement(SQL_READ_BY_ID);
            statement.setInt(1, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }
    private PreparedStatement getUpdatePreparedStatement(int id,  String fName, String lName, String position, String department, String characteristic) {
        PreparedStatement statement = null;
        try {
            statement = getConnection().prepareStatement(SQL_UPDATE);
            statement.setString(1, fName);
            statement.setString(2, lName);
            statement.setString(3, position);
            statement.setString(4, department);
            statement.setString(5, characteristic);
            statement.setInt(6, id);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return statement;
    }


}
