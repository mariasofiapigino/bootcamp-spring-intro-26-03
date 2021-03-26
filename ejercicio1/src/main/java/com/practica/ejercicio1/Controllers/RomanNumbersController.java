package com.practica.ejercicio1.Controllers;

import com.practica.ejercicio1.Entities.RomanNumbers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RomanNumbersController {
    RomanNumbers romanNumbers = new RomanNumbers();

    /*@GetMapping("/number")
    public RomanNumbers getRomanNumber(@RequestParam(value = "number", defaultValue = "1") String number){
        try {
            romanNumbers.toRoman(Integer.parseInt(number));
            romanNumbers.sendMessage("Conversion realizada con exito");
            return romanNumbers;
        } catch (Exception e) {
            romanNumbers.sendMessage("Error! " + e.getMessage());
            return romanNumbers;
        }
    }*/

    @GetMapping("/number/{number}")
    public RomanNumbers getRomanNumber2(@PathVariable() String number){
        try{
            romanNumbers.toRoman(Integer.parseInt(number));
            romanNumbers.sendMessage("Conversion realizada con exito");
            return romanNumbers;
        } catch (Exception e){
            romanNumbers.sendMessage("Error! " + e.getMessage());
            return romanNumbers;
        }

    }
}
