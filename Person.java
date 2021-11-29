package SoftwareDev.com;

import javax.naming.Name;

public class Person  {
    private Name name;
    private  Address address;

    //create a default constructor
    public  Person(){
        this(new Name("FELIX","OTIENO"),
                new Address("Hassan were\n047\nNairobi\nNairobi county") );
    }
    //creating an interactive constructor
    public  Person(Name name,Address address){
        this.name=name;
        this.address=address;

    }
    public  Address getAddress(){
        return address;
    }
    public void  setAddress(Address address){
        this.address=address;
    }
    public Name getName(){
        return name;
    }
    public  void setName(Name name){
        this.name= name;
    }
    public  String toString(){
        return "\n"+name.getfullname()+"\n"+address.getFullAddress()+"\n";
    }
}
