package CityStateMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;

public class CityStateTest {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        FileReader f1 = new FileReader("C:\\Users\\SainitinMadireddy\\OneDrive - Insight Global, LLC\\Documents\\IG\\\\CityState.txt");
		BufferedReader b=new BufferedReader(f1);
		String line=null;
		CityStateService css = new CityStateService();
		while( (line=b.readLine())!=null) {
//			System.out.println(line);
			String[] data = line.split(",");
			String city = data[0].trim();
	        String state = data[1].trim();
	        css.addCityState(city, state);
		}
        Scanner s = new Scanner(System.in);
        boolean running = true;

        while (running) {
            System.out.println("1. Get All Cities");
            System.out.println("2. Get All States");
//            System.out.println("3. Get Cities for a State");
            System.out.println("3. Add City-State Pair");
            System.out.println("4. Delete All Cities for a State");
            System.out.println("5. Display All");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = s.nextInt();

            switch (choice) {
                case 1:
                    Set<String> cities= css.getAllCities();
                    if (cities != null) {
                    	System.out.println("Cities: " + cities);
                    } else {
                        System.out.println("Cities not found");
                    }
                    break;

                case 2:
                	Set<String> states = css.getAllStates();
                    if (states != null) {
                    	System.out.println("States: " + states);
                    } else {
                        System.out.println("States not found");
                    }
                    break;

                case 3:
                	s.nextLine();
                	System.out.println("Enter city: ");
                    String newCity = s.nextLine();
                    System.out.println("Enter state: ");
                    String newState = s.nextLine();
                    css.addCityState(newCity, newState);
                    break;
                    
                case 4:
                	s.nextLine();
                	System.out.print("Enter state: ");
                    String delState = s.nextLine();
                    css.deleteCitiesForState(delState);
                    break;
                    
                case 5:
                    css.display();
                    break;
                    
                case 6:
                    running = false;
                    System.out.println("Exit");
                    break;

                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        s.close();
	}

}
