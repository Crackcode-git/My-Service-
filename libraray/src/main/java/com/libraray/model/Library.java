package com.libraray.model;

import lombok.Data;

import java.util.List;

@Data
public class Library {
    private String name;
    private int rating;
    private String location;
    private int distance;
  //  private List<String> reviews;
    private String phone;
   // private Enquiry enquiry;
}
