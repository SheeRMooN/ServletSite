package ru.petShop.dao;

import ru.petShop.model.Pet;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class Dao {

    private Connection getConnect() throws SQLException, ClassNotFoundException {
        MySql mySql = new MySql();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection(mySql.getConnectorURL(), mySql.getUserName(), mySql.getPassword());
        return connection;
    }

    public List<Pet> allPet(String pattern) throws SQLException, ClassNotFoundException {
        List<Pet> pet = new LinkedList<>();
        Connection connection = getConnect();
        Statement statement = connection.createStatement();
        String sql = "dasd"; // +pattern
        ResultSet resultSet = statement.executeQuery(sql);
        while (resultSet.next()){

        }

        return pet;
    }
}
