package com.example.demo.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CountriesSevice {

    @Autowired
    private CountriesRepository countriesRepository;

    public CountriesSevice() {
    }

    @Transactional(readOnly = true)
    public List<Countries> getAllData(){
        return countriesRepository.findAll();
    }

    @Transactional
    public List<Countries> saveCounties(List<Countries> countries){
        List<Countries> countriesList = countriesRepository.saveAll(countries);
        return countriesList;
    }

    @Transactional
    public Countries saveCountries(Countries countries){
        return countriesRepository.save(countries);
    }

    @Transactional(readOnly = true)
    public Optional<Countries> getCountriesById(Long id){
        return countriesRepository.findById(id);
    }

    @Transactional
    public void deleteCountries(Long id){
        countriesRepository.deleteById(id);
    }

}
