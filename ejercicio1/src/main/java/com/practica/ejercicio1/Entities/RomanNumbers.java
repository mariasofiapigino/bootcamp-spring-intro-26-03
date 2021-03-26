package com.practica.ejercicio1.Entities;

import lombok.Data;

@Data
public class RomanNumbers {
    private String number;
    private String message;

    public void toRoman(int number) {
        this.number = String.valueOf(
                new char[number]).replace('\0', 'I') // Reemplaza todos los caracteres por I
                .replace("IIIII", "V") // Cada 5 Is que encuentre devuelve V
                .replace("IIII", "IV")
                .replace("VV", "X")
                .replace("VIV", "IX")
                .replace("XXXXX", "L")
                .replace("XXXX", "XL")
                .replace("LL", "C")
                .replace("LXL", "XC")
                .replace("CCCCC", "D")
                .replace("CCCC", "CD")
                .replace("DD", "M")
                .replace("DCD", "CM");
    }

    public void sendMessage(String e){
        this.message = e;
    }
}
