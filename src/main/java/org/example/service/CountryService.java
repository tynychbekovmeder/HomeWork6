package org.example.service;

import org.example.dao.Country;

import java.sql.SQLException;
import java.util.List;

public interface CountryService {
    List<Country> listForCountry(List<Country> list) throws SQLException;

}
