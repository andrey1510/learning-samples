package FactoryMethodPattern;

import FactoryMethodPattern.creators.AbstractCreator;
import FactoryMethodPattern.creators.ConcreteCreatorA;
import FactoryMethodPattern.creators.ConcreteCreatorB;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Objects;
import java.util.Scanner;

public class ClientTestClass {

    private static AbstractCreator creator;
    private static String productChoice;

    static void configure() {
        System.out.println("Choose product (print A or B)");
        Scanner sc = new Scanner(System.in);
        productChoice = sc.next();
        sc.close();

        if (Objects.equals(productChoice, "A")) {
            creator = new ConcreteCreatorA();
        } else if (Objects.equals(productChoice, "B")) {
            creator = new ConcreteCreatorB();
        } else {
            System.out.println("Wrong input");
        }
    }

    public static void main(String[] args) {
        configure();
        creator.launchProductCreation();
    }

}
