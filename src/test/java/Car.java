public class Car {
    // static
    static int count = 0;
    int countInstance = 0;
    static int wheels; // define once

    // instance variables
    private long price;
    private String color;
    private String brand;

    public long getPrice()
    {
        return price;
    }

    public String getColor()
    {
        return color;
    }

    public String getBrand()
    {
        return brand;
    }
    // this - is keyword , used for referringto current object properties
    // this() - is a method, to access current object constructor
    public void setProperties(long price)
    {
        System.out.println("int method");
        this.price = price;
    }

    public void setProperties(long price, String color, String brand)
    {
        System.out.println("3 argument method");
        this.price = price;
        this.color = color;
        this.brand = brand;
    }

    public void setProperties(long price, String color)
    {
        System.out.println("2 argument method");
        this.price = price;
        this.color = color;
    }






    public Car()
    {
        System.out.println("default Consturctor");
        System.out.println("Object No. " + ++count);
        countInstance = countInstance+1;
        price = 10000;
        color = "red";
        brand = "Maruti";
        wheels = 4;
    }

//    {
//        System.out.println("instance block");
//        price = 10000;
//        color = "red";
//        brand = "Maruti";
//        wheels = 4;
//    }
//
//    // int consturctor
//    public Car(int priceNew)
//    {
//        System.out.println("int constructor");
//        price = priceNew;
//    }
//
//
//    public Car(int price, String color, String brand, int wheels)
//    {
//        System.out.println("paramter constructor");
//        price = price;
//        color = color;
//        brand = brand;
//        wheels = wheels;
//    }
}
