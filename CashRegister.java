public class CashRegister
{
    private int amount;

    public CashRegister()
    {
        amount = 0;
    }

    public synchronized void deposit(int amount)
    {
        this.amount += amount;
    }
    public synchronized int checkAmount()
    {
        return  this.amount;
    }
}
