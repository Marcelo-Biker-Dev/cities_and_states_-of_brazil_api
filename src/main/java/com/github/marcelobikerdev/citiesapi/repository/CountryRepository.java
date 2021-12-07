package com.github.marcelobikerdev.citiesapi.repository;

import com.github.marcelobikerdev.citiesapi.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
