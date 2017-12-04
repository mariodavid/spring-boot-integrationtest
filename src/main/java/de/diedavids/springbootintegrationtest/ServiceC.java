package de.diedavids.springbootintegrationtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceC {

    @Autowired
    ServiceA serviceA;


    public int add(int firstNumber, int secondNumber) {
        return serviceA.add(firstNumber, secondNumber);
    }
}
