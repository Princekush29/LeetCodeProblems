package pq;

class First1s
{
    static void staticMethod()
    {
        System.out.println("Static Method");
    }
}

public class StaticMethodCall
{
    public static void main(String[] args)
    {
    	First1s first = null;

        first.staticMethod();
    }
}