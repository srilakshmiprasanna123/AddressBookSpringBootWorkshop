package com.example.addressbook.repository;

import com.example.addressbook.model.AddressBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressBookRepository extends JpaRepository<AddressBookEntity, Integer> {

}
