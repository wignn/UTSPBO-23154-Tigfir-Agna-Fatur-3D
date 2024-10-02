package User;

import Hotel.Hotel;

public class Customer {
    private String Name, phone;
    private int age;
    Hotel hotel = new Hotel();
    public  Customer(String name, String phone, int age) {
        this.Name = name;
        this.phone = phone;
        this.age = age;
        hotel.setData(Name, phone, age);
    }




}
