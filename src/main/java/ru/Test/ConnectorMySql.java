package ru.Test;

import java.sql.*;
@Deprecated
public class ConnectorMySql {
    public static void main(String[] args) throws ClassNotFoundException {
        String userName = "root";
        String password = "root";
        String connectorURL = "jdbc:mysql://localhost:3306/pet_shop?useUnicode=true&serverTimezone=UTC";
        Class.forName("com.mysql.cj.jdbc.Driver");
        try (
                Connection connection = DriverManager.getConnection(connectorURL,userName,password);
                Statement statement = connection.createStatement()
        ){
            ResultSet resultSet = statement.executeQuery("select * from pets;");
            while (resultSet.next()) {
                System.out.println(resultSet.getString(2) + " " + resultSet.getString(3));
            }

        } catch (SQLException  throwables) {
            System.out.println("Connect entity.");
            throwables.printStackTrace();
        } finally {
            System.out.println("Connect close.");
        }
    }
}
