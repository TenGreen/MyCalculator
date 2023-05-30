package com.sky.calculator.controller;

import com.sky.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    private final CalculatorService calculatorService;

    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping("/calculator/plus")
    public String plus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.plus(a, b);
        return String.format("%s + %s = %s", a, b, result);
    }

    @GetMapping("/calculator")

    public String greating() {
        return "Добро пожаловать в кальулятор";
    }

    @GetMapping("/calculator/minus")
    public String minus(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.minus(a, b);
        return String.format("%s - %s = %s", a, b, result);
    }

    @GetMapping("/calculator/multiply")
    public String multiply(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.multiply(a, b);
        return String.format("%s * %s = %s", a, b, result);
    }

    @GetMapping("/calculator/divide")
    public String divide(@RequestParam("num1") int a, @RequestParam("num2") int b) {
        int result = calculatorService.multiply(a, b);
        return String.format("%s / %s = %s", a, b, result);
    }
}
