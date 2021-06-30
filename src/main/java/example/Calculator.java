package example;

public class Calculator {

    private int memory;

    public Calculator(){
        this.memory = 0;
    }

    public void inc (int i){
        this.memory += i;
    }

    public int getMemory(){
        return this.memory;
    }

    public int add(int first, int second) {
        return first+ second;
    }

    public int multiply(int i, int j) {
        return i*j;
    }

    public int divide(int i, int j) {
        return i/j;
    }

    public int subtract(int i, int j) {
        return i-j;
    }
}
