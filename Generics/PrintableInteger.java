package Generics;

public class PrintableInteger extends Number implements Printable<Integer> {
    private Integer value;

    public PrintableInteger(Integer value) {
        this.value = value;
    }

    @Override
    public int intValue() {
        return this.value;
    }

    @Override
    public long longValue() {
        return this.value;
    }

    @Override
    public float floatValue() {
        return this.value;
    }

    @Override
    public double doubleValue() {
        return this.value;
    }

    @Override
    public void print(Integer t) {
        System.out.println(t);
    }

}
