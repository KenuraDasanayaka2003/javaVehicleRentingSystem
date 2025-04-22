package vehiclerent;

public abstract class Vehicle implements Rentable
{
    private String brand;
    private String model;
    private double baseRate;
    
    public Vehicle(String brand,String model,double baseRate)
    {
        setBrand(brand);
        setModel(model);
        setBaseRate(baseRate);
    }

    public void setBrand(String brand) 
    {
        this.brand = brand;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public void setBaseRate(double baseRate) 
    {
        this.baseRate = baseRate;
    }

    public String getBrand() 
    {
        return brand;
    }

    public String getModel() 
    {
        return model;
    }

    public double getBaseRate() 
    {
        return baseRate;
    }
    
    
    
    public abstract String getType();
    
    @Override
    public String toString()
    {
       String msg;
       msg ="\nVehicle Brand     : "+getBrand();
       msg+="\nVehicle Model     : "+getModel();
       msg+="\nVehicle Base Rate : "+getBaseRate();
       return msg;
    }
}
