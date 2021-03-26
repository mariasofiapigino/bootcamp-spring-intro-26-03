package com.practica.ejercicio2.Controllers;

import com.practica.ejercicio2.Entities.Morse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MorseController {


    @GetMapping("/morse/{code}")
    public Morse morseToAscii(@PathVariable() String code){
        Morse morse = new Morse(code);
        try{
            morse.morseWord();
            return morse;
        } catch (Exception e) {
            morse.setMessage("Error! " + e.getMessage());
            return morse;
        }
    }


}
