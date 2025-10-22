package com.designpattern.factory2;

public class FactoryConcreateB implements Factory{

    @Override
    public Product factoryMethod() {

        return new ConcreateProductB();
    }
}
