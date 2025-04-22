package vehiclerent;

import java.util.ArrayList;
import java.util.Scanner;

public class VehicleRent 
{
    public static void main(String[] args) 
    {
        ArrayList<Vehicle> vehicles=new ArrayList<>();
        ArrayList<Vehicle> booked=new ArrayList<>();
        int choice;
        
        System.out.println("=====WELCOME TO ONLINE VEHICLE RENTING SYSTEM=====\n");
        do
        {
            displayMenu();
            Scanner sc1=new Scanner(System.in);
            System.out.print("Enter your choice : ");
            choice=sc1.nextInt();
            
            switch(choice)
            {
                case 1:
                {
                    addAVehicle(vehicles);
                    break;
                }
                case 2:
                {
                    getVehicleDetails(vehicles);
                    break;
                }
                case 3:
                {
                    bookAVehicle(vehicles,booked);
                    break;
                }
                case 4:
                {
                    printInvoice(booked);
                    break;
                }
                case 5:
                {
                    System.out.println("Exiting the system....");
                }
                default:
                {
                    System.out.println("Thank you for visiting the system.");
                    System.out.println("Have a nice day");
                }
                
            }
                
        }
        while(choice!=5);
    }
    public static void displayMenu()
    {
        System.out.println("1. Add a Vehicle");
        System.out.println("2. View all available vehicles");
        System.out.println("3. Book A vehicle");
        System.out.println("4. Print Invoice");
        System.out.println("5. Exit the system ");
    }
    public static void addAVehicle(ArrayList<Vehicle> vehicles)
    {
        Scanner sc2=new Scanner(System.in);
        
        System.out.print("Enter the type of the vehicle : ");
        String type=sc2.nextLine();
        System.out.print("Enter the Brand of the vehicle : ");
        String brand=sc2.nextLine();
        System.out.print("Enter the Model of the vehicle : ");
        String model=sc2.nextLine();
        System.out.print("Enter the Base Rate of the vehicle : ");
        double baseRate=sc2.nextDouble();
        
        if(type.equals("Car") || type.equals("car"))
        {
            Car c1=new Car(brand,model,baseRate);

            vehicles.add(c1);
        }
        else if(type.equals("Bike") || type.equals("bike"))
        {
            Bike b1=new Bike(brand,model,baseRate);
        
            vehicles.add(b1);
        }
        
    }
    public static void getVehicleDetails(ArrayList<Vehicle> vehicles)
    {
        for(Vehicle vehicle : vehicles)
        {
            System.out.println("\n");
            System.out.println(vehicle);
            System.out.println("\n");
        }
    }
    
    public static void bookAVehicle(ArrayList<Vehicle> vehicles,ArrayList<Vehicle> booked)
    {
        Scanner sc3=new Scanner(System.in);
       
        System.out.print("Enter the vehicle type you need : ");
        String type=sc3.nextLine();
        System.out.print("Enter the vehicle brand you need : ");
        String brand=sc3.nextLine();
        System.out.print("Enter the vehicle model you need : ");
        String model=sc3.nextLine();
        
        if(type.equals("Car"))
        {
            for(Vehicle v:vehicles)
            {
                if(v.getBrand().equals(brand) && v.getModel().equals(model))
                {
                    System.out.println("Booking is Successfull");
                    vehicles.remove(v);
                    booked.add(v);
                    
                    
                }
               
            }
            
            
        }
        else if(type.equals("Bike"))
        {
            for(Vehicle v:vehicles)
            {
                if(v.getBrand().equals(brand) && v.getModel().equals(model))
                {
                    System.out.println("Booking is Successfull");
                    vehicles.remove(v);
                    booked.add(v);
                    
                    
                }
               
            }
        }
        
    }
    public static void printInvoice(ArrayList<Vehicle> booked)
    {
        Vehicle vehicle=null;
        Scanner sc4=new Scanner(System.in);
        
        System.out.print("Enter customer's Name : ");
        String name=sc4.nextLine();
        System.out.print("Enter number of days you need to return vehicle : ");
        int days=sc4.nextInt();
        
        for(Vehicle v:booked)
        {
           vehicle=v;
        }
        
        Customer c=new Customer(name,vehicle,days);
        
        System.out.println(c.printInvoice());
    }
    
}

