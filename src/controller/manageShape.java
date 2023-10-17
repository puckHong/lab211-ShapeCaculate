/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Common.Library;
import model.Circle;
import model.Rectangle;
import model.Triangle;

/**
 *
 * @author suunh
 */
public class manageShape {
    Library lib = new Library();
    public void run(){
        System.out.println("=====Calculator Shape Program=====");
        double Width = lib.getDouble("Please input side width of Rectangle: ");
        double length = lib.getDouble("Please input length of Rectangle: ");
        double radius =lib.getDouble("Please input radius of Circle: ");
        double sideA = lib.getDouble("Please input side A of Triangle: ");
        double sideB = lib.getDouble("Please input side B of Triangle: ");
        double sideC = lib.getDouble("Please input side C of Triangle: ");
        Triangle tri = new Triangle(sideA, sideB, sideC);
        Rectangle rec = new Rectangle(Width, length);
        Circle cir = new Circle(radius);
        rec.printResult();
        cir.printResult();
        tri.printResult();
    }
}
