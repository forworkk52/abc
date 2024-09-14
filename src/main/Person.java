public class Person{

//arif jamadar code

    public static void main(String[] args) {
        Person person = new Person("asif", 25, "Male");

        person.displayInfo();
        person.setAge(30);
        System.out.println("\nUpdated Age: " + person.getAge());
    }


    private String name;
    private int age;
    private String gender;

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Getter for age
    public int getAge() {
        return age;
    }

    // Getter for gender
    public String getGender() {
        return gender;
    }

    // Setter for age
    public void setAge(int age) {
        this.age = age;
    }

    //  display person details
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }


}
