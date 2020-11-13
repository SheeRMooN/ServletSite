package ru.petShop.controller;

import java.sql.*;

public class ConnectorMySql {
    public static void main(String[] args) {
        String userName = "root";
        String password = "root";
        String connectorURL = "jdbc:mysql://localhost:3306/pet_shop?useUnicode=true&serverTimezone=UTC";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(connectorURL,userName,password);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.getResultSet();






            connection.close();
        } catch (SQLException | ClassNotFoundException throwables) {
            System.out.println("Connect entity.");
            throwables.printStackTrace();
        } finally {
            System.out.println("Connect close.");
        }
    }
}
