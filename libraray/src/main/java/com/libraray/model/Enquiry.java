package com.libraray.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Enquiry {

    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String address;
    private LocalDateTime availabeTime;

}
