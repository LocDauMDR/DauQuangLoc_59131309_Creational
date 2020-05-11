/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap3.Shape.Rectangle;

import BaiTap3.Shape.Shape;

/**
 *
 * @author quang
 */
public class Rectangle extends Shape{

    private static Rectangle instance;
    
    public static Rectangle createInstance() {
        if (instance == null)
            instance = new Rectangle();
        return instance;
    }
    
    @Override
    public String draw() {
        return "Vẽ hình chữ nhật";
    }
    
}
