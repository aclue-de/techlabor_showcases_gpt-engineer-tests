package de.company.projectname.rest;

import de.company.projectname.model.Bank;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@RestController
public class BankController {

    private Map<String, Bank> bankDatabase = new HashMap<>();

    @PostMapping("/bank")
    public Bank create(@RequestBody Bank bank) {
        String uuid = UUID.randomUUID().toString();
        bankDatabase.put(uuid, bank);
        return bank;
    }

    @GetMapping("/bank/{uuid}")
    public Bank find(@PathVariable String uuid) {
        return bankDatabase.get(uuid);
    }

    @PutMapping("/bank/{uuid}")
    public Bank update(@PathVariable String uuid, @RequestBody Bank bank) {
        bankDatabase.put(uuid, bank);
        return bank;
    }

    @DeleteMapping("/bank/{uuid}")
    public void delete(@PathVariable String uuid) {
        bankDatabase.remove(uuid);
    }
}