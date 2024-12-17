package may.ex_14052024;

public class BankAccount {
    //Instance variable
    String bankName;
    int balance;
    String bankCode;

     BankAccount(String bankName, int balance, String bankCode) {
        this.bankName = bankName;
        this.balance = balance;
        this.bankCode = bankCode;
    }
     BankAccount(String bankName,  String bankCode) {
        this.bankName = bankName;
        this.bankCode = bankCode;
    }


    BankAccount(){
        bankName = "SBI";
        bankCode = "SBI001";
        balance= 0;


    }
    void printDetails() {
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
}
