package de.diedavids.springbootintegrationtest;

import org.springframework.stereotype.Service;

@Service
public class ServiceA {


    public int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }
}
