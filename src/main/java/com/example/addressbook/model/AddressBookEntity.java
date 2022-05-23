package com.example.addressbook.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}