package bankaccountapp;

import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "C:\\Users\\admin\\Documents\\HW stuff\\JAVA\\day9\\CustList.csv";
    //    Checking chkacc1 = new Checking("Tom Wilson","123456789", 1500);
       
    //    Savings savacc1 = new Savings("Rich Lowe", "987654321", 2500);
       

    //     savacc1.compound();
    //     chkacc1.showInfo();
    //     System.out.println("***********************");
    //     savacc1.showInfo();

        List<String[]> newAccountHolder = utilities.CSV.read(file);
        for (String[] accountHolder : newAccountHolder){
            System.out.println(accountHolder[0]);
            System.out.println(accountHolder[1]);
            System.out.println(accountHolder[2]);
        }
    }
}