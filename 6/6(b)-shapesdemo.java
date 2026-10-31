Experiment: Packages Using Shapes in Java
Aim: To write a Java program using packages to calculate the areas of different shapes such as Circle, Rectangle, and Triangle.

Algorithm:
1. Create a package named shapes.
2. Create a class Area inside the package.
3. Define methods to calculate the area of a circle, rectangle, and triangle.
4. Import the package into the main Java program.
5. Create an object of the Area class.
6. Call the methods and display the results.

#program
1. Area.java
package shapes;

public class Area {

    public double circle(double r) {
        return 3.14 * r * r;
    }

    public double rectangle(double l, double b) {
        return l * b;
    }

    public double triangle(double b, double h) {
        return 0.5 * b * h;
    }
}


2. Main.java
import shapes.Area;

public class Main {
    public static void main(String[] args) {

        Area obj = new Area();

        System.out.println("Area of Circle = " + obj.circle(5));

        System.out.println("Area of Rectangle = " + obj.rectangle(10, 5));

        System.out.println("Area of Triangle = " + obj.triangle(6, 4));
    }
}


Output
Area of Circle = 78.5
Area of Rectangle = 50.0
Area of Triangle = 12.0


Result
Successfully executed
Thus, the Java program using packages to calculate the areas of different shapes was executed successfully.












Do you like this personality?
