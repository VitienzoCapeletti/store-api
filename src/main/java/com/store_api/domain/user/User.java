package com.store_api.domain.user;

import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Table(name = "users")
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String firstName;
    private String lastName;
    @Column(unique = true)
    private String document;
    @Column(unique = true)
    private String email;
    private BigDecimal balance;
    @Enumerated(EnumType.STRING)
    private UserType userType;

}
