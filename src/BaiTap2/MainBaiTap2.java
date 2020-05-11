/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap2;

/**
 *
 * @author quang
 */
public class MainBaiTap2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyStringBuilder mystr = new MyStringBuilder.Builder()
                .addString("Họ tên: ")
                .addString("Đậu Quang Lộc")
                .addString("\nĐiểm trung bình HK: ")
                .addFloat((float) 6.7)
                .addString("\nHọc lực TB: ")
                .addBool(true)
                .build();
        System.out.println(mystr.toString());
    }
    
}
