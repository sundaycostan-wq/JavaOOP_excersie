package restaurant;

import java.util.ArrayList;

public class Restaurant {
ArrayList<MenuItem> menu = new ArrayList<>();

    public void addItem(MenuItem item) { menu.add(item); }
    public void removeItem(MenuItem item) { menu.remove(item); }
    public double averageRating() {
        if (menu.isEmpty()) return 0;
        double sum = 0;
        for (MenuItem i : menu) sum += i.rating;
        return sum / menu.size();
    }
}

