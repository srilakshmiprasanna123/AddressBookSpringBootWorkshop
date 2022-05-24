package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressDto;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressBookEntity;
import com.example.addressbook.repository.AddressBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/addressbook")

public class AddressBookController {

    @Autowired
    AddressBookRepository repository;

    @GetMapping("/hello")
    public String getMessage() {
        return "Welcome to Addressbook App";
    }

    @PostMapping("/add")
    public  ResponseEntity<ResponseDTO> PostAddress(@RequestBody AddressDto addressDto){
        AddressBookEntity addressBook = new AddressBookEntity(addressDto);
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", repository.save(addressBook));
        return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressById(@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", repository.findById(id));
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<ResponseDTO> getAddress() {
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", repository.findAll());
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO>   editData( @PathVariable Integer id, @RequestBody AddressDto addressDto) {
         AddressBookEntity addressBookEntity = new AddressBookEntity(id, addressDto);
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", repository.save(addressBookEntity));
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Integer id){
        repository.deleteById(id);
        return "Address of id:" + id + " has been deleted";
    }
}
