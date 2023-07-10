package Service;

import models.Category;
import models.Film;
import java.util.Scanner;

public class UserService {
    public static void UserLoop() {
        // List the categories
        CategoryService categoryService = new CategoryService();
        for (int i = 0; i < categoryService.categoryList.size(); i++) {
            System.out.println( "Select the category you want to view.\n" +
                    categoryService.categoryList.get(i).getCategoryName() +
                    " (" + categoryService.categoryList.get(i).getFilm_Count() + " films)");
        }
        // Get the chosen category information
        Scanner sc = new Scanner(System.in);
        int categoryNum = Integer.parseInt(sc.nextLine());
        Category category = categoryService.categoryList.get(categoryNum - 1);
        // Iterate through all films in the film list
        FilmService filmService = new FilmService();
        for (Film film : filmService.filmLists) {
            // Iterate through the film's categories
            for (Category filmCategory : film.getCategoryArrayList()) {
                // If the film's category matches the selected category
                if (filmCategory.getCategoryName().equals(category.getCategoryName())) {
                    // Print film information
                    for (Category filmCategory1 : film.getCategoryArrayList()) {
                    System.out.println("\nFilm Name: " + film.getMovieName() + "Director: " + film.getDirectory() +
                            "Release Year: " + film.getYear() + "Categories: " + film.getCategoryArrayList());
                    // Print film categories using a loop
                    }
                    System.out.print(film.toString());

                }
            }
        }
        System.out.print("\n");
    }
}
