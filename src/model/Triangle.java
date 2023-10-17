/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author suunh
 */
public class Triangle extends Shape {
private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(Double sideA, Double sideB, Double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public Double getSideA() {
        return sideA;
    }

    public void setSideA(Double sideA) {
        this.sideA = sideA;
    }

    public Double getSideB() {
        return sideB;
    }

    public void setSideB(Double sideB) {
        this.sideB = sideB;
    }

    public Double getSideC() {
        return sideC;
    }

    public void setSideC(Double sideC) {
        this.sideC = sideC;
    }
    
    @Override
    public double getPerimeter() {
        return sideA+sideB+sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt(getPerimeter()*(getPerimeter()-sideA)*(getPerimeter()-sideB)*(getPerimeter()-sideC));
    }
    public void printResult(){
         System.out.println("-----Triangle-----");
         System.out.println("Side A: " + sideA);
         System.out.println("Side B: " + sideB);
         System.out.println("Side C: " + sideC);
         super.printResult();
    }
    
}
