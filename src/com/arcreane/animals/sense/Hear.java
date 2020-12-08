package com.arcreane.animals.sense;

import com.arcreane.animals.Predator;

/***
 * Class representing the hearing sense
 */
public class Hear extends Sense {
    /**
     * Max distance capacity to hear predator approaching
     */
    static int s_iMaxHearingCapacity = 150;

    /***
     * Checks if a predator is heard or not
     * @param p_Predator
     * @return
     */
    boolean canHear(Predator p_Predator){
        return false;
    }
}
