package com.ektha.payment.EkthaPayment.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

@GetMapping("/come")
     public String Welcome(){
         return "Welcome to my learning page";
     }
}
