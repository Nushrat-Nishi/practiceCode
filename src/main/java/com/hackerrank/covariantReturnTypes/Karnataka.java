package com.hackerrank.covariantReturnTypes;

public class Karnataka extends State{
    @Override
    Lotus yourNationalFlower(){
        Lotus lotus = new Lotus();
        return lotus;
    }
}