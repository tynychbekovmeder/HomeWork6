package org.example.service;

import org.example.dao.Cities;
import org.example.dao.CitiesDao;
import org.example.dao.CitiesDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class CitiesServiceImpl implements CitiesService{
    CitiesDao citiesDao = new CitiesDaoImpl();
    @Override
    public List<Cities> listForCities(List<Cities> list) throws SQLException {
        citiesDao.listForCities(list);
        return list;
    }
}
