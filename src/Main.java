public class Main {
    public static void main(String[] args) {


    Person person = new Person("deniz", "yenigül",
            24,1.70,82.4,"male");
    Person baran = new Person("baran", "güney",
            24, 1.85, 85.5, "male" );
        Person john = new Person("John", "Doe", 20);

        System.out.println("Firstname: " + baran.getFirstName());

        System.out.println("LastName: " + person.getLastName());

        System.out.println("Age: " + person.getAge());

        System.out.println("----------------");

        Wall wall = new Wall(5,4);
        System.out.println("area= " + wall.getArea());
        wall.setHeight(-1.5);

        System.out.println("width= " + wall.getWidth());

        System.out.println("height= " + wall.getHeight());

        System.out.println("area= " + wall.getArea());
    }
}