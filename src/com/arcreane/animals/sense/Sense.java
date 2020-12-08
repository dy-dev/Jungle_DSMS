package com.arcreane.animals.sense;

import com.arcreane.Coords;

public class Sense {
    /***
     * Capacity for this instance to detect something
     * ranges from 0 to s_iMax<sense>Capacity, this variable being defined in
     * children class
     */
    protected int m_iDetectionDistanceCapactity;

    public boolean isInRange(Coords ownerCoords, Coords targetCoords) {
        double dist = Coords.distance(ownerCoords, targetCoords);
        return dist < m_iDetectionDistanceCapactity;
    }
}
