package com.nttdata.bootcamp.web.app.service.impl;

import com.nttdata.bootcamp.web.app.domain.UserResponse;
import com.nttdata.bootcamp.web.app.helper.UserHelper;
import com.nttdata.bootcamp.web.app.service.UserService;
import com.nttdata.bootcamp.web.app.web.rest.UserRestClient;
import com.nttdata.bootcamp.web.app.web.rest.dto.User;
import com.nttdata.bootcamp.web.common.app.util.JsonMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class FinderUserService implements UserService {

    private final UserHelper userHelper;

    private final UserRestClient restClient;

    @Override
    public List<UserResponse> retrieveUsers() {
        ResponseEntity<List<User>> responseClient = restClient.findAll();
        if (!responseClient.hasBody() || responseClient.getBody().isEmpty())
            return Collections.emptyList();
        List<User> users = responseClient.getBody();
        JsonMapper.printValueToJson(users);
        return userHelper.toResponse(users);
    }
}
