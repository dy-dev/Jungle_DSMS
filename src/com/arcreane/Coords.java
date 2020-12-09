package com.arcreane;

/***
 * Class for managing position on the grid (managed by Terrain)
 */
public class Coords {
    /**
     * X, Y coordinates
     * 0,0 is at bottom left, X to the right, Y to the top
     */
    int m_iX;
    int m_iY;

    public Coords(int x, int y) {
        m_iX = x;
        m_iY = y;
    }

    /***
     * Calculate distance between 2 points given in parameter
     * @param p_Coords1
     * @param p_Coords2
     * @return distance between points
     */
    public static float distance (Coords p_Coords1, Coords p_Coords2){
        return 0;
    }

    /***
     * Test if 2 coordinates are equal (same X and same Y)
     * @param p_Coords1
     * @param p_Coords2
     * @return true if same false otherwise
     */
    static boolean isSame(Coords p_Coords1, Coords p_Coords2){
        return (p_Coords1.getX() == p_Coords2.getX() &&
                p_Coords1.getY() == p_Coords2.getY() );
    }

    public int getY() {
        return m_iY;
    }
    public int getX() {
        return m_iX;
    }
}
