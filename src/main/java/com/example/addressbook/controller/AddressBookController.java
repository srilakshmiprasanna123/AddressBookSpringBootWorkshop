package com.example.addressbook.controller;

import com.example.addressbook.dto.AddressDto;
import com.example.addressbook.dto.ResponseDTO;
import com.example.addressbook.model.AddressBookEntity;
import com.example.addressbook.repository.AddressBookRepository;
import com.example.addressbook.service.AddressBookSercvice;
import com.example.addressbook.service.IAddressBookSercvice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/addressbook")

public class AddressBookController {

    @Autowired
    IAddressBookSercvice iAddressBookSercvice;

    @GetMapping("/hello")
    public String getMessage() {
        return "Welcome to Address-book App";
    }

    @PostMapping("/add")

    public  ResponseEntity<ResponseDTO> PostAddress(  @Valid @RequestBody AddressDto addressDto){

     ResponseDTO responseDTO = new ResponseDTO("Employee Created Successfully", iAddressBookSercvice.addEmployee(addressDto));
      return new ResponseEntity<>(responseDTO, HttpStatus.CREATED);
    }

    @GetMapping("/get/{id}")
    public ResponseEntity<ResponseDTO> getAddressById(@PathVariable int id){
        ResponseDTO responseDTO = new ResponseDTO("Employee id  Successfully", iAddressBookSercvice.searchByID(id));

        
        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @GetMapping("/get-all")
    public ResponseEntity<ResponseDTO> getAddress() {
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", iAddressBookSercvice.getAddress());

        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @PutMapping("/edit/{id}")
    public ResponseEntity<ResponseDTO>   editData( @Valid @PathVariable Integer id, @RequestBody AddressDto addressDto) {
        ResponseDTO responseDTO = new ResponseDTO("Getting all the record..", iAddressBookSercvice.editData(id, addressDto));

        return new ResponseEntity<ResponseDTO>(responseDTO,HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteAddress(@PathVariable Integer id){
        iAddressBookSercvice.deleteById(id);
        return "Address of id:" + id + " has been deleted";
    }
}
