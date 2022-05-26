package com.example.addressbook.model;

import com.example.addressbook.dto.AddressDto;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
@NoArgsConstructor
public  class  AddressBookEntity {
      @Id
      @GeneratedValue
    public int id;
    public String firstName;
    public String lastName;
    public String city;
    public String state;
    public String zip;
    public String email;
    public String phone;



    public AddressBookEntity(AddressBookEntity addressBookEntity) {

        this.firstName = addressBookEntity.firstName;
        this.lastName = addressBookEntity.lastName;
        this.city = addressBookEntity.city;
        this.state = addressBookEntity.state;
        this.zip = addressBookEntity.zip;
        this.email = addressBookEntity.email;
        this.phone = addressBookEntity.phone;
    }

    public AddressBookEntity(AddressDto addressDto) {

        this.firstName = addressDto.firstName;
        this.lastName = addressDto.lastName;
        this.city = addressDto.city;
        this.state = addressDto.state;
        this.zip = addressDto.zip;
        this.email = addressDto.email;
        this.phone = addressDto.phone;
    }

    public AddressBookEntity(Integer id, AddressDto addressDto) {
        this.id = id;
        this.firstName = addressDto.firstName;
        this.lastName = addressDto.lastName;
        this.city = addressDto.city;
        this.state = addressDto.state;
        this.zip = addressDto.zip;
        this.email = addressDto.email;
        this.phone = addressDto.phone;
    }

    public AddressBookEntity(Integer id) {
        this.id=id;
    }


}