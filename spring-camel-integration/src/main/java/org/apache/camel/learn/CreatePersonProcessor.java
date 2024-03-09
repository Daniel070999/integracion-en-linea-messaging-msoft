package org.apache.camel.learn;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class CreatePersonProcessor implements Processor {

    @Override
    public void process(Exchange exchange) throws Exception {
        Persona persona = new Persona();
        persona.setCodigo(12387);
        persona.setNombres("Nuevo cliente");
        persona.setIdentificacion("118798465");
        persona.setDireccion("Quito");
        persona.setTipotransaccion("otro");
        exchange.getIn().setBody(persona);
    }

}
