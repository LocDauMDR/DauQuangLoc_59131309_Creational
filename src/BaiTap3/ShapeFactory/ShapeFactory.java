/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.ShapeFactory;

import BaiTap3.Shape.Circle.Circle;
import BaiTap3.Shape.Rectangle.Rectangle;
import BaiTap3.Shape.Shape;
import BaiTap3.Shape.ShapeType;
import BaiTap3.Shape.Triangle.Triangle;

/**
 *
 * @author quang
 */
public class ShapeFactory {

    public ShapeFactory() {
        
    }
    
    public Shape createShape(ShapeType type) {
        switch(type) {
            case Rectangle: return Rectangle.createInstance();
            case Triangle: return Triangle.createInstance();
            case Circle: return Circle.createInstance();
        }
        return null;
    }
}
