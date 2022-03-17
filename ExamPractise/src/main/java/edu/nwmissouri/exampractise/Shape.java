/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.nwmissouri.exampractise;

/**
 *
 * @author S545694
 */
public abstract class Shape {

    // private attributes
    private String shapeType;

    // constructors
    public Shape() {
        this.shapeType = "Shape instantiated with no information";
    }

    public Shape(String shapeType) {
        this.shapeType = shapeType;
    }

    // getters and setters
    public String getShapeType() {
        return shapeType;
    }

    public void setShapeType(String shapeType) {
        this.shapeType = shapeType;
    }

    // abstract methods with no implementation - must be overridden
    public abstract double getArea();
    public abstract double getPerimeter();

}
    
