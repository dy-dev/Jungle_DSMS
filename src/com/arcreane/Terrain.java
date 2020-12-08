package com.arcreane;

import com.arcreane.animals.Animal;
import com.arcreane.animals.Predator;
import com.arcreane.animals.Prey;
import com.arcreane.resources.Plant;
import com.arcreane.resources.WaterSpot;

public class Terrain {
    private JungleObject[] m_JungleObjectsArray;

    int m_iWidth, m_iHeight;
    String[][] m_BoardArray;

    private static Terrain s_Terrain;

    public static Terrain getInstance() {
        if (s_Terrain == null) {
            s_Terrain = new Terrain();
        }
        return s_Terrain;
    }

    private Terrain() {
        m_iWidth = 180;
        m_iHeight = 30;
        initBoard();
        m_JungleObjectsArray = new JungleObject[301];
        m_JungleObjectsArray[0] = new WaterSpot();
        for (int i = 1; i < m_JungleObjectsArray.length - 2; i+=3) {
            m_JungleObjectsArray[i] = new Predator();
            m_JungleObjectsArray[i+1] = new Prey();
            m_JungleObjectsArray[i+2] = new Plant();
        }
    }

    public WaterSpot getWaterSpot() {
        return (WaterSpot) m_JungleObjectsArray[0] ;
    }

    private void initBoard() {
        m_BoardArray = new String[m_iHeight][m_iWidth];
        for (int i = 0; i < m_iHeight; i++) {
            for (int j = 0; j < m_iWidth; j++) {
                if (i == 0 || i == m_iHeight - 1) {
                    m_BoardArray[i][j] = "_";
                } else if (j == 0 || j == m_iWidth - 1) {
                    m_BoardArray[i][j] = "|";

                } else {
                    m_BoardArray[i][j] = "🌊";
                }
            }
        }
    }

    void step() {
        for (JungleObject jungleObject : m_JungleObjectsArray) {
            jungleObject.step();
        }
    }

    void draw() {
        for (JungleObject jungleObject : m_JungleObjectsArray) {
            jungleObject.draw(m_BoardArray);
        }
        for (int i = 0; i < m_iHeight; i++) {
            for (int j = 0; j < m_iWidth; j++) {
                System.out.print(m_BoardArray[i][j]);
            }

            System.out.println();
        }
    }

    public Prey[] getPreys() {
        return null;//m_PreysArray;
    }
}
