package com.nttdata.bootcamp.web.app.web.soap.impl;

import com.nttdata.bootcamp.web.app.web.soap.CountrySoapClient;
import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByName;
import com.nttdata.bootcamp.web.app.web.soap.ws.country.ListOfCountryNamesByNameResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

public class FinderCountrySoap extends WebServiceGatewaySupport implements CountrySoapClient {

    @Value("${soap.country.action}")
    private String countryAction;

    @Override
    public ListOfCountryNamesByNameResponse retrieveCountries() {
        ListOfCountryNamesByName listOfCountryNamesByName = new ListOfCountryNamesByName();
        return (ListOfCountryNamesByNameResponse) getWebServiceTemplate()
            .marshalSendAndReceive(listOfCountryNamesByName, new SoapActionCallback(countryAction));
    }
}
