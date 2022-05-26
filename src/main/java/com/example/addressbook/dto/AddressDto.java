package com.example.addressbook.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;


@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {


    public int id;

   @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee name is not valid")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1}[a-zA-Z\\s]{2,}$", message = "Employee lastName Invalid")
    public String lastName;
    public String city;
    public String state;
    @Pattern(regexp = "^[0-9]{6}$", message = "Invalid Zip Number.Try Again")
    public String zip;
    @Email(message = "Enter the email as null")
    public String email;

    @NotNull(message = "Please Enter the mobile number.....")
    public String phone;


}
