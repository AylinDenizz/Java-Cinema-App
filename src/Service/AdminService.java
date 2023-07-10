package Service;

import models.Category;
import models.Film;
import models.Platform;
import models.ShowTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class AdminService {

    public static void AdminLoop () {
        Scanner sc = new Scanner(System.in);

        while (true) {

            List<Platform> platforms;
            while (true) {
                System.out.println("Please enter a movie platform:");
                String platformName = sc.next();
                platforms = new ArrayList<>();
                Platform platform = new Platform();
                platform.setPlatform(platformName);
                platforms.add(platform);
                PlatformService platformService = new PlatformService();
                platformService.AddPlatform(platform);

                System.out.println("Do you want to enter another movie platform.Type \"yes\" or \"no\" ");
                String platformAnswer = sc.next();
                if (platformAnswer.equals("no")) {
                    break;
                } else if (platformAnswer.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Please dont enter anything other then \"yes\" or \"no\" .");
                }

            }


            List<Category> categories;
            while (true) {
                System.out.println("Please enter a movie category:");
                String categoryName = sc.next();
                categories = new ArrayList<>();
                Category category = new Category();
                category.setcategoryName(categoryName);
                categories.add(category);
                CategoryService categoryService = new CategoryService();
                categoryService.AddCategory(category);

                System.out.println("Do you want to enter another movie category.Type \"yes\" or \"no\" ");
                String categoryAnswer = sc.next();
                if (categoryAnswer.equals("no")) {
                    break;
                } else if (categoryAnswer.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Please dont enter anything other then \"yes\" or \"no\" .");
                }

            }

            List<ShowTime> showTimes;
            while (true) {
                System.out.println("Please enter a showTime:");
                String enterShowTime = sc.next();
                showTimes = new ArrayList<>();
                ShowTime showTime = new ShowTime();
                showTime.setShowTime(enterShowTime);
                showTimes.add(showTime);
                System.out.println("Do you want to enter another movie showtime. \"yes\" or \"no\" ");
                String categoryAnswer = sc.next();
                if (categoryAnswer.equals("no")) {
                    break;
                } else if (categoryAnswer.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Please dont enter anything other then \"yes\" or \"no\" .");
                }

            }

            System.out.println("Please enter a movie name:");
            String movieName = sc.next();

            System.out.println("Please enter a year:");
            String year = sc.next();
            int yearchanged = parseInt(year);

            System.out.println("Please enter a director:");
            String director = sc.next();

            System.out.println("Please enter a imdbnote:");
            String imdbnote = sc.next();
            Double imdbnotechanged = parseDouble(imdbnote);


            FilmService filmService = new FilmService();
            filmService.AddFilmList(movieName, yearchanged, director, imdbnotechanged, categories, showTimes, platforms);
            System.out.println("Do you want to enter another movie.Type \"yes\" or \"no\" ");
            String movieAnswer = sc.next();
            filmService.filmLists.toString();
            if (movieAnswer.equals("no")) {
                break;
            } else if (movieAnswer.equals("yes")) {
                continue;
            } else {
                System.out.println("Please dont enter anything other then \"yes\" or \"no\" .");
            }

        }
    }
}


