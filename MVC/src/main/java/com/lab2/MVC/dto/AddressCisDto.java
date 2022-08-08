package com.lab2.MVC.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AddressCisDto {
        private String addressName ;
        private String country ;
        private String zipCode ;
}
