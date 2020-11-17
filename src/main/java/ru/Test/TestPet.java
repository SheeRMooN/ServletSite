package ru.Test;

import ru.petShop.dao.DictionaryDao;
import ru.petShop.dao.DictionaryDaoImpl;
import ru.petShop.exception.DaoException;
import ru.petShop.model.Pet;

import java.util.LinkedList;
import java.util.List;

public class TestPet {
    public static void main(String[] args) throws DaoException {
        List<Pet> pets = new LinkedList<>();
        DictionaryDaoImpl dao = new DictionaryDaoImpl();
        pets = dao.allPet();

        for (Pet pet : pets){
            System.out.println(pet);
        }
        System.out.println(pets.isEmpty());
    }
}
