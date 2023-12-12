public class SuperCounter extends Counter {

    public SuperCounter(int initialValue) {
        super(initialValue);
    }

    public void addN(int n) {
        for (int i = 0; i < n; i++) {
            add1();
        }
    }

    public static void main(String[] args) {
        // Example usage
        SuperCounter superCounter = new SuperCounter(5);
        System.out.println("Initial Counter Value: " + superCounter.getCounter());

        superCounter.addN(3);
        System.out.println("Counter after adding 3: " + superCounter.getCounter());
    }
}
