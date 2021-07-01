package example;

public class Calculadora {
    public static int suma(int a, int b){
        return a+b;
    }
    public static int multi(int a, int b){
        return a*b;
    }
    public static Float divi(int a, int b){
        float af= (float) a;
        float bf= (float) b;
        return (af / bf);
    }

    public static int resta(int a, int b) {
        return a-b;
    }
}
