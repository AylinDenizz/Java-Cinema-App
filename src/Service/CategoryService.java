package Service;

import com.sun.tools.javac.Main;
import models.Category;
import models.Film;
import models.Platform;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {
    private List<Category> categoryList;

    public boolean compareCategory(List<Category> categoryList, Category enteredCategory) {
        boolean compare = false;
        for (Category category : categoryList) {
            String categoryName = enteredCategory.getCategoryName();
            if (category.getCategoryName().equals(categoryName)) {
                compare = true;
                break;
            } else if (category.getCategoryName().compareTo(categoryName) <= 0) {
                compare = false;
            }
        }
        return compare;
    }

    public void AddCategory(List<Category> categoryList, Category enteredCategory,List<Category> categories) {
        if (!compareCategory(categoryList, enteredCategory)) {
            categories.add(enteredCategory);
            enteredCategory.setFilm_Count(0);
            categoryList.add(enteredCategory);
        } else if (compareCategory(categoryList, enteredCategory)) {
            enteredCategory.setFilm_Count(enteredCategory.getFilm_Count() + 1);

        }
    }

    public void GetCategoryList(List<Category> categoryList) {
        for (int i = 0; i < categoryList.size(); i++) {
            System.out.println(i + categoryList.get(i).getCategoryName() + "Movie Count:" + categoryList.get(i).getFilm_Count() + " films");
        }
    }

    public Category GetCategoryByNum(List<Category> categoryList, int categoryNum) {
        Category category = categoryList.get(categoryNum - 1);
        return category;

    }
}


