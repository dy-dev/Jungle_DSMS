package com.arcreane.animals.sense;

import com.arcreane.animals.Prey;

public class Smell extends Sense {
    static int s_iMaxSmellDistanceCapactity;

    int m_iSmellingDistanceCapactity;


    public static void initSmell()
    {
        s_iMaxSmellDistanceCapactity = 200;
    }

    public static void displaySmell(){
//        System.out.println("Smell " + Smell.s_iMaxSenseDistanceCapactity);
    }


    boolean canSmell(Prey p_Prey){
        return false;
    }
}
