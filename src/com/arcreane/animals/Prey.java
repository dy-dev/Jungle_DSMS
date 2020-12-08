package com.arcreane.animals;

import com.arcreane.animals.sense.Hear;

public class Prey extends Animal {
    Hear m_Hearing;

    static int s_iMaxPreyAge;
    static int s_iMaxPreyLifePoint;
    static int s_iMaxPreyVigor;
    static float s_fMaxPreyMovingSpeed;
    static float s_fPreyAcceleration;

    public Prey(int age, int speed) {
        super(age, speed);

    }

    public Prey() {
        super(0, 0);
    }


    @Override
    public void step() {
        System.out.println("en tant que proie j'appelle le comportement parent");
        super.step();
        System.out.println("je step je suis une proie");
    }

    void mate() {
    }

    void flee() {
    }
}
