package com.designpattern.factory2;

//Factory Method: Defines an interface to create objects
// but lets subclasses decide which object to instantiate.
public class FactoryMethodExample {
    public static void main(String args[]){

        Factory factory;

        factory = new FactoryConcreateA();
        Product productA = factory.factoryMethod();
        productA.display();

        factory = new FactoryConcreateB();
        Product productB = factory.factoryMethod();
        productB.display();


    }
}
