package com.example.SpringLearning.Structural.Adapter.Controller;

import com.example.SpringLearning.Structural.Adapter.impl.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {

    @Autowired
    CheckoutService checkoutService;

    @GetMapping("/checkout")
    public void checkoutTheService(){

        checkoutService.checkout(125,"$");
    }
}
