package com.example.demo;

import com.google.api.services.calendar.model.Event;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.security.GeneralSecurityException;
import java.util.List;

@RestController
public class Controller {

    @PostMapping(value = "api")
    public void guardar() throws IOException, GeneralSecurityException {
        CalendarQuickstart calendarQuickstart = new CalendarQuickstart();
        calendarQuickstart.guardar();

    }
    @GetMapping(value = "api")
    public List<Event> leer() throws IOException, GeneralSecurityException {
        CalendarQuickstart calendarQuickstart = new CalendarQuickstart();
        return calendarQuickstart.leer();

    }
}
