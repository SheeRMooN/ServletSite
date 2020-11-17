package ru.petShop.dao;

import ru.petShop.exception.DaoException;
import ru.petShop.model.Pet;

import java.util.List;

public interface DictionaryDao {
    List<Pet> allPet() throws DaoException;
}
