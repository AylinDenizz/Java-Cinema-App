package models;

import java.util.ArrayList;
import java.util.List;

public class Film {
    private String movieName;
    private int year;
    private String directory;
    private double imdbnote;
    private List<Category> CategoryArrayList;
    private List<ShowTime> ShowTimeArrayList;
    private List<Platform> PlatformArrayList;

    public Film(String movieName, int year, String directory, double imdbnote, List<Category> categoryArrayList, List<ShowTime> showTimeArrayList, List<Platform> platformArrayList) {
        this.movieName = movieName;
        this.year = year;
        this.directory = directory;
        this.imdbnote = imdbnote;
        CategoryArrayList = categoryArrayList;
        ShowTimeArrayList = showTimeArrayList;
        PlatformArrayList = platformArrayList;
    }

    public String getmovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public double getImdbnote() {
        return imdbnote;
    }

    public void setImdbnote(double imdbnote) {
        this.imdbnote = imdbnote;
    }

    public String getMovieName() {
        return movieName;
    }

    public List<Category> getCategoryArrayList() {
        return CategoryArrayList;
    }

    public void setCategoryArrayList(List<Category> categoryArrayList) {
        CategoryArrayList = categoryArrayList;
    }

    public List<ShowTime> getShowTimeArrayList() {
        return ShowTimeArrayList;
    }

    public void setShowTimeArrayList(List<ShowTime> showTimeArrayList) {
        ShowTimeArrayList = showTimeArrayList;
    }

    public List<Platform> getPlatformArrayList() {
        return PlatformArrayList;
    }

    public void setPlatformArrayList(List<Platform> platformArrayList) {
        PlatformArrayList = platformArrayList;
    }

    @Override
    public String toString() {
        return "Film{" +
                "movieName='" + movieName + '\'' +
                ", year=" + year +
                ", directory='" + directory + '\'' +
                ", imdbnote=" + imdbnote +
                ", CategoryArrayList=" + CategoryArrayList +
                ", ShowTimeArrayList=" + ShowTimeArrayList +
                ", PlatformArrayList=" + PlatformArrayList +
                '}';
    }
}




