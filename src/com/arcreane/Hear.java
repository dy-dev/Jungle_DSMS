package com.arcreane;

/***
 * Class representing the hearing sense
 */
public class Hear {
    /**
     * Max distance capacity to hear predator approaching
     */
    static int s_iMaxHearingCapacity;
    /***
     * Capacity for this instance to hear an approaching predator
     * ranges from 0 to s_iMaxHearingCapacity
     */
    int m_iHearingCapacity;

    /***
     * Checks if a predator is heard or not
     * @param p_Predator
     * @return
     */
    boolean canHear(Predator p_Predator){
        return false;
    }
}
