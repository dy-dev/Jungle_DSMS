package com.arcreane;

public class Prey {
    Coords m_Coords;
    Vision m_Vision;
    Hear m_Hearing;

    static int s_iMaxPreyAge;
    int m_iAgeMax;
    int m_iAge;

    static int s_iMaxPreyLifePoint;
    int m_iLifePointMax;
    int m_iLifePoint;

    static int s_iMaxPreyVigor;
    int m_iVigorMax;
    int m_iVigor;

    static float s_fMaxPreyMovingSpeed;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPreyAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    void step(){
    }

    void draw(){
    }

    void pop(){
    }

    void move(){
    }

    void mate(){
    }

    void eat()  {
    }

    void drink(){
    }

    void rest(){
    }

    void flee()  {
    }
}
