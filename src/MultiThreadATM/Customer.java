package MultiThreadATM;

import MultiThreadATM.ATMmachine;

public class Customer extends Thread {

    ATMmachine atMmachine;
    String name;

    int amount;

    public Customer(String name,int amount,ATMmachine atMmachine){
        this.name=name;
        this.amount=amount;
        this.atMmachine=atMmachine;
    }

    public void useATM(){
        atMmachine.checkBalance(name);
        atMmachine.withdraw(name,amount);
    }
    public void run(){
        useATM();
    }

}
