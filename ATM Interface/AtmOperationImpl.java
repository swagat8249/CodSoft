package swagat;

import java.util.HashMap;
import java.util.Map;

public class AtmOperationImpl implements AtmOperations {
    ATM atm=new ATM();
    Map<Double,String> ministmt= new HashMap<>();
    @Override
    public void viewBalance() {

        System.out.println("Available Balance is: "+atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0) {
            if (atm.getBalance() >= withdrawAmount) {
                ministmt.put(withdrawAmount, "Amount Withdraw");
                System.out.println("Collect the cash " + withdrawAmount);
                atm.setBalance(atm.getBalance() - withdrawAmount);
                viewBalance();
            } else {
                System.out.println("Transaction failed.\n**Insufficient Balance**");
            }
        } else {
            System.out.println("Transaction failed.\nPlease enter the amount in multiple of 500");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount,"Amount Deposited");
        System.out.println(depositAmount+" deposited successfully");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
}
