package SoftwareDev.com;
import javax.swing.*;

public class Address {
    private String street;
    private  String code;
    private  String city;
    private String county;

    //creating a default constructor for the address
    public Address(){
        this("Hassan were\n047\nNairobi\nNairobi county");
    }

    //create the interactive constructor
    public  Address(String street,String city,String code,String county){
        this.street=street;
        this.city=city;
        this.code= code;
        this.county= county;

    }
    //get and return the new street
    public String getStreet(){
        return street;
    }
    //set new street
    public  void setStreet(String street){
        this.street=street;

    }
    //get and return new city
    public  String getCity(){
        return  city;
    }
    //set new city
    public void  setCity(String city){
        this.city=city;
    }
    public String getCode(){
        return  code;
    }
    public  void  setCode(String code)
    {
        this.code=code;

    }
    public  String getCounty(){
        return county;
    }
    public void setCounty(String county){
        this.county=county;
    }
    public  String getFullAddress(){
        return street + "\n"+ county+","+code+","+city+"\n";
    }
}




