package de.company.projectname.model;

import lombok.Data;

@Data
public class Bank {
    private String iban;
    private String bic;
    private int account;
}