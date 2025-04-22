package vehiclerent;

public class Bike extends Vehicle implements Rentable 
{
    private String type;
    
    public Bike(String brand,String model,double baseRate)
    {
        super(brand,model,baseRate);
        setType("Bike");
    }

    public void setType(String type) 
    {
        this.type = type;
    }
    @Override
    public String getType() 
    {
        return type;
    }
    
    @Override
    public double calculateRent(int days)
    {
        double rent=getBaseRate()*days*1.0;
        return rent;
    }
    @Override
    public String toString()
    {
        String msg;
        msg ="Vehicle Type     : "+getType();
        msg+=super.toString();
        return msg;
    }
    
}
