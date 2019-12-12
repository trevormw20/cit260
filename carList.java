import java.io.*;
import java.util.Scanner;
import CarSelection.java
public class carList {

    public void main(String[] args) {
        //scanner for user input

        //default -standard -color(white) -wheel(silver) -interior(black/white) ------------

        // Informs the user what the program does.
        System.out.println("This program will allow you to order Tesla cars. As well as calculate how much it will cost " +
                "and how long it will take to deliver your cars\n");

        // Allow user to select what to do next.
        System.out.println("Please choose an option by entering on of the choices below:");
        System.out.println("\"1\" to add new car.");
        System.out.println("\"2\" to remove a car from your list.");
        System.out.println("\"3\" to switch car order.");
        System.out.println("\"4\" to display the total it will cost for all of your orders.");
        System.out.println("\"5\" to display the total wait time for all of your orders.");
        System.out.println("\"8\" to terminate program.");
        Scanner choiceIn = new Scanner(System.in);

        switch (choiceIn.nextInt()) {
            case 1:
                //make carSelection variable in an array
                //check for empty spot in array and then use that number for making a new car object/ instance
                break;
            case 2:
                deleteCar();
                break;
            case 3:
                switchCarOrder();
                break;
            case 4:
                calculateAssemblyCost();
                break;
            case 5:
                calculateAssemblyTime();
                break;
            case 8:
                break;
            default:
                System.out.println("Invalid input, please try again.");
                break;
        }


        // Checks to see if file exists, if not it creates a new file
        File carListFile = new File("carData.txt");
        if (!carListFile.exists()) {

            // Attempt to create file
            try {
                carListFile.createNewFile();
            } catch (IOException e) {
                System.out.println("file Exists.\n");
                e.printStackTrace();
            }
        }
        else {
            // Check to see if file can be read and written to.
            try {
                carListFile.canRead();
                carListFile.canWrite();
            } catch (Exception e) {
                System.out.println("carData cant read.\n");
                e.printStackTrace();
            }
        }


        // Read pre saved car selections
        try {
            File savedCarData = new File("carData.txt");

            // Read car file data and display on screen
            Scanner fileReader = new Scanner(savedCarData);
            BufferedReader carDataCheck = new BufferedReader(new FileReader("carData.txt"));

            // Checks to see if file is empty / new
            if (carDataCheck.readLine() == null)
                System.out.println("There are no cars chosen to be built as of yet.");

                // If file is not empty / new continue to display
            else {
                System.out.println("List of cars already chosen to be built:");
                while (fileReader.hasNextLine()) {
                    String data = fileReader.nextLine();
                    System.out.println(data);
                }
            }
        }
        catch (Exception e)
        {
            System.out.println("cant open carData.txt.\n");
            e.printStackTrace();
        }




        //run other classes to choose car




        // Write integers to file "carData.txt".
        try {
            FileWriter writeFile = new FileWriter("carData.txt");
            for (int x = 0; x < 10; x++) {
                writeFile.write(integers[x] + "\n");
            }
            // Close file "data.txt".
            writeFile.close();
        } catch (IOException e) {
            System.out.println("cant write.\n");
            e.printStackTrace();
        }
    }

    public void deleteCar(){
        System.out.println("Please enter the number of which car you would like to remove from the list:");
        //prints number then car on list and price and time ------------
    }

    public void calculateAssemblyTime() {
        //add + time to assembly at end of display message. ------------
        System.out.println("The total time required to manufacture your list of cars will be: ");

        System.out.println("Please enter 9 when ready to return to previous menu.");
        if (true)
            //run this to return to menu ------------
            ;
        else
            //error message and try again ------------
        ;
    }

    public void calculateAssemblyCost() {
        //add + cost to assembly at end of display message. ------------
        System.out.println("The total cost required to manufacture your list of cars will be: $");

        System.out.println("Please enter 9 when ready to return to previous menu.");
        if (true)
            //run this to return to menu ------------
            ;
        else
            //error message and try again ------------
            ;
    }

    public  void switchCarOrder() {
        System.out.println("Please enter the numbers corresponding to the cars you would like to switch seperated by a space:");
        //display list and numbers next to each car ------------
    }
}
