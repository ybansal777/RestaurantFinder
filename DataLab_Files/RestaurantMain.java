import core.data.*;
import java.util.ArrayList;
import java.util.Scanner;

public class RestaurantMain {
    public static void main(String[] args) {
        DataSource ds = DataSource.connect("https://raw.githubusercontent.com/ozlerhakan/mongodb-json-files/master/datasets/restaurant.json");
        ds.load();

        ArrayList<Restaurant> restaurant = ds.fetchList("Restaurant", "name", "address", "address line 2", "type_of_food");

        Scanner sc = new Scanner(System.in);
        System.out.println("Ender a city: ");
        String cityName = sc.next();
        System.out.println("Finding restaurants in " + cityName);

        for (Restaurant restaurantData: restaurant) {
            if (restaurantData.getCity().equals(cityName)) {
                System.out.println("Restaurant: " + restaurantData.getName() + "\nAddress: " +  restaurantData.getAddress() + "\nCity: " + restaurantData.getCity() + "\nCuisine: " + restaurantData.getCuisine() + "\n");
            }
        }
        System.exit(0);
    }
}


