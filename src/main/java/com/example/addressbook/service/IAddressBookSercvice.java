package com.example.addressbook.service;

import com.example.addressbook.dto.AddressDto;
import com.example.addressbook.model.AddressBookEntity;

import java.util.List;
import java.util.Optional;

public interface IAddressBookSercvice {

     AddressBookEntity addEmployee(AddressDto addressDto);

     Optional<AddressBookEntity> searchByID(int id);

    Object editData(Integer id, AddressDto addressDto);

    Object getAddress();

    String deleteById(Integer id);

    List<AddressBookEntity> City(String city);
}
