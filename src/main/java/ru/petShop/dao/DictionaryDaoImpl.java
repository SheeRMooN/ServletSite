package ru.petShop.dao;

import ru.petShop.exception.DaoException;
import ru.petShop.model.Pet;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class DictionaryDaoImpl implements DictionaryDao {

    public DictionaryDaoImpl() {
    }

    private Connection getConnect() throws SQLException, ClassNotFoundException {
        SqlConnect mySql = new SqlConnect();
        Class.forName(mySql.getDriverDB());
        Connection connection = DriverManager.getConnection(mySql.getConnectorURL(), mySql.getUserName(), mySql.getPassword());
        System.out.println("Create connection. " + mySql.getConnectorURL() + " : " + mySql.getDriverDB() + " : " + mySql.getPassword() + " : " + mySql.getUserName() );
        return connection;
    }

    public List<Pet> allPet() throws DaoException {
        List<Pet> petList = new LinkedList<>();

        try (Connection connection = getConnect()) {
            Statement statement = connection.createStatement();
            String sql = "SELECT name_pet, kind, breed, color, gender FROM pets;";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                petList.add(new Pet(resultSet.getString("name_pet"),
                        resultSet.getString("kind"),
                        resultSet.getString("breed"),
                        resultSet.getString("color"),
                        resultSet.getString("gender")));
            }
//            while (resultSet.next()){
//                System.out.println(resultSet.getString("name_pet"));
//            }
        } catch (SQLException | ClassNotFoundException exeption) {
            throw new DaoException(exeption);
        }
        return petList;
    }
}
