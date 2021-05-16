package za.ac.cput.application;

/**
 * @author andisiwe 218272510
 */

public class Listing {
    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Listing{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';

    }
}
