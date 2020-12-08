package com.arcreane;

import com.arcreane.animals.Animal;
import com.arcreane.animals.Predator;
import com.arcreane.animals.sense.Smell;
import com.arcreane.animals.sense.Vision;

public class Jungle {

    public static void main(String[] args) throws InterruptedException {
        Terrain terrain = Terrain.getInstance();
        Weather.s_Terrain = terrain;
        terrain = Terrain.getInstance();

        Vision.initVision();
        Smell.initSmell();

        Vision.displayVision();
        Smell.displaySmell();

        while(terrain.getWaterSpot().getQuantity() > 0){
           // Weather.step();
            terrain.step();

            //terrain.draw();

            Thread.sleep(250);
            break;
        }
        System.out.println("Ecosystem est en désiquilibre tout le monde va mourir!!!");
    }
}