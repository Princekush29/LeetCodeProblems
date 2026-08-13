package pq;

public class Test1 {
    private int value;

    public Test1() {
        this.value = 0;
    }

    public Test1(int v) {
        this.value = v;
    }

    @Override
    public int hashCode() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
