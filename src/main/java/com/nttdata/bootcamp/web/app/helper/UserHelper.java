package com.nttdata.bootcamp.web.app.helper;

import com.nttdata.bootcamp.web.app.domain.UserResponse;
import com.nttdata.bootcamp.web.app.web.rest.dto.User;

import java.util.List;

public interface UserHelper {

    List<UserResponse> toResponse(List<User> responseClient);
}
