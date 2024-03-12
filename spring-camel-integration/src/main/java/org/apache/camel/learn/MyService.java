package org.apache.camel.learn;

import org.apache.camel.ProducerTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

    @Autowired
    private ProducerTemplate template;

    @PostMapping(value = "/createperson")
    public String createPerson(@RequestBody Persona persona) {
        return template.requestBody("direct:crearPersona", persona).toString();
    }

}
