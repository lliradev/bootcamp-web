package com.nttdata.bootcamp.web.app.web.rest.impl;

import com.nttdata.bootcamp.web.app.web.rest.UserRestClient;
import com.nttdata.bootcamp.web.app.web.rest.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.List;

@Component
public class UserRestClientImpl implements UserRestClient {

    @Value("${rest.baseUrl}")
    private String baseUrl;

    @Value("${rest.users}")
    private String userUrl;

    @Autowired
    @Qualifier("restTemplate")
    private RestTemplate restTemplate;

    @Override
    public ResponseEntity<List<User>> findAll() {
        HttpEntity<?> requestEntity = HttpEntity.EMPTY;
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(baseUrl).path(userUrl);
        return restTemplate.exchange(builder.toUriString(), HttpMethod.GET, requestEntity,
            new ParameterizedTypeReference<List<User>>() {
            });
    }
}
