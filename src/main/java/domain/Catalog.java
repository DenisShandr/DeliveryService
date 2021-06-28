package domain;

import java.util.Set;

public class Catalog {

    private Set<Category> categories;

    public Catalog(Set<Category> categories) {
        this.categories = categories;
    }

    public Catalog() {
    }

    public Set<Category> getCategories() {
        return categories;
    }

    public void setCategories(Set<Category> categories) {
        this.categories = categories;
    }

}
