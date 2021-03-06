package game.content.phantasye;

import org.menaphos.model.math.Range;
import org.menaphos.model.world.location.Location;
import org.menaphos.model.world.location.region.Region;

public class RegionUtils {

    public static Location getLocationInRegion(Region region) {
        final Range xRange = new Range(region.getSouthWestCorner().getXCoordinate(),region.getNorthEastCorner().getXCoordinate());
        final Range zRange = new Range(region.getSouthWestCorner().getZCoordinate(), region.getNorthEastCorner().getZCoordinate());
        final int xPos = Range.getIntFromRange(xRange);
        final int zPos = Range.getIntFromRange(zRange);
        final Location location = new Location(xPos,region.getNorthEastCorner().getZCoordinate(),zPos);
        return location;
    }

}
