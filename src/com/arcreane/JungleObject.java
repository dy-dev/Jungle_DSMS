package com.arcreane;

public class JungleObject {

    protected Coords m_Coords;
    protected String displayString;

    public JungleObject() {
        int terrainwidth = Terrain.getInstance().getM_iWidth();
        int terrainheight = Terrain.getInstance().getM_iHeight();
        do {
            m_Coords = new Coords((int) (Math.random() * terrainwidth),
                    (int) (Math.random() * terrainheight));
        }
        while (Terrain.getInstance().isCoordonateOccuped(m_Coords));
    }

    public void step() {
        System.out.println("je step je suis un jungle object");
    }

    public void draw(String[][] board) {
        board[m_Coords.getY()][m_Coords.getX()] = displayString;
    }

    public Coords getCoords() {
        return m_Coords;
    }
}
