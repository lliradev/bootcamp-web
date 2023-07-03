package com.nttdata.bootcamp.web.app.domain;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserResponse {
    private Long userId;
    private String name;
    private String username;
    private String email;
    private String address;
}
