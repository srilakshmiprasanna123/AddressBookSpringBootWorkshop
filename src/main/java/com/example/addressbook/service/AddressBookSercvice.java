package com.example.addressbook.service;

import com.example.addressbook.dto.AddressDto;
import com.example.addressbook.model.AddressBookEntity;
import com.example.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AddressBookSercvice implements IAddressBookSercvice{

    @Autowired
    AddressBookRepository addressBookRepository;

    public AddressBookEntity addEmployee(AddressDto addressDto) {
        AddressBookEntity addressBook = new AddressBookEntity(addressDto);
        return addressBookRepository.save(addressBook);
    }

     public Optional<AddressBookEntity> searchByID(int id) {
        return  addressBookRepository.findById(id);
    }

    @Override
    public Object editData(Integer id, AddressDto addressDto) {
        if (addressBookRepository.findById(id).isPresent()) {
            AddressBookEntity addressBook = new AddressBookEntity(id, addressDto);
            AddressBookEntity alpha = addressBookRepository.save(addressBook);
            return "This is the result"+ alpha;
        }
        return null;
    }



    @Override
    public String deleteById(Integer id) {
        Optional<AddressBookEntity> newEmployee = addressBookRepository.findById(id);
        if (newEmployee.isPresent()) {
            addressBookRepository.delete(newEmployee.get());
            return  "Record is deleted with id" + id;
        }
        return null;


    }

    public List<AddressBookEntity> getAddress() {
        return addressBookRepository.findAll();
    }




}
