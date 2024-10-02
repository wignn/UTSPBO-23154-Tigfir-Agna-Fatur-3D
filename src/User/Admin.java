package User;

import Hotel.Hotel;

public class Admin  extends  Customer{
    Hotel hotel = new Hotel();
    public Admin(String Name, String phone, int age) {
        super(Name, phone, age);
        hotel.setData(Name, phone, age);
    }


}

