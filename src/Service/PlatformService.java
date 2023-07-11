package Service;

import models.Category;
import models.Platform;

import java.util.ArrayList;
import java.util.List;

public class PlatformService {

    public boolean comparePlatform(List<Platform> platformList, Platform enteredPlatform ) {
        boolean compare = false;
        for (Platform platform : platformList) {
            String platformName = enteredPlatform.getPlatform();
            if (platform.getPlatform().equals(platformName)) {
                compare = true;
                break;
            } else if (platform.getPlatform().compareTo(platformName) <= 0) {
                compare = false;
            }
        }
        return compare;
    }

    public void AddPlatform(List<Platform> platformList, Platform enteredPlatform, List<Platform> platforms) {
        if (!comparePlatform(platformList, enteredPlatform)) {
            platforms.add(enteredPlatform);
            platformList.add(enteredPlatform);
        } else if (comparePlatform(platformList, enteredPlatform)) {
            platforms = platforms;
        }
    }
}

