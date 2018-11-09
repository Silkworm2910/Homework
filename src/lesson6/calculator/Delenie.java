package lesson6.calculator;

public class Delenie extends Action
{
    public Delenie(int var1, int var2)
    {
        super(var1, var2);
        this.work();
    }

    public int work()
    {
        return this.getVar1()/this.getVar2(); // TODO обработать деление на 0
    }
}
