package Operators;

public class BankAccount {
    public static void main(String[] args){
    double balance = 1000.75;
    int ticket = 250;
    double amountToWithdraw = 250;
    double updatedBalance = balance - amountToWithdraw;
    double amountForEachFriend = updatedBalance/3;
    boolean canPurchaseTicket = amountForEachFriend > ticket;
    System.out.println(canPurchaseTicket);
    String moneyforfriends = "I gave each friend " + amountForEachFriend;
    System.out.println(moneyforfriends);
  }       
}

