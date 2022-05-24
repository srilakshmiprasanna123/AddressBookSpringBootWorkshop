package com.example.addressbook.service;

import com.example.addressbook.dto.AddressDto;
import com.example.addressbook.model.AddressBookEntity;

import java.util.Optional;

public interface IAddressBookSercvice {

    public AddressBookEntity addEmployee(AddressDto addressDto);

    public Optional<AddressBookEntity> searchByID(int id);

    Object editData(Integer id, AddressDto addressDto);

    Object getAddress();

    String deleteById(Integer id);
}
