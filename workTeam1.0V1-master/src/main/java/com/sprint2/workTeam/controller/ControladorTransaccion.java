package com.sprint2.workTeam.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ControladorTransaccion {
@RequestMapping("/")
 public String holamundo(){
    return  "Hola mundo con sprint Boot";
}

}
