package vehiclerent;

public class Customer 
{
    private String name;
    private Vehicle rentedVehicle;
    private int rentalDays;
    
    public Customer(String name,Vehicle rentedVehicle,int rentalDays)
    {
        setName(name);
        setRentedVehicle(rentedVehicle);
        setRentalDays(rentalDays);
    }

    public void setName(String name) 
    {
        this.name = name;
    }

    public void setRentedVehicle(Vehicle rentedVehicle) 
    {
        this.rentedVehicle = rentedVehicle;
    }

    public void setRentalDays(int rentalDays) 
    {
        this.rentalDays = rentalDays;
    }

    public String getName() 
    {
        return name;
    }

    public Vehicle getRentedVehicle() 
    {
        return rentedVehicle;
    }

    public int getRentalDays() 
    {
        return rentalDays;
    }
    public double getAdditionalRate()
    {
        double additionalRate=1.0;
        if(rentedVehicle.getType().equals("Car"))
        {
            additionalRate=1.2;
        }
        return additionalRate;
    }
    public String printInvoice()
    {
        String msg="        ===Invoice===       \n";
        msg+="\nCustomer Name         : "+getName();
        msg+="\nRented Vehicle Type   : "+rentedVehicle.getType();
        msg+="\nRented Vehicle Brand  : "+rentedVehicle.getBrand();
        msg+="\nRented Vehicle Model  : "+rentedVehicle.getModel();
        msg+="\nVehicle Base Rate     : "+rentedVehicle.getBaseRate();
        msg+="\nNumber of Rented Days : "+getRentalDays();
        msg+="\nAdditional Rate       : "+getAdditionalRate();
        msg+="\nTotal Amount of Rent  : "+rentedVehicle.calculateRent(rentalDays);
        return msg;
    }
    
}
