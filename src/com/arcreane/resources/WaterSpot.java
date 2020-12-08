package com.arcreane.resources;

import com.arcreane.Coords;

public class WaterSpot extends Resource{
    int m_iWidth, m_iHeight;

    private int m_iQuantity;
    float m_fSpeedEvaporation;

    public WaterSpot(){
        m_iQuantity = 5000;
    }

    public int getQuantity(){
        return m_iQuantity;
    }

    public int tryDrink(int p_iQuantity){
        int quantityReturned = p_iQuantity;
        if(quantityReturned > m_iQuantity ){
            quantityReturned = m_iQuantity;
        }
        m_iQuantity -= quantityReturned;
        return  quantityReturned;
    }

    @Override
    public void step() {
        System.out.println("Il me reste : " + m_iQuantity + " litre d'eau");
    }

    void evaporate() {
    }
}
