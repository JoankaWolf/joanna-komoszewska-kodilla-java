package com.kodilla.testing;
import com.kodilla.testing.calculator.Calculator;
public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator1 = new Calculator();
        int addAToB = calculator1.addAToB(8,6);
        if (addAToB == 14) {
            System.out.println("Add Test ok!");}
        else {
            System.out.println("Add Test failed!");
        }
        int subtractBFromA = calculator1.subtractBFromA(8,12);
        if (subtractBFromA == 4) {
            System.out.println("Subtract Test ok!");}
        else {
            System.out.println("Subtract Test failed!");
        }
    }
}