package com.arcreane;

public class Predator {
    Coords m_Coords;

    Vision m_Vision;
    Smell m_Smelling;

    //Maximal age that the specie Predator can reach
    static final int s_iMaxPredatorAge = 120; //variables static commencent par s_, suivi par la premiere
    // lettre si c'est un type primitif (int, double, float, boolean..)
    //Le type sinon static Predator s_Predator

    //Maximal age that the instance of predator can reach
    int m_iMaxAge;//variables d'instance <=> membre commencent par un m_

    //Current age
    int m_iAge;//variables d'instance <=> membre commencent par un m_

    static int s_iMaxPredatorLifePoint;
    int m_iMaxLifePoint;
    int m_iLifePoint;

    static int s_iMaxPredatorVigor;
    int m_iMaxVigor;
    int m_iVigor;

    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;

    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorMovingNoise;
    static float s_fPredatorAcceleration;

    float m_fOrientation; //Angle varying between 0 and 2Pi

    void step() {
    }

    void draw() {

    }

    void pop() {
    }

    //Method called to move the predator to a defined coordinate
    void move(Coords p_Coords) {
    }

    void mate(Predator p_Predator) {
    }

    void hunt(Prey p_Prey) {
    }

    void eat(Prey p_Prey) {
    }

    void spot(Prey p_Prey) {
    }

    void drink() {
    }

    void rest(){
    }
}
