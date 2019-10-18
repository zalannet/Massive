public class MethodsOverload {
    public void main(String[] args) {

        System.out.println(sum(2, 3));
        System.out.println(sum(4.5, 3.2));
        System.out.println(sum(4, 3, 7));
        System.out.println(sum("Привет,", "автотестер"));
    }

    private int sum(int a, int b) {

        return a + b;
    }

    private double sum(double a, double b) {

        return a + b;
    }

    private int sum(int a, int b, int c) {

        return a + b + c;
    }

    private String sum(String a, String b) {

        return a + b;
    }

}

