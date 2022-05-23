package com.example.addressbook.controller;

import com.example.addressbook.model.AddressBookEntity;
import com.example.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/addressbook")

public class AddressBookController {

    @Autowired
    AddressBookRepository repository;

    @GetMapping("/hello")
    public String getMessage() {
        return "Welcome to Addressbook App";
    }

    @PostMapping("/add-data")
    public AddressBookEntity PostAddress(@RequestBody AddressBookEntity addressBook){
        AddressBookEntity newAddressBook = new AddressBookEntity(addressBook);
        repository.save(newAddressBook);
        return newAddressBook;
    }

    @GetMapping("/get/{id}")
    public AddressBookEntity getAddressById(@PathVariable Integer id) {
        Optional<AddressBookEntity> addressBook = repository.findById(id);
        return addressBook.get();
    }

    @GetMapping("/get-all")
    public List<AddressBookEntity> getAddress(){
        List<AddressBookEntity> addressBook = repository.findAll();
        return addressBook;
    }

    @PutMapping("/edit/{id}")
    public AddressBookEntity   editData( @PathVariable Integer id, @RequestBody AddressBookEntity addressBook) {
        AddressBookEntity newAddressBook = new AddressBookEntity(addressBook);
        return newAddressBook;
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Integer id){
        repository.deleteById(id);
        return "Address of id:" + id + " has been deleted";
    }
}
