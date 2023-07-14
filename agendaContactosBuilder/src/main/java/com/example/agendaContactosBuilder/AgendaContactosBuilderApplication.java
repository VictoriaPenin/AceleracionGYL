package com.example.agendaContactosBuilder;

import com.example.agendaContactosBuilder.builder.ContactBuilder;
import com.example.agendaContactosBuilder.entity.ContactEntity;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AgendaContactosBuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendaContactosBuilderApplication.class, args);
                
                //creo una instancia
                ContactBuilder builder = new ContactBuilder();
                
                // Configuro las propiedades del contacto utilizando los métodos encadenados

    ContactEntity contact = builder
    .setNombre("Victoria")
    .setApellido("Peñin")
    .setTelefono("123456789")
    .setDomicilio("Cordoba")
    .build();
         
//imprimo los datos en consola
            System.out.println(contact);
	}

}
