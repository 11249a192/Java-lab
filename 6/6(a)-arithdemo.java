Experiment(6)a: Packages Using Arithmetic Operations in Java

Aim: 
To write a Java program using packages to perform arithmetic operations such as addition, subtraction, multiplication, and division.

Algorithm:
1. Create a package named mypackage.
2. Create a class named Arithmetic inside the package.
3. Define methods for addition, subtraction, multiplication, and division.
4. Import the package into the main Java program.
5. Create an object of the Arithmetic class.
6. Call the methods and display the results.

#program

Create two Java files.

1. Arithmetic.java
package mypackage;

public class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}

2. Main.java

import mypackage.Arithmetic;

public class Main {
    public static void main(String[] args) {

        Arithmetic obj = new Arithmetic();

        int a = 20;
        int b = 10;

        System.out.println("Addition = " + obj.add(a, b));
        System.out.println("Subtraction = " + obj.subtract(a, b));
        System.out.println("Multiplication = " + obj.multiply(a, b));
        System.out.println("Division = " + obj.divide(a, b));
    }
}

#output
Addition = 30
Subtraction = 10
Multiplication = 200
Division = 2

Result
 Thus, the Java program using packages to perform arithmetic operations was executed succesfully.
