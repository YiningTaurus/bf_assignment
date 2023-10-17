package week1day2;

/*
* Create your own int wrapper class.
* Hint: What are the fields, and constructor, and which method should your wrapper class include
* (intValue(), shortValue(), equals() etc.)
* */
public final class P8OwnWrapper {
    private final int value;

    public P8OwnWrapper(int value) {
        this.value = value;
    }

    public int intValue() {
        return value;
    }

    public short shortValue() {
        return (short) value;
    }

    public double doubleValue() {
        return (double) value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        P8OwnWrapper that = (P8OwnWrapper) o;
        return value == that.value;
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(value);
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }

    public static void main(String[] args) {
        P8OwnWrapper myint = new P8OwnWrapper(7);
        System.out.println(myint.doubleValue());
    }
}
