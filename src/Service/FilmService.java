package Service;

import models.Category;
import models.Film;
import models.Platform;
import models.ShowTime;

import java.util.ArrayList;
import java.util.List;

public class FilmService {


    public List<String> ShowMoviesByCategory(List<Film> filmList, Category chosenCategory) {
        List<String> movieName = null;
        for (int i = 0; i < filmList.size(); i++) {
            movieName = new ArrayList<>();
            List<Category> category = filmList.get(i).getCategoryArrayList();
            if (chosenCategory.equals(category)) {
                movieName.add(filmList.get(i).getMovieName());
            }
        }
        return movieName;
    }

    public Film createFilm(String movieName, int year, String directory, double imdbnote,
                           List<Category> categoryArrayList, List<ShowTime> showTimeArrayList,
                           List<Platform> platformArrayList) {
        Film film = new Film();
        film.setMovieName(movieName);
        film.setYear(year);
        film.setDirectory(directory);
        film.setCategoryArrayList(categoryArrayList);
        film.setShowTimeArrayList(showTimeArrayList);
        film.setPlatformArrayList(platformArrayList);
        return film;
    }

    public Film getMovieByName(List<Film> filmList, String chosenMovieName) {
        Film chosenMovie = null;
        for (int i = 0; i < filmList.size(); i++) {
            String film = filmList.get(i).getMovieName();
            if (chosenMovieName.equals(film)) {
                chosenMovie = filmList.get(i);
                break;
            }
        }
        return chosenMovie;
    }
}
