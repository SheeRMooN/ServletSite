package ru.petShop.dao;

import java.sql.*;

public class ConnectorMySql {
    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "root";
        String connectorURL = "jdbc:mysql://localhost:3306/pet_shop?useUnicode=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
                Connection connection = DriverManager.getConnection(connectorURL,userName,password);
                Statement statement = connection.createStatement();
        ){
            statement.execute("");


        } catch (SQLException  throwables) {
            System.out.println("Connect entity.");
            throwables.printStackTrace();
        } finally {
            System.out.println("Connect close.");
        }
    }
}
