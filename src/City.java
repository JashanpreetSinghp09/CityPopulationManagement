import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;

/**
 * emun for the different types of cities
 */
enum CityType{
    Industrial,Touristic,Global,Port,Island,NoType
}

/**
 * A class city which contain all the instance variables and method
 */

public class City {
    private String name;
    private int code;
    private double area;
    private long population;
    private boolean isBorder;
    private ArrayList<City> neighbours;
    private Person mayor;
    private CityType citytype;
    private static int lastAssignedCityCode = 1000;

    /**
     * a Default Constructor Initialising some instance variables with no parameters
     */
    public City() {

        this.neighbours = new ArrayList<>();
        this.mayor = null;
        this.citytype = CityType.NoType;
        this.code = 0;
        this.isBorder = false;
        lastAssignedCityCode++;
    }

    /**
     * a Constructor with one parameter initialising remaining instance varibales
     * @param name
     */
    public City(String name) {
        this();
        this.name = name;
        lastAssignedCityCode++;
    }


    /**
     * a constructor with multiple instance variables initialising remaining instance variables
     * @param name
     * @param area
     * @param population
     * @param mayor
     * @param neighbours
     * @param citytype
     */

    Person p1 = new Person("John Tory",57);

    public City(String name, double area, long population, Person mayor, ArrayList<String> neighbours, CityType citytype) {
        this(name);
        this.area = 0.0;
        this.population = 0;

        lastAssignedCityCode++;
    }

    /**
     * getter method return a String name of instance variable name of instance object of class City
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * setter method to change the value of instance variable name of instance object of class City
     * @param name
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * getter method return an Arraylist of City type
     * @return neighbours
     * returns arraylist of type City
     */

    public ArrayList<City> getNeighbours() {
        return neighbours;
    }

    /**
     * setter method for setting the values of Arraylist of type City
     * @param neighbours
     */

    public void setNeighbours(ArrayList<City> neighbours) {
        this.neighbours = neighbours;
    }


    /**
     *
     * @return citytype
     * returns citytype a variable of type CityType
     */
    public CityType getCitytype() {
        return citytype;
    }


    /**
     *Sets the city type of an instance object of the city
     * @param citytype
     *
     */
    public void setCitytype(CityType citytype) {
        this.citytype = citytype;
    }

    /**
     *gets the Area of an instance object of the city
     * @return area
     * returns a double value
     */
    public double getArea() {
        return area;
    }

    /**
     *Sets the Area of an instance object of the city
     * @param area
     */

    public void setArea(double area) {
        this.area = area;
    }

    /**
     *
     * @return code
     * returns an integer representing city code
     */

    public int getCode() {
        return code;
    }

    /**
     *returns the population of the instance object of class City
     * @return popuation
     */

    public long getPopulation() {
        return population;
    }

    /**
     *Sets the population of the instance object of class City
     * @param population
     */
    public void setPopulation(long population) {
        this.population = population;
    }

    /**
     *
     * @return Person
     * returns the variable mayor of type person
     */

    public Person getMayor() {
        return mayor;
    }

    /**
     *Sets the particular variable of type person to be the mayor of the city
     * @param mayor
     */

    public void setMayor(Person mayor) {
        this.mayor = mayor;
    }

    /**
     *
     * @return boolean
     * returns value true/false after checking city is border city or not
     */
    public boolean isBorder() {
        return isBorder;
    }

    /**
     *sets the fact that city is a border city to true / false
     * @param border
     */
    public void setBorder(boolean border) {
        isBorder = border;
    }

    /**
     *Adds a city of type City into the list of neighbors
     * @param anotherCity
     */
    public void addNeighbor(City anotherCity) {
        neighbours.add(anotherCity);
    }

    /**
     *This method removes a city from the list of neighbors
     * @param cityName
     * @return boolean
     * it returns a true if removal is successful other wise false
     */
    public boolean removeNeighbor(String cityName) {
        if (neighbours.isEmpty()) {
            return false;
        } else {
            for (City c : neighbours) {
                if (c.getName().equalsIgnoreCase(cityName)) {
                    neighbours.remove(c);
                    return true;
                } else { return false; }
            }
        }return false;
    }

    /**
     *This method sorts the list of neighbor cities
     * @param order
     * @return ArrayList<String>
     *     returns an Arraylist called neighborsSortedList
     */

    public ArrayList<String>neighborsSortedList(Character order) {
        ArrayList<String> names = new ArrayList<>();


        for (City n : neighbours) {
            names.add(n.getName());
        }
        if (order.equals('D')) {
            Collections.sort(names, Collections.reverseOrder());
            ArrayList<String> sorted_names_dcc = new ArrayList<>(names);
        } else {
            Collections.sort(names);
            ArrayList<String> sorted_names_acc = new ArrayList<>(names);

        }return names;
    }

    /**
     *this method returns the info about the manager his name+ age
     * and returns name+ a blank space if age is 0 or set to 0
     * @return String
     * returns a String str which has both mayor's name and age
     */

    public String cityMayorInfo(){

        String str ;
     if (mayor.getAge() == 0){
         str = mayor.getName() + " " + " ";
     }else
     str = mayor.getName() + " " + mayor.getAge();
     return str;
    }

}




