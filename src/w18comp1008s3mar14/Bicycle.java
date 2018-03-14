package w18comp1008s3mar14;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author JWright
 */
public class Bicycle
{
    private String brand, style;
    private int gears;
    private double price;

    public Bicycle(String brand, String style, int gears, double price)
    {
        setBrand(brand);
        setStyle(style);
        setGears(gears);
        setPrice(price);
    }

    public String getBrand()
    {
        return brand;
    }

    public void setBrand(String brand)
    {
        String[] validBrands = {"Cannondale","Giant","Trek","Rocky Mountain","Diamond Back"};

        for (String validBrand : validBrands)
        {
            if (validBrand.equalsIgnoreCase(brand))
            {
                this.brand = validBrand;
                return;
            }
        }
        throw new IllegalArgumentException("Valid brands are: Rocky Mountain, etc...");
    }

    public String getStyle()
    {
        return style;
    }

    public void setStyle(String style)
    {
        String[] styles = {"mountain","road","hybrid"};
        List styleList = Arrays.asList(styles);
        
        if (styleList.contains(style.toLowerCase()))
            this.style = style.toLowerCase();
        else
            throw new IllegalArgumentException("style must be mountain,road or hybrid");
    }

    public int getGears()
    {
        return gears;
    }

    public void setGears(int gears)
    {
        if (gears >= 1 && gears <= 24)
            this.gears = gears;
        else
            throw new IllegalArgumentException("Gears need to be in the range of 1-24");
    }

    public double getPrice()
    {
        return price;
    }

    public void setPrice(double price)
    {
        if (price > 0)
            this.price = price;
        else
            throw new IllegalArgumentException("Price should be greater than 0");
    }
    
    public String toString()
    {
        return String.format("%s %s bike", getBrand(), getStyle());
    }
    
    
}
