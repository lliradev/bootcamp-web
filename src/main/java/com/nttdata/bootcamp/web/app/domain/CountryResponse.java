package com.nttdata.bootcamp.web.app.domain;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CountryResponse implements Serializable {
    private static final long serialVersionUID = -6578289073122162692L;
    private String code;
    private String name;
}
