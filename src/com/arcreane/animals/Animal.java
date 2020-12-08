package com.arcreane.animals;

import com.arcreane.Coords;
import com.arcreane.JungleObject;
import com.arcreane.animals.sense.Vision;

public class Animal extends JungleObject {
    protected Vision m_Vision;

    //Maximal age that the instance of predator can reach
    int m_iAgeMax;//variables d'instance <=> membre commencent par un m_
    int m_iAge;
    int m_iLifePointMax;
    int m_iLifePoint;
    int m_iVigorMax;
    int m_iVigor;
    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;
    float m_fOrientation; //Angle varying between 0 and 2Pi

    Animal(int age) {
        m_iAge = age;
    }

    Animal(int age, int speed) {
        m_iAge = age;
    }

    @Override
    public void step(){
        super.step();
        System.out.println("je step je suis un animal");
    }

    public Coords getCoords() {
        return m_Coords;
    }

    void pop() {
    }

    void move() {
    }

    void eat() {
    }

    void drink() {
    }

    void rest() {
    }
}
