package com.github.viniciusbs88.citiesapi.countries.repository;

import com.github.viniciusbs88.citiesapi.countries.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}
