package com.example.demo.countries;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/countries")
public class CountriesController {

    @Autowired
    private CountriesSevice countriesSevice;

    @GetMapping
    public ResponseEntity<List<Countries>> findAll(){
        List<Countries> countries = countriesSevice.getAllData();
        return new ResponseEntity<>(countries,HttpStatus.OK);
    }

    @GetMapping("{id}")
    public ResponseEntity<Optional<Countries>> getCountries(@PathVariable Long id){
        Optional<Countries> countries = countriesSevice.getCountriesById(id);
        return new ResponseEntity<>(countries,HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Countries> saveCountries(@RequestBody Countries countries){
        countries.setId(null);
        countriesSevice.saveCountries(countries);
        return new ResponseEntity<>(countries,HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<Countries> updateCountries(@RequestBody Countries countries){
        countriesSevice.saveCountries(countries);
        return new ResponseEntity<>(countries,HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Countries> deleteCountries(@PathVariable Long id){
        Optional<Countries> countries = countriesSevice.getCountriesById(id);
        if(countries.isPresent()){
            countriesSevice.deleteCountries(id);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
