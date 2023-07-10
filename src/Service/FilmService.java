package Service;

import models.Category;
import models.Film;
import models.Platform;
import models.ShowTime;

import java.util.ArrayList;
import java.util.List;

public class FilmService {

    List<Film> filmLists = new ArrayList<>();


    public void AddFilmList(String movieName, int year, String director, double imdbnote,
                            List<Category> categories, List<ShowTime> showTimes, List<Platform> platforms) {
        Film film = new Film(movieName, year, director, imdbnote, categories, showTimes, platforms);
        filmLists.add(film);
    }


}
