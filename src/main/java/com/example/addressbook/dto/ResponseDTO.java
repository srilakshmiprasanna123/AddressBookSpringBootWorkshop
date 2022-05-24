package com.example.addressbook.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ResponseDTO {

    String message;
    Object data;

    public ResponseDTO(String message) {
        this.message = message;
    }

    public ResponseDTO(Object data) {
        this.data = data;
    }
}



