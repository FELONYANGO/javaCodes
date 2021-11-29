package SoftwareDev.com;

import javax.naming.Name;

public class Borrower extends  Person{
    private  Mortgage mortgage;

    //create a default constructor
    public  Borrower(){
        super();
    }
    //an interactive borrower constructor with specified name and address
    public Borrower(Name name,Address address){
        super(name,address);
    }

    public Mortgage getMortgage() {
        return mortgage;
    }
    public  void setMortgage(Mortgage mortgage){
        this.mortgage=mortgage;
    }

    @Override
    public String toString() {
        return super.toString()+
            "Monthly payment is"+mortgage.monthlyPayment()+"\n"+
                    "total payment is "+mortgage.totalPayment();

    }
}
