public class Cashier extends Thread
{
    private String CashierName;
    private CashRegister cr;
    private int amountToDeposit;
    public Cashier(String CashierName, CashRegister cr,
                   int amountToDeposit)
    {
        this.CashierName = CashierName;
        this.cr = cr;
        this.amountToDeposit = amountToDeposit;
    }

    public void run()
    {
        for(int i=1; i<=amountToDeposit; i++)
        {
            cr.deposit(1);
        }
    }

}
