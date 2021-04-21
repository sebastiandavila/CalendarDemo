package com.example.demo;

import com.google.api.services.calendar.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    CalendarQuickstart calendarQuickstart = new CalendarQuickstart();

    @PostMapping(value = "api")
    public void guardar(@RequestBody Evento evento) throws IOException, GeneralSecurityException {

        calendarQuickstart.guardar(evento);
    }

    @GetMapping(value = "api")
    public List<Event> leer() throws IOException, GeneralSecurityException {

        return calendarQuickstart.leer();
    }
}
