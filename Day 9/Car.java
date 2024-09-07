class Car 
{
    int num = 2173;
    String name= "maruti suzuki";
    Car()
    {
        System.out.println("Name : " +name);
        System.err.println("Number : " +num);
    }
}
class car1
{
    public static void main(String[] args) {
        Car mycar = new Car();
    }
}
