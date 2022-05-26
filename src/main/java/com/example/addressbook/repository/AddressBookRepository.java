package com.example.addressbook.repository;

import com.example.addressbook.model.AddressBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<AddressBookEntity, Integer> {
}
