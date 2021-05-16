package za.ac.cput.application;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

class ListingTest {

//creates arraylist interface
    @Test
    public void addCharacter() {

        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println("======================");
        cars.remove(2);
        System.out.println(cars);
        System.out.println("=============");
        cars.get(1);
        System.out.println(cars);
        //cars.stream(cars).findAny();

    }

    //creates map interface

    @Test
    public void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<Integer, String> map = new HashMap<>();

        // Add number and name)
        map.put(50, "Bern");
        map.put(75, "nolly");
        map.put(31, "ashy");
        System.out.println(map);
        System.out.println("=============================");
        map.remove(2);
        System.out.println(map);
        System.out.println("=============================");

    }

// creates set interface

    @Test
    public void main() {
        HashSet<String> colours = new HashSet<String>();
        colours.add("yellow");
        colours.add("Purple");
        colours.add("lemon");
        colours.add("white");
        colours.add("black");
        System.out.println(colours);
        System.out.println("----------------------");
        colours.remove(2);
        System.out.println("-----------------------");
        colours.contains("white");
        System.out.println("------------------------");

        }


}



