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

public class ManagementService {


    public static void managementLoop(boolean condition, List<Category> categoryList,
                                      List<Platform> platformList, List<Film> filmList, List<ShowTime> showTimeList) {

        FilmService filmService = new FilmService();
        PlatformService platformService = new PlatformService();
        CategoryService categoryService = new CategoryService();


        if (condition = true) {
            Scanner sc = new Scanner(System.in);

            while (true) {

                List<Platform> platforms;
                while (true) {
                    System.out.println("Please enter a movie platform:");
                    String platformName = sc.next();
                    Platform platform = new Platform();
                    platforms = new ArrayList<>();
                    platform.setPlatform(platformName);
                    platformService.AddPlatform(platformList, platform, platforms);

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
                    Category category = new Category();
                    category.setcategoryName(categoryName);
                    categories = new ArrayList<>();
                    categoryService.AddCategory(categoryList, category, categories);

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
                    ShowTime showTime = new ShowTime();
                    showTime.setShowTime(enterShowTime);
                    showTimes = new ArrayList<>();
                    showTimes.add(showTime);
                    showTimeList.add(showTime);

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



                Film film = filmService.createFilm(movieName, yearchanged, director, imdbnotechanged, categories, showTimes, platforms);

                filmList.add(film);

                System.out.println("Do you want to enter another movie.Type \"yes\" or \"no\" ");
                String movieAnswer = sc.next();
                if (movieAnswer.equals("no")) {
                    break;
                } else if (movieAnswer.equals("yes")) {
                    continue;
                } else {
                    System.out.println("Please dont enter anything other then \"yes\" or \"no\" .");
                }
            }


        } else if (condition == false) {

        }
        while (true) {
            // List the categories
            for (int i=0;i<categoryList.size();i++)
            System.out.println(categoryList.get(i).getCategoryName() + " category name's movie count" +
                    categoryList.get(i).getFilm_Count() + " Film");
            System.out.println("Select the category you want to view.");

            // Get the chosen category information
            Scanner sc = new Scanner(System.in);
            int categoryNum = Integer.parseInt(sc.nextLine());
            Category chosenCategory = categoryService.GetCategoryByNum(categoryList, categoryNum);

            // Iterate through all films in the film list
            System.out.println("Films belonging to this category are listed below.");

            System.out.println(filmService.ShowMoviesByCategory(filmList, chosenCategory).toString());
            System.out.println("Please select movie you want to see details");
            String chosenMovieName = sc.nextLine();
            Film chosenMovie = filmService.getMovieByName(filmList, chosenMovieName);
            System.out.println(chosenMovie.toString());
            System.out.print("\n");

            System.out.println("Do you want to see another movie.Type \"yes\" or \"no\" ");
            String movieAnswer = sc.next();
            if (movieAnswer.equals("no")) {
                break;
            } else if (movieAnswer.equals("yes")) {
                continue;
            } else {
                System.out.println("Please don't enter anything other then \"yes\" or \"no\" .");
            }
        }

    }
}



