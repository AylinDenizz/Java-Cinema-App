package Service;

import models.Category;
import models.Platform;

import java.util.ArrayList;
import java.util.List;

public class PlatformService {

    List<Platform> platformList = new ArrayList<>();

    public boolean comparePlatform(Platform enteredPlatform) {
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

    public void AddPlatform(Platform enteredPlatform) {
        if (!comparePlatform(enteredPlatform)) {
            platformList.add(enteredPlatform);
        } else if (comparePlatform(enteredPlatform)) {
            platformList = platformList;
        }
    }
}
