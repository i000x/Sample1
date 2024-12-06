public class Main {
    public static void main(String[] args) {
        // Create an instance of MyIncDec
        IncDec myIncDec = new MyIncDec(0);

        // Wrap MyIncDec instance with TimedIncDec to measure execution time
        IncDec timedIncDec = new TimedIncDec(myIncDec);

        // Perform operations
        timedIncDec.increment();
        timedIncDec.decrement();
    }
}
