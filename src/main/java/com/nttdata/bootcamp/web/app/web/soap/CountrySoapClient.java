package com.nttdata.bootcamp.web.app.web.soap;

import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByNameResponse;

public interface CountrySoapClient {

    ListOfCountryNamesByNameResponse retrieveCountries();
}
