package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static int EMPTY = -1;
    public static int IF_EMPTY = -1;

    public static int MAX_SIZE = 12;
    private final int[] numbers = new int[MAX_SIZE];

    public int total = EMPTY;


    /**
     *
     * @param in
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     *
     * @return result of logical operation (1 if total equals to EMPTY, 0 if they differ)
     */
    public boolean callCheck() {
        return total == EMPTY;
    }

    /**
     *
     * @return result of logical operation (1 if total equals to MAX_SIZE-1, 0 if they differ)
     */
    public boolean isFull() {
        return total == (MAX_SIZE - 1);
    }

    /**
     *
     * @return IF_EMPTY if callCheck() return 0, numbers[total] if callCheck() returns 1
     */
    protected int peekaBoo() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total];
    }

    /**
     *
     * @return IF_EMPTY if callCheck() return 0, numbers[total--] if callCheck() returns 1
     */
    public int countOut() {
        if (callCheck())
            return IF_EMPTY;
        return numbers[total--];
    }

}
