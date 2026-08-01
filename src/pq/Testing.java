package pq;

public class Testing {
    private int value;

    public Testing() {
        this.value = 0;
    }

    public Testing(int v) {
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
