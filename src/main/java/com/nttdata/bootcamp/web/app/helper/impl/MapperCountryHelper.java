package com.nttdata.bootcamp.web.app.helper.impl;

import com.nttdata.bootcamp.web.app.domain.CountryResponse;
import com.nttdata.bootcamp.web.app.helper.CountryHelper;
import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByNameResponse;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperCountryHelper implements CountryHelper {

    @Override
    public List<CountryResponse> toResponse(ListOfCountryNamesByNameResponse responseClient) {
        return responseClient
            .getListOfCountryNamesByNameResult()
            .getTCountryCodeAndName()
            .stream()
            .map(tCountryCodeAndName -> {
                CountryResponse response = new CountryResponse();
                response.setCode(tCountryCodeAndName.getSISOCode());
                response.setName(tCountryCodeAndName.getSName());
                return response;
            })
            .collect(Collectors.toList());
    }
}
