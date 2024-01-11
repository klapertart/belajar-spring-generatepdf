package com.klaperetart.genereatepdf.entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author tritr
 * @since 1/11/2024
 */
@Data
@Getter
@Setter
public class Customer {
    private String companyName;
    private String contactName;
    private String address;
    private String email;
    private String phone;
}