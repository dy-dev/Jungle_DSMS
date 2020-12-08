package com.arcreane.animals.sense;

import com.arcreane.Coords;
import com.arcreane.animals.Animal;
import com.arcreane.animals.Predator;
import com.arcreane.animals.Prey;

public class Vision extends Sense {
    static int s_iMaxVisionDistanceCapactity;

    static int s_iMaxSpottingDistance;

    Vision(){
        m_iDetectionDistanceCapactity = s_iMaxVisionDistanceCapactity -(int)(Math.random()*(20.0*s_iMaxVisionDistanceCapactity/100.0));
    }
    public static void initVision()
    {
       s_iMaxVisionDistanceCapactity = 100;
    }
    public static void displayVision(){
//        System.out.println("Vision " + Vision.s_iMaxSenseDistanceCapactity);
    }

    boolean canSee() {

        return false;
    }

    boolean canSee(Prey target) {

        return false;
    }

    boolean canSee(Predator target) {

        return false;
    }

}
