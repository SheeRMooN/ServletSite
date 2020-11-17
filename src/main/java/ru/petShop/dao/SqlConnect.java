package ru.petShop.dao;

public class SqlConnect {
    private static String userName = "root";
    private static String password = "root";
    private static String connectorURL = "jdbc:mysql://localhost:3306/pet_shop?useUnicode=true&serverTimezone=UTC";
    private static String driverDB = "com.mysql.cj.jdbc.Driver";

    public String getDriverDB() {
        return driverDB;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

    public String getConnectorURL() {
        return connectorURL;
    }
}
