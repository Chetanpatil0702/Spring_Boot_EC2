package com.example.Spring_Boot_EC2.Controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {

    // Commnets are added
    @GetMapping()
    ResponseEntity<String> msg(){
       return ResponseEntity.ok("Hii Work Properly...!");
    }

    @GetMapping()
    ResponseEntity<String> msg1(){
        return ResponseEntity.ok("Hii Chetan Properly...!");
    }


}
