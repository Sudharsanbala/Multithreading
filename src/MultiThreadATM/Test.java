package MultiThreadATM;

public class Test {

    public static void main(String [] args){

        ATMmachine a1=new ATMmachine();
        Customer c1=new Customer("Smith",100,a1);
        Customer c2=new Customer("John",200,a1);
        c1.start();
        c2.start();

    }

}
