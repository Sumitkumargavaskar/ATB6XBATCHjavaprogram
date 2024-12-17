package may.ex_14052024;

public class Lab172 {
    public static void main(String[] args) {
BankAccount sbi_ref = new BankAccount();
        sbi_ref.printDetails();

        BankAccount hdfc_ref = new BankAccount("hdfc", 10, "hdfc101");
        hdfc_ref.printDetails();

        BankAccount icici_ref = new BankAccount("icic", 20,"ICIC104");
        icici_ref.printDetails();

        BankAccount yesbank_ref = new BankAccount("YES bANK","YES005");
        yesbank_ref.printDetails();

    }

}
