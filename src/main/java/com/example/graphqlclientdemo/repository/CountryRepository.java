package com.example.graphqlclientdemo.repository;

import com.example.graphqlclientdemo.model.Country;
import org.springframework.data.repository.ListCrudRepository;

public interface CountryRepository extends ListCrudRepository<Country, Integer> {
}
