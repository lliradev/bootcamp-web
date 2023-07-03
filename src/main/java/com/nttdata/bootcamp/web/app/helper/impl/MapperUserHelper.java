package com.nttdata.bootcamp.web.app.helper.impl;

import com.nttdata.bootcamp.web.app.domain.UserResponse;
import com.nttdata.bootcamp.web.app.helper.UserHelper;
import com.nttdata.bootcamp.web.app.web.rest.dto.Address;
import com.nttdata.bootcamp.web.app.web.rest.dto.User;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class MapperUserHelper implements UserHelper {

    @Override
    public List<UserResponse> toResponse(List<User> responseClient) {
        return responseClient
            .stream()
            .map(user -> {
                UserResponse response = new UserResponse();
                response.setUserId(user.getId());
                response.setName(user.getName());
                response.setUsername(user.getUsername());
                response.setEmail(user.getEmail());
                Address address = user.getAddress();
                String addressComplete = String.format("%s, %s, %s, %s", address.getStreet(), address.getSuite(),
                    address.getCity(), address.getZipcode());
                response.setAddress(addressComplete);
                return response;
            })
            .collect(Collectors.toList());
    }
}
