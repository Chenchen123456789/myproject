package com.eim.mapper;

import com.eim.entity.Country;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryMapper {
    Country select();
}
