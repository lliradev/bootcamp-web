package com.nttdata.bootcamp.web.app.controller;

import com.nttdata.bootcamp.web.app.domain.CountryResponse;
import com.nttdata.bootcamp.web.app.service.CountryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/api")
@RequiredArgsConstructor
public class CountryController {

    private final CountryService countryService;

    @GetMapping("/countries")
    public ResponseEntity<List<CountryResponse>> retrieveCountries() {
        return ResponseEntity.ok(countryService.retrieveCountries());
    }
}
