package ru.petShop.dao;

public class MySql {
    private static String userName = "root";
    private static String password = "root";
    private static String connectorURL = "jdbc:mysql://localhost:3306/pet_shop?useUnicode=true&serverTimezone=UTC";

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
