public abstract class Account implements IBaseRate {
    
    String name;
    String sSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;

    public Account(String name,String sSN, double initDeposit){
        this.name=name;
        this.sSN= sSN;
        balance=initDeposit;
        

        index++;
        this.accountNumber = setAccountNumber();
        setRate();
        
    }

    public abstract void setRate();
    
    private String setAccountNumber(){
        String last2ofSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return last2ofSSN+ uniqueID+ randomNumber;
    }

    public void showInfo(){
        System.out.println(
            "NAME: "+ name +
            "\nACCOUNT NUMBER: "+ accountNumber +
            "\nBalance: "+ balance +
            "\nRate: " + rate + "%"
        );
    }
}