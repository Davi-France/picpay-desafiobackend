package com.desafiopicpay.dtos;

import com.desafiopicpay.domain.user.UserType;

import java.math.BigDecimal;

public record UserDTO(String document, String firstName, String lastName, String Document, BigDecimal balance, String email, String password, UserType userType) {

}
