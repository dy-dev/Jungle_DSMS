package com.arcreane.resources;

import com.arcreane.JungleObject;

public class Resource extends JungleObject {


    @Override
    public void step() {
        System.out.println("en tant que resource j'appelle le comportement parent");
        super.step();
        System.out.println("je step je suis une resource");
    }
}
