/**
 * This class named person contains two instance variable which
 * stores name and age of a person . the class has a default constructor with
 * no arguments and two constructors with different parameters . class also contains
 * two getter and setter methods being used as accessors and mutators
 */

public class Person {
    private String name;
    private int age;

    /**
     * default constructor with no parameters
     */
    public Person() {
        this.name = "";
        this.age = 1;

    }

    /**
     *  constructor with one parameter
     * @param name
     */
    public Person(String name){
        this.name = name;
    }


    /**
     * constructor with two parameters
     * @param name
     * @param age
     */
    public Person(String name,int age){
        this(name);
        this.age = age;
    }

    /**
     * returns a String name
     * @return  name
     */
    public String getName() {
        return name;
    }

    /**
     * Changes the value of instance variable "name"
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * returns an int value "age"
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * Changes the value of instance variable "age"
     * @param age
     * age of the person-
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}