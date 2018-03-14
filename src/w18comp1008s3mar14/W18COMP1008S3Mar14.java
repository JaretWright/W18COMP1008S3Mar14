package w18comp1008s3mar14;

import java.util.ArrayList;

/**
 *
 * @author JWright
 */
public class W18COMP1008S3Mar14
{public static void main(String[] args)
    {
        ArrayList<Bicycle> bikes = new ArrayList<>();
        bikes.add(new Bicycle("Cannondale","road",12,1399.33));
        bikes.add(new Bicycle("Rocky Mountain","mountain",24,1092.99));
        bikes.add(new Bicycle("Trek","road",20,1799.99));
        bikes.add(new Bicycle("Giant","hybrid",18,999.99));
        
        System.out.println("The bikes in the collection are:");
        for (Object bike:bikes)
            System.out.println("   " + bike);
        
        System.out.println();
        
        Bicycle cheapest = findCheapestBike(bikes);
        System.out.printf("The least expensive bike is priced at $%.2f, ",cheapest.getPrice());
        System.out.printf("it is the %s.%n", cheapest);
        
        checkForErrors();
    }
    
    public static void checkForErrors()
    {
        System.out.printf("%nChecking for errors%n");
        try{
            Bicycle bike = new Bicycle("Jdub","mountain",18,1000);
            System.err.println("Invalid bike brand should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Invalid Bike brand->%s%n",e.getMessage());
        }
        
        try{
            Bicycle bike = new Bicycle("Giant","dirt",18,1000);
            System.err.println("Invalid bike style should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Invalid Bike style->%s%n",e.getMessage());
        }
        
        try{
            Bicycle bike = new Bicycle("Giant","mountain",50,1000);
            System.err.println("Invalid gear amount should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Invalid gear amount->%s%n",e.getMessage());
        }
        
        try{
            Bicycle bike = new Bicycle("Giant","mountain",18,-1);
            System.err.println("Invalid price brand should have triggered an exception");
        }
        catch (IllegalArgumentException e)
        {
            System.out.printf("Invalid price ->%s%n",e.getMessage());
        }
    }
    
    /**
     * This method should accept an ArrayList of Bicycle objects and return
     * the Bicycle object with the lowest price
     */
    public static Bicycle findCheapestBike(ArrayList<Bicycle> listOfBikes)
    {
        if (!listOfBikes.isEmpty())
        {
            Bicycle cheapestBike = listOfBikes.get(0);
            
            for (Bicycle bikeToCompare : listOfBikes)
            {
                if (bikeToCompare.getPrice() < cheapestBike.getPrice())
                    cheapestBike = bikeToCompare;
            }
            return cheapestBike;
        }
        else
            return null;
    }
}


