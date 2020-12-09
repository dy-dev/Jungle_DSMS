package com.arcreane.resources;

public class Plant extends Resource{
    private static int s_iMaxPlantNRJPoints;
    private static int s_iMaxAge;

    private float m_fGrowingSpeed;
    private float m_fArea;
    private int m_iLiveSpan;
    private int m_iMaxAge;
    private int m_iAge;
    private int m_iMaxNbNRJ;
    private int m_iCurrentNRJ;

    public Plant () {
        displayString = "@";
    }

    @Override
    public void step() {
        System.out.println("en tant que plante j'appelle le comportement parent");
        super.step();
        System.out.println("je step je suis une plante");
    }

    void pop(){
    }

    void grow(){
    }

    void die(){
    }
}
