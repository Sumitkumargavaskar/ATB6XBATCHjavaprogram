package may.ex_23052024;

public class Lab207 {
    public static void main(String[] args) {
        OOC.SNIC snic = new OOC.SNIC();
        snic.show();
    }
}






class OOC{
    static int o = 10;
    int oa = 20;

    static class SNIC {
        void show() {
            System.out.println(o);
            //Non static member can not be aceess in the static class
           // System.out.println(oa);

        }
    }
}