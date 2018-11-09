package lesson6.calculator;

public class Plus extends Action
{
    public Plus(int var1, int var2)
    {
        super(var1, var2);
        this.work();
    }

    @Override
    public int work()
    {
        return this.getVar1()+this.getVar2();
    }
}
