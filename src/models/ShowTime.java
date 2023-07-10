package models;

public class ShowTime {
    private String showTime;

    public String getShowTime() {
        return showTime;
    }

    public void setShowTime(String showTime) {
        this.showTime = showTime;
    }

    @Override
    public String toString() {
        return "ShowTime{" +
                "showTime='" + showTime + '\'' +
                '}';
    }
}
