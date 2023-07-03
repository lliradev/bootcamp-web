package com.nttdata.bootcamp.web.app.service.impl;

import com.nttdata.bootcamp.web.app.domain.CountryResponse;
import com.nttdata.bootcamp.web.app.helper.CountryHelper;
import com.nttdata.bootcamp.web.app.service.CountryService;
import com.nttdata.bootcamp.web.app.web.soap.CountrySoapClient;
import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByNameResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinderCountryService implements CountryService {

    @Autowired
    private CountrySoapClient soapClient;

    @Autowired
    private CountryHelper countryHelper;

    @Override
    public List<CountryResponse> retrieveCountries() {
        ListOfCountryNamesByNameResponse responseClient = soapClient.retrieveCountries();
        return countryHelper.toResponse(responseClient);
    }
}
