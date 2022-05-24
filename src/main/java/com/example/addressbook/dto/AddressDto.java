package com.example.addressbook.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
public @ToString class AddressDto {


    public int id;
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public String zip;
    public String email;
    public String phone;


}
