public class University {
    private String name;
    private String location;
    private int foundedYear;

    public University(String name, String location, int foundedYear) {
        this.name = name;
        this.location = location;
        this.foundedYear = foundedYear;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getFoundedYear() {
        return foundedYear;
    }

    public void setFoundedYear(int foundedYear) {
        this.foundedYear = foundedYear;
    }



    public String toString() {
        return String.format("""
                name: %s
                location: %s
                foundedYear: %s
                """,name,location,foundedYear);
    }
}

