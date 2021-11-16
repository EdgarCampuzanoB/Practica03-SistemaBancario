package com.example.springcoredojo.sistema;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Menu {

    @Autowired
    public String SendWelcomeMessage(){
        return "Bienvenido al Sistema del Banco";
    }
}
