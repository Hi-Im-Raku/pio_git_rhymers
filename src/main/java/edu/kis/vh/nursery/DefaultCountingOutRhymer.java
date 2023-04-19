package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int EMPTY = -1;
    public static int IF_EMPTY = -1;

    public static int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY;


    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == EMPTY;
    }

    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    protected int peekaBoo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
