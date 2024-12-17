package may.ex_04052024;

public class Lab143 {
    public static void main(String[] args) {
        String s1 = "pramod"; //scp
        String s2 = new String("pramod");//OA


        // String  - Immutable -> Once created can't be changed.

        StringBuffer StringBuffer = new StringBuffer("pramod");
        StringBuffer.append("Dutta");
        StringBuffer.reverse();
        System.out.println(StringBuffer);
        //pramodDutta

        StringBuilder StringBuilder = new StringBuilder("Pramod");
        StringBuilder.append("Dutta");

        String password = "pass@123";
        password = "123";

        // Mutable - that can be changed!!
        StringBuilder password2 = new StringBuilder("Pramod");
        password2.append(" Dutta");
        System.out.println(password2);


    }
}



