package June.ex_18062024;

public class NoDesignPattern {
    public void step1() {
        System.out.println("step1");
    }

    public void step2() {
        System.out.println("step2");
    }

        public void step3() {
            System.out.println("step3");
        }

    public static void main(String[] args) {
        NoDesignPattern noDesignPattern = new NoDesignPattern();
        noDesignPattern.step1();
        noDesignPattern.step2();
        noDesignPattern.step3();
    }
    }


