public class Main {
    public static void main(String[] args)
    {
        CashRegister r1 = new CashRegister();
        Cashier c1 = new Cashier("Loba", r1,
                5000);
        Cashier c2 = new Cashier("Svetlana", r1,
                5000);
        Cashier c3 = new Cashier("Tatiana", r1,
                5000);
        c1.start();  // insert 200
        c2.start(); // insert 300
        c3.start(); // insert 500;
        try {
            c1.join();
            c2.join();
            c3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(r1.checkAmount());
    }
}