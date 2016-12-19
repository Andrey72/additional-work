package task.model;

/**
 * Created by Sherlock on 18.12.2016.
 */
public class Student {
   private   String name;
   private   String phone;
   private   String email;

 private  MyDate myData = new MyDate();

 private double paidMony;

 private String city;
 private String street;
 private String houseNum;

 private   int taskCount;
    public String convertStudent(){
        return String.format("name %s, phone %s, money %2f, birthDay %d",
                name, phone, paidMony, myData.birthDay);
    }

    public void init(String name, String phone, String city, double  paidMoney) {

        Student me = this;

        me.name = name;
        me.city = city;
        me.phone = phone;
        me.paidMony = paidMoney;
    }
}
