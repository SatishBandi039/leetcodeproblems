package com.designpattern.factory2;

public class FactoryConcreateA implements Factory{

    @Override
    public Product factoryMethod() {

        return new ConcreateProductA();
    }
}
