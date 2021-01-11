import java.time.Period;
import java.util.ArrayList;
import java.util.Collections;


public class CityTester {

    public static void main(String[] args) {

        City c1 = new City();

        // Declare an instance object, called c1, of class City using its default constructor.
        // ************** (0.5 mark)

        // **************

        System.out.println("First city (Code: " + c1.getCode()+ ") added.");

        City c2 = new City("London");

        // Declare an instance object, called c2, of class City, with the name London.
        // Note: You must implicitly use the proper constructor for the initialization
        // ************** (0.5 mark)

        // **************

        System.out.println("Name of Second city is : " + c2.getName());

        // Print out the name of city c2 using the proper method of its corresponding object.
        // You should do this by calling only one println method.
        // ************** (0.5 mark)

        // **************
       ArrayList<String>empty_neighbors= new ArrayList<>();
        Person p1 =new Person("John tory",57);
        City c3 = new City("Toronto",630.2,6197000,p1,empty_neighbors,CityType.Touristic);



        // Declare an instance object, called c3, of class City, with the following initial values
        // City name: Toronto, City area: 630.2, City population: 6,197,000
        // City mayor's name: John Tory, City mayor's age: 57
        // Note: You must implicitly use the proper constructor for the initialization
        // ************** (0.5 mark)

        // **************
        System.out.println(c3.getName());
        System.out.println(c3.getArea());
        System.out.println(c3.getPopulation());
        System.out.println(c3.getMayor());
        System.out.println(c3.getCitytype());


        // Print out the name of the third city using the proper method of its corresponding object.
        // You should do this by calling only one println method.
        // ************** (0.5 mark)

        // **************

        c1.setName("Windsor");
        // Set the name of the first city to Windsor
        c1.setArea(146.3);
        // Set the area of Windsor to : 146.3
        c1.setPopulation(336000);
        // Set the population of Windsor to : 336,000
        Person p2 = new Person("Drew Dilkens",42);
        c1.setMayor(p2);
        // Set the Windsor's mayor's name and age to : Drew Dilkens, 42
        // ************** (2 marks)





        // **************

        System.out.println("First city, " + c1.getName() + ", updated");

        City det = new City("Detroit");
        City Cha = new City("Chatham");
        City las = new City("Lasalle");
        c1.addNeighbor(det);
        c1.addNeighbor(Cha);
        c1.addNeighbor(las);
        // Add three neighbors, Detroit, Chatham, and Lasalle to the city of Windsor
        // We do not know the values of the other instance variable of these neighbors
        // ************** (1.5 marks)



        // **************
        City sb = new City("Scarborough");
        City ms = new City("Mississauga");
        City rh = new City("Richmond Hill");

        c3.addNeighbor(sb);
        c3.addNeighbor(ms);
        c3.addNeighbor(rh);

        // Add three neighbors, Scarborough, Mississauga, and Richmond Hill to the city of Toronto
        // We do not know the values of the other instance variable of these neighbors
        // ************** (1.5 marks)



        // **************

        ArrayList<String>neighborsNames = new ArrayList<>(c1.neighborsSortedList('D'));

        // Create an ArrayList of String, called neighborsNames, and put the sorted list of the
        // city of Windsor's neighbors' names into it. Sort order should be descending.
        // Then print out the sorted list. You should do this by calling only one println method.
        // ************** (1.5 marks)

        // answer i should use one println as i will use enhanced for loop and its a list//

        for(String str : neighborsNames){
            System.out.println(str);
        }


        // **************

        neighborsNames = c1.neighborsSortedList('A');

        for(String str1 : neighborsNames){
            System.out.println(str1);
        }


        // Use the existing ArrayList neighborsNames, and this time store the sorted list of the
        // city of Windsor's neighbors' names into it. Sort order should be Ascending.
        // Then print out the sorted list. You should do this by calling only one println method.
        // ************** (1.5 marks)


        // **************

        c3.removeNeighbor("Richmond Hill");

        // Remove Richmond Hill from the neighbors of Toronto.
        // Print out a proper message depending on the method's returned value by calling println method.
        // ************** (1.5 marks)





        // **************
        neighborsNames = c3.neighborsSortedList('A');

        for(String str1 : neighborsNames){
            System.out.println(str1);
        }


        // Overwrite the Arraylist neighborsNames by storing the sorted list of the
        // city of Toronto's neighbors' names into it. Sort order should be Ascending.
        // Then print out the sorted list. You should do this by calling only one println method.
        // ************** (1.5 marks)


        // **************

        // Create an ArrayList of String, called cityMayorNames.
        // ************** (0.5 mark)
        ArrayList<String>cityMayorNames = new ArrayList<>();

        // **************

        // Create an ArrayList of city, called cities, and then add the three cities
        // that you have already created into it.
        // ************** (1 mark)

        ArrayList<City>cities = new ArrayList<>();
        cities.add(c1);
        cities.add(c2);
        cities.add(c3);




        // **************

        // Using an enhanced for loop add the name and mayor of each city into the
        // ArrayList cityMayorNames. Separate each city name and its mayor name by a colon.
        // ************** (1 mark)



        // **************

        // Sort the ArrayList cityMayorNames, in ascending order.
        // Then print out a title and then the list using an enhanced for loop, one item per line.
        // ************** (1 mark)





        // **************

    }
}