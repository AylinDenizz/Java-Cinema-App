package Service;

import models.Category;

import java.util.ArrayList;
import java.util.List;

public class CategoryService {

    List<Category> categoryList = new ArrayList<>();

    public boolean compareCategory(Category enteredCategory) {
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

    public void AddCategory(Category enteredCategory) {
        if (!compareCategory(enteredCategory)) {
            categoryList.add(enteredCategory);
            enteredCategory.setFilm_Count(0);
        } else if (compareCategory(enteredCategory)) {
            enteredCategory.setFilm_Count(enteredCategory.getFilm_Count() + 1);

        }
    }

}