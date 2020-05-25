package bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();


        String file = "C:\\Users\\admin\\Documents\\HW stuff\\JAVA\\day9\\CustList.csv";
    //    Checking chkacc1 = new Checking("Tom Wilson","123456789", 1500);
       
    //    Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
       

    //     savacc1.compound();
    //     chkacc1.showInfo();
    //     System.out.println("***********************");
    //     savacc1.showInfo();

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            String name = accountHolder[0];
            String sSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit= Double.parseDouble(accountHolder[3]);
            // System.out.println(name + " " + sSN + " " + accountType+ " $ "+initDeposit);
            if(accountType.equals("Savings")){
                
                accounts.add(new Savings(name, sSN, initDeposit));
            }else if(accountType.equals("Checking")) {
                
                accounts.add(new Checking(name, sSN, initDeposit));
            }else {
                System.out.println("ERROR reading account type");
            }
        }

        for(Account acc : accounts){
            System.out.println("*******************\n");
            acc.showInfo();
        }

    }
}