package com.nttdata.bootcamp.web.app.service;

import com.nttdata.bootcamp.web.app.domain.UserResponse;

import java.util.List;

public interface UserService {

    List<UserResponse> retrieveUsers();
}
