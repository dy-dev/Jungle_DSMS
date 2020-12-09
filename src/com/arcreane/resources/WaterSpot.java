package com.arcreane.resources;

import com.arcreane.Coords;
import com.arcreane.Terrain;

public class WaterSpot extends Resource {
    int m_iWidth, m_iHeight;

    private int m_iQuantity;
    float m_fSpeedEvaporation;

    public WaterSpot() {
        m_iQuantity = 5000;
        int terrainwidth = Terrain.getInstance().getM_iWidth();
        int terrainheight = Terrain.getInstance().getM_iHeight();
        m_Coords = new Coords(terrainwidth / 2, terrainheight / 2);
        m_iWidth = terrainwidth / 4;
        m_iHeight = terrainheight / 4;
    }

    public int getQuantity() {
        return m_iQuantity;
    }

    public int tryDrink(int p_iQuantity) {
        int quantityReturned = p_iQuantity;
        if (quantityReturned > m_iQuantity) {
            quantityReturned = m_iQuantity;
        }
        m_iQuantity -= quantityReturned;
        return quantityReturned;
    }

    @Override
    public void step() {
        System.out.println("Il me reste : " + m_iQuantity + " litre d'eau");
    }

    @Override
    public void draw(String[][] board) {
        for (int i = 0; i < m_iHeight; i++) {
            for (int j = 0; j < m_iWidth; j++) {
            board[i+ m_Coords.getY()- m_iHeight/2][j+ m_Coords.getX()-m_iWidth/2] = "~";
            }
        }

    }

    void evaporate() {
    }
}
