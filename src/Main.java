
import Service.FilmService;
import Service.ManagementService;
import Service.PlatformService;
import models.Category;
import models.Film;
import models.Platform;
import models.ShowTime;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        FilmService filmService = new FilmService();
        List<Category> categoryList = new ArrayList<>();
        List<Platform> platformList = new ArrayList<>();
        List<ShowTime> showTimeList = new ArrayList<>();
        Category category1 = new Category();
        Category category2 = new Category();
        category1.setcategoryName("Action");
        category2.setcategoryName("Fantasy");
        categoryList.add(category1);
        categoryList.add(category2);
        Platform platform1 = new Platform();
        Platform platform2 = new Platform();
        platform1.setPlatform("Netflix");
        platform2.setPlatform("DisneyChannel");
        platformList.add(platform1);
        platformList.add(platform2);
        ShowTime showTime = new ShowTime();
        showTime.setShowTime("13:15");
        showTimeList.add(showTime);
        List<Film> filmList = new ArrayList<>();

        Film Film1 = filmService.createFilm("LordOfTheRings", 1997, "Peter Jackson", 8.9,
                categoryList,showTimeList, platformList);
        filmList.add(Film1);

        // read user input
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter 1 for administration or press any button to access the Ticket System. Press 9 for exit.");
            String adminRequest = sc.next();
            if (adminRequest.equals("1")) {
                System.out.println("Redirecting to Administration");
                ManagementService adminService = new ManagementService();
                ManagementService.managementLoop(true, categoryList, platformList, filmList, showTimeList);
            } else if (adminRequest.equals("9")) {
                break;
            } else{
                System.out.println("Redirecting to Ticket System");
                ManagementService.managementLoop(false, categoryList, platformList, filmList, showTimeList);
                sc.close();
            }


        }
    }

}