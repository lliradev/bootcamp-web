package com.nttdata.bootcamp.web.app.config;

import com.nttdata.bootcamp.web.app.web.soap.impl.FinderCountrySoap;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapClientConfig {

    @Value("${soap.country.uri}")
    private String countryUri;

    @Bean
    public Jaxb2Marshaller marshaller() {
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPaths("com.nttdata.bootcamp.web.app.web.soap.ws.country");
        return marshaller;
    }

    @Bean
    public FinderCountrySoap finderCountrySoap(Jaxb2Marshaller marshaller) {
        FinderCountrySoap client = new FinderCountrySoap();
        client.setDefaultUri(countryUri);
        client.setMarshaller(marshaller);
        client.setUnmarshaller(marshaller);
        return client;
    }
}
