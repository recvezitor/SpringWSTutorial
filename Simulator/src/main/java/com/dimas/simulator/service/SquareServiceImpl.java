package com.dimas.simulator.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service
public class SquareServiceImpl implements SquareService {

    public BigInteger square(BigInteger bigInteger) {
        return (bigInteger.multiply(bigInteger));
    }

}
