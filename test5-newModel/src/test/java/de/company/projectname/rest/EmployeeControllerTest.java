package de.company.projectname.rest;

import de.company.projectname.model.Employee;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

import java.util.UUID;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.hamcrest.Matchers.is;

@WebMvcTest(EmployeeController.class)
public class EmployeeControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void shouldReturnMockedEmployee() throws Exception {
        UUID uuid = UUID.randomUUID();
        this.mockMvc.perform(get("/employee/" + uuid.toString()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.uuid", is(uuid.toString())))
                .andExpect(jsonPath("$.firstname", is("John")))
                .andExpect(jsonPath("$.lastname", is("Doe")));
    }
}