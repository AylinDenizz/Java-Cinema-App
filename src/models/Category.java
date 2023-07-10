package models;

public class Category {
    private String categoryName;
    private int Film_Count ;

    public String getCategoryName() {
        return categoryName;
    }

    public int getFilm_Count() {

        return Film_Count;
    }

    public void setcategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public void setFilm_Count(int film_Count) {

        Film_Count = film_Count;
    }

    @Override
    public String toString() {
        return "Category{" +
                "CategorycategoryName='" + categoryName + '\'' +
                ", Film_Count=" + Film_Count +
                '}';
    }
}
