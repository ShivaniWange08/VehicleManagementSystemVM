package com.practise;

import java.util.Scanner;

import org.hibernate.SessionFactory;

import com.practise.Repositories.UserRepositories;
import com.practise.Utility.HibernateUtility;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args )
    {

        while(true) {
        	UserRepositories userrepositories = new UserRepositories();
        	Scanner sc = new Scanner(System.in);
        	
        	System.err.println("Vehicle Management System");
        	System.out.println("THANK YOU!!, Please select as per choice :");
        	System.out.println("1.Get details of single vehicle");
        	System.out.println("2.Get detailed list of vehicle");
        	System.out.println("3.Add your vehicle details");
        	System.out.println("4.Remove vehicle details");
        	System.out.println("5.Update vehicle details ");
        	System.out.println("Enter your choice : ");
        	int choice = sc.nextInt();
        	
        	switch(choice) {
        	case 1 :{
        		System.out.println("Enter a Vehicle Id :");
        		Scanner s = new Scanner(System.in);
        		int vehicleId = s.nextInt();
        		userrepositories.getSingleVehicleDetails(vehicleId);
        		break;
        	}
        	case 2 :{
        		System.out.println("List of vehicle details : ");
        		userrepositories.getListOfVehicleDetails();;
        		break;
        	}
        	case 3 :{
        		System.out.println("Enter a name of vehicle you want to add :");
        		Scanner s1 = new Scanner(System.in);
        		String toAdd = s1.nextLine();
        		userrepositories.toAddVehicleDetail(toAdd);
        		break;
        	}
        	
        	case 4: {
        		System.out.println("Enter VehicleId of that details you want to remove :");
        		Scanner s2 = new Scanner(System.in);
        		int remove = s2.nextInt();
        		userrepositories.toRemoveVehicleDetail(remove);
        		break;
        	}
        	
        	case 5 :{
        	 System.out.println("Enter vehicleId of that details you want to update :");
        	 Scanner s3 = new Scanner(System.in);
        	 int update = s3.nextInt();
        	 userrepositories.toUpdateVehicleDetail(update);;
        	 break;
        	}
        	default:
        	}
        }
      
    
    }
}
