package org.example.service;

import org.example.dao.Country;
import org.example.dao.CountryDao;
import org.example.dao.CountryDaoImpl;

import java.sql.SQLException;
import java.util.List;

public class CountryServiceImpl implements CountryService{
        CountryDao countryDao = new CountryDaoImpl();
    @Override
    public List<Country> listForCountry(List<Country> list) throws SQLException {
        countryDao.listForCountry(list);
        return list;
    }
}
