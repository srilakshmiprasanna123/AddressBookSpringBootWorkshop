package com.example.addressbook.repository;

import com.example.addressbook.model.AddressBookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface AddressBookRepository extends JpaRepository<AddressBookEntity, Integer> {

    @Query(value = "SELECT * FROM address_book_entity WHERE city =:city",nativeQuery = true)
    List<AddressBookEntity> findByCity(String city);


}
