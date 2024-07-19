package Functions;

public class Main {
    public static void main(String[] args) {
      SavingsAccount savings = new SavingsAccount(2000);
          
      savings.checkBalance();
          
      savings.withdraw(300);
          
      savings.checkBalance();
          
      savings.deposit(600);
          
      savings.checkBalance();
          
      savings.deposit(600);
          
      savings.checkBalance();
          
      System.out.println(savings);
    }
  }
  
