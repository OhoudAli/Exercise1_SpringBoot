package com.example.welcomecontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class welcomeController {


    @GetMapping("/name")
    public String name(){
        return "My name is Ohood";
    }


    @GetMapping("/age")
    public int age(){
        return 26;
    }


    @GetMapping("/check")
    public String check(){
        return "Everything is OK";
    }


    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }


    @GetMapping("/names")
    public String[] names(){
        String[] arrNames = {"Ohood","Khadija","Sahar","Albatool","Eatezaz","Duja","Abrar","Abeer"};

        for (int i = 0; i < arrNames.length; i++){
             System.out.println(arrNames[i]);

         }
        return arrNames;
    }
}
