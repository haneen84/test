
package w8q3;

public class Account {
     private static int num;
     private int id;
    private double balance;
    
    
    public Account(){
        num++;
        id=num;
    }
    
    public int getId(){
        return id;
        
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setID(int id){
        this.id=id;
        
    }
    
    public void setBalance(double balance){
        this.balance=balance;
        
    }
    
    public static int getNum(){
        return num;
    }
    
    public static void setNum(int num){
        Account.num=num;
        
    }
    
    public  void withdraw(double amount){
        if(balance>=amount)
            balance-=amount;
        else
            System.out.println("Insufficient balance");
}
    
    
    
    public void deposit(double amount){
        balance+=amount;
        
    }
}