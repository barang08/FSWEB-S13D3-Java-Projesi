public class Person {

    String firstName;
    String lastName;
    int age;
    double boy;
    double weight;
    String gender;

    public Person(String firstName, String lastName, int age) {
        this.firstName= firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double boy, double weight, String gender) {
        this(firstName,lastName,age);
        this.boy = boy;
        this.weight = weight;
        this.gender = gender;
    }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen( int age){
        if(age >=13 && age <=19){
            return true;
        }else{
            return false;
        }

    }
}
