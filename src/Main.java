//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        University[] universities = {
                new University("Iphone", "USA", 2006),
                new University("Samsung", "Korea", 1995),
                new University("Hyundai", "Korea", 2010)
        };

        School[] schools = {
                new School("PeakSoft ",200 , "Learn Java"),
                new School("University", 1500, "Being smart"),
                new School("College", 800, "Will teach English")
        };

        Car[] cars = {
                new Car("Apple", "black", 2023),
                new Car("Mercedes", "black", 2018),
                new Car("BMW", "white", 2019)
        };

        Person[] persons = {
                new Person("Baisalbek", 18, "Football"),
                new Person("Atai", 19, "Tennis"),
                new Person("Adiled", 19, "Student")
        };

        System.out.println("Universities:");
        for (University university : universities) {
            System.out.println(university);
        }

        System.out.println("Schools:");
        for (School school : schools) {
            System.out.println(school);
        }

        System.out.println("Cars:");
        for (Car car : cars) {
            System.out.println(car);
        }

        System.out.println("Persons:");
        for (Person person : persons) {
            System.out.println(person);
        }
    }
}


