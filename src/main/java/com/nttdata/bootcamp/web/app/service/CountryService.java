package com.nttdata.bootcamp.web.app.service;

import com.nttdata.bootcamp.web.app.domain.CountryResponse;

import java.util.List;

public interface CountryService {

    List<CountryResponse> retrieveCountries();
}
