import java.util.*;
class userAccount
{
    public double balance;
    public userAccount(double initBalanace)
    {
        balance = initBalanace;
    }
    public double getBalance()
    {
        return balance;
    }
    public boolean withdraw(double amount)
    {
        if(amount<=balance)
        {
        balance = balance-amount;
        return true;
        }
        else{
            return false;
        }
    }
    public void deposit(double amount)
    {
        balance+=amount;
    }
}
class ATMachine
{
    public int amt;
    public userAccount obj;       
    public ATMachine(userAccount ua)
    {
        obj = ua;
        System.out.println("\n\t*************** WELCOME TO ATM ***************");
    }  
    void loop()
    {
        System.out.println("\n 1. Check Balance");
        System.out.println("\n 2. Deposit Amount");
        System.out.println("\n 3. Withdraw Amount");
        System.out.println("\n 4. Exit");

    }
    void display()
    {
        while(true)
        {
            loop();
            Scanner sc = new Scanner(System.in);
            int opt;
            System.out.println("\n Enter Your Option : ");
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    System.out.println("\t CURRENT BALANCE : "+obj.getBalance());
                    break;
                case 2:
                    System.out.println("\n ENTER AMOUNT TO DEPOSIT : ");
                    amt = sc.nextInt();
                    obj.deposit(amt);
                    break;
                case 3:
                    System.out.println("\n ENTER AMOUNT TO WITHDRAW : ");
                    amt = sc.nextInt();
                    obj.withdraw(amt);
                    break;
                case 4:
                    System.out.println("\t ######## THANKS FOR VISITING ATM !! ########");
                    sc.close();
                    return;
                default: System.out.println("\t INVALID OPTION !!!!");
                    break;
            }
        }
    }
}
public class Task_3 {

    public static void main(String args[])
    {
        userAccount obj = new userAccount(5000);
        ATMachine obj2 = new ATMachine(obj);
        obj2.display();
    }
}