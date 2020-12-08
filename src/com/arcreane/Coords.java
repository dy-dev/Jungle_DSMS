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

    /***
     * Calculate distance between 2 points given in parameter
     * @param p_Coords1
     * @param p_Coords2
     * @return distance between points
     */
    static float distance (Coords p_Coords1, Coords p_Coords2){
        return 0;
    }

    /***
     * Test if 2 coordinates are equal (same X and same Y)
     * @param p_Coords1
     * @param p_Coords2
     * @return true if same false otherwise
     */
    static boolean isSame(Coords p_Coords1, Coords p_Coords2){
        return false;
    }
}
