
import java.util.ArrayList;
import java.util.Collections;

/*
 * To change this license header, choose License Headers in Project Properties.
 * Version 2.
 * and open the template in the editor.
 */

/**
 *
 * @author Lillian
 */
public abstract class Shape implements Comparable {
    private String name;
    public abstract double area(); 
    public abstract double perimeter();

    @Override
    public int compareTo(Object o) {
        Shape s = (Shape) o;
        if(this.perimeter() > s.perimeter()){
            return 1;
        }
        else if(this.perimeter() < s.perimeter()){
            return -1;
        }
        else{
            return 0;
        }
    }
     
    public Shape(String shapeName) {
        name = shapeName;
    }
    public String getName() {
        return name;
    }
    public double semiPerimeter(){
        return perimeter() / 2; 
    }
    
    public String toString(){
        return this.name + " area: " + this.area() + "; perimeter: " + this.perimeter();
    }
        
     public static void main(String[] args) { 
        ArrayList<Shape> shapes = new ArrayList<>();
        
        Square s = new Square(2.0, "Square");
        Circle c = new Circle(3.0, "Circle");
        Triangle t = new Triangle(3.0, 4.0, 5.0, "Triangle");
        Rectanguler r = new Rectanguler(1.0, 2.0, "Rectanguler");
        shapes.add(s);
        shapes.add(c);
        shapes.add(t);
        shapes.add(r);
        
        Collections.sort(shapes);
        
        for(Shape s1: shapes){
            System.out.println(s1.toString());
        }
     }
}

 class Square extends Shape {
        private double side;
        public Square(double squareside, String squareName) {
            super(squareName);
            side = squareside; 
            }
        public double perimeter() {
            return 4 * side;
        }
        public double area(){
            return side * side;
        }
    }
    
     class Circle extends Shape {
        private double radius;
        public Circle(double cRadius, String cName) {
            super(cName);
            radius = cRadius; }
        public double perimeter(){
            return 2 * Math.PI * radius;
        }
        public double area(){
            return Math.PI * radius * radius;
        } } 
    
     class Triangle extends Shape {
        private double side1;
        private double side2;
        private double side3;
        private double perimeter;
        public Triangle(double triside1, double triside2, double triside3, String triName) {
            super(triName);
            side1 = triside1; 
            side2 = triside2;
            side3 = triside3;
            this.perimeter = side1 + side2 + side3;
            }
        public double perimeter() {
            return side1 + side2 + side3;
        }
        public double area(){
            return Math.pow((perimeter/2)* (perimeter/2 - side1) * (perimeter/2 - side2) * (perimeter/2 - side3), 0.5);
        }
    }
    
     class Rectanguler extends Shape {
        private double side1;
        private double side2;
        public Rectanguler(double recside1, double recside2, String recName) {
            super(recName);
            side1 = recside1;
            side2 = recside2;
            }
        public double perimeter() {
            return 2 * (side1 + side2);
        }
        public double area(){
            return side1 * side2;
        }
    }
