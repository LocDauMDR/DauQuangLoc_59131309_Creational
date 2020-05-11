/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BaiTap1;

import java.util.ArrayList;

/**
 *
 * @author quang
 */
public class HoaDon {
    HoaDonHeader HD;
    ArrayList<CTHD> CT = new ArrayList<>();

    protected HoaDon(Builder builder) {
        this.HD = builder.HD;
        this.CT = builder.CT;
    }

    @Override
    public String toString() {
        String HDon = HD.toString();
        for (int i = 0; i < CT.size(); i++) {
            HDon +=  CT.get(i).toString();
        }
        return HDon;
    }
    
    public static class Builder {
        HoaDonHeader HD;
        ArrayList<CTHD> CT = new ArrayList<>();

        public Builder() {

        }
        
        public Builder addHD(HoaDonHeader HD){
            this.HD = HD;
            return this;
        }
        
        public Builder addCT(CTHD CT){
            this.CT.add(CT);
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
        
    }
}
