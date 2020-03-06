package com.example.eurekaclient;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(builderMethodName = "builder")
@NoArgsConstructor
@AllArgsConstructor
public class Customer {

    private String id;
    private String name;
    private String company;
    private LocalDate birthdate;
}