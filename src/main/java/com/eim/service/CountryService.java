package com.eim.service;

import com.eim.entity.Country;
import com.eim.mapper.CountryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryService {

    @Autowired
    CountryMapper countryMapper;

    public Country select(){
        return countryMapper.select();
    }
}
