package models;

public class Platform {

    private String platform;

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {

        this.platform = platform;
    }


    @Override
    public String toString() {
        return "platform{" +
                "platform='" + platform + '\'' +
                '}';
    }
}


