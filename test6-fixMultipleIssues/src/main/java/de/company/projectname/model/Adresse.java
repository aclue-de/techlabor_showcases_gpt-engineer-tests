package de.company.projectname.model;

import lombok.Data;

@Data
public class Adresse {
    private String straße;
    private String hausnummer;
    private String postleitzahl;
    private String ort;
    private String land;
}