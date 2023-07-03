package com.nttdata.bootcamp.web.app.web.rest;

import com.nttdata.bootcamp.web.app.web.rest.dto.User;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface UserRestClient {

    ResponseEntity<List<User>> findAll();
}
