public class Restaurant {
    private String name, address, city, cuisine;
    public Restaurant(String name, String address, String city, String cuisine) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.cuisine = cuisine;
    }
    public String toString() {
        return (name + " " + address + " " + city + " " + cuisine);
    }
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public String getCity() {
        return city;   
    }
    public String getCuisine() {
        return cuisine;
    }
}

