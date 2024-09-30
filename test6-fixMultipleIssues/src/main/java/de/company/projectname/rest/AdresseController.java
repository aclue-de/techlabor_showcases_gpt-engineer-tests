package de.company.projectname.rest;

import de.company.projectname.model.Adresse;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class AdresseController {

    private Map<String, Adresse> adresseDatabase = new HashMap<>();

    @PostMapping("/adresse")
    public Adresse create(@RequestBody Adresse adresse) {
        String uuid = UUID.randomUUID().toString();
        adresseDatabase.put(uuid, adresse);
        return adresse;
    }

    @GetMapping("/adresse/{uuid}")
    public Adresse find(@PathVariable String uuid) {
        return adresseDatabase.get(uuid);
    }

    @PutMapping("/adresse/{uuid}")
    public Adresse update(@PathVariable String uuid, @RequestBody Adresse adresse) {
        adresseDatabase.put(uuid, adresse);
        return adresse;
    }

    @DeleteMapping("/adresse/{uuid}")
    public void delete(@PathVariable String uuid) {
        adresseDatabase.remove(uuid);
    }
}