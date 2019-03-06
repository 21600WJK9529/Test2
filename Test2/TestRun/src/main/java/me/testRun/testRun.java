package me.testRun;

import me.addition.Addition;
import me.division.Division;
import me.multiply.Multiply;
import me.subtract.Subtract;

public class testRun {

    public static void main(String[] args) {
        Addition add=new Addition();
        System.out.println("Addition: "+add.add(1,2));

        Multiply mul=new Multiply();
        System.out.println("Multiplication: "+mul.mult(5,6));

        Subtract sub=new Subtract();
        System.out.println("Subtraction: "+sub.sub(7,2));

        Division div=new Division();
        System.out.println("Division: "+div.div(10,5));

    }
}
