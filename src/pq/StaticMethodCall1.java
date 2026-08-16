package pq;
class First
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class StaticMethodCall1
{
    public static void main(String[] args)
    {
        First first = null;

        first.staticMethod();
    }
}
