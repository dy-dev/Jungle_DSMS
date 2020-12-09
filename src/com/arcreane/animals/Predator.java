package com.arcreane.animals;

import com.arcreane.Coords;
import com.arcreane.Terrain;
import com.arcreane.animals.sense.Smell;

public class Predator extends Animal{
    Smell m_Smelling;

    //Maximal age that the specie Predator can reach
    static final int s_iMaxPredatorAge = 120; //variables static commencent par s_, suivi par la premiere
    // lettre si c'est un type primitif (int, double, float, boolean..)
    //Le type sinon static Predator s_Predator
    static int s_iMaxPredatorLifePoint;
    static int s_iMaxPredatorVigor;
    static float s_fPredatorSpeedMovingBySmell;
    static float s_fMaxPredatorSpeedMovingByView;
    static float s_fMaxPredatorMovingSpeed;

    float m_fMaxMovingSpeed;
    float m_fMovingSpeed;

    static float s_fPredatorMovingNoise;
    static float s_fPredatorAcceleration;

    public Predator(){
        super(10);
        displayString = "!";
    }


    @Override
    public void step() {
        System.out.println("en tant que predator j'appelle le comportement parent");
        super.step();
//        int quantity = Terrain.getInstance().getWaterSpot().tryDrink( 7);
//        System.out.println("je peux boire : " + quantity);

        System.out.println("je step je suis un prédateur");

    }



    //Method called to move the predator to a defined coordinate
    void move(Coords p_Coords) {
    }

    void mate(Predator p_Predator) {
    }

    void hunt(){
        Prey[] preyArray = Terrain.getInstance().getPreys();
        for (Prey prey : preyArray ) {
            Coords preyCoords = prey.getCoords();
            boolean inRange = m_Vision.isInRange(m_Coords, preyCoords);
        }

        /*
        * for(int i = 0 ; i < preyArray.length; i++){
        * Coords preyCoords = preyArray[i].getCoords();
        * }
        * */
    }

    void startHunt(Prey p_Prey) {
    }

    void eat(Prey p_Prey) {
    }

    void spot(Prey p_Prey) {
    }
}
