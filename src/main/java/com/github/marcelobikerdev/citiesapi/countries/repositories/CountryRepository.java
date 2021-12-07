package com.github.marcelobikerdev.citiesapi.countries.repositories;

import com.github.marcelobikerdev.citiesapi.countries.entities.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
