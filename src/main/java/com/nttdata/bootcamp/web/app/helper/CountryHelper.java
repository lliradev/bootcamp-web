package com.nttdata.bootcamp.web.app.helper;

import com.nttdata.bootcamp.web.app.domain.CountryResponse;
import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByNameResponse;

import java.util.List;

public interface CountryHelper {

    List<CountryResponse> toResponse(ListOfCountryNamesByNameResponse responseClient);
}
