public class MyIncDec implements IncDec {
    private int x;

    public MyIncDec(int x) {
        this.x = x;
    }

    @Override
    public void increment() {
        this.x++;
    }

    @Override
    public void decrement() {
        this.x--;
    }
}
