public class TimedIncDec implements IncDec {
    private final IncDec decoratedIncDec;

    public TimedIncDec(IncDec decoratedIncDec) {
        this.decoratedIncDec = decoratedIncDec;
    }

    @Override
    public void increment() {
        long startTime = System.currentTimeMillis();
        decoratedIncDec.increment();  // Call the wrapped object's increment method
        long endTime = System.currentTimeMillis();
        System.out.println("increment() took " + (endTime - startTime) + " milliseconds");
    }

    @Override
    public void decrement() {
        long startTime = System.currentTimeMillis();
        decoratedIncDec.decrement();  // Call the wrapped object's decrement method
        long endTime = System.currentTimeMillis();
        System.out.println("decrement() took " + (endTime - startTime) + " milliseconds");
    }
}
