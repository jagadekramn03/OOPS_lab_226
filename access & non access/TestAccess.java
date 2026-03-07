class AccessExample
{
    private int a = 10;        
    int b = 20;                
    protected int c = 30;      
    public int d = 40;         

    void display()
    {
        System.out.println("Private a = " + a);
        System.out.println("Default b = " + b);
        System.out.println("Protected c = " + c);
        System.out.println("Public d = " + d);
    }
}

public class TestAccess
{
    public static void main(String args[])
    {
        AccessExample obj = new AccessExample();
        System.out.println("Default b = " + obj.b);
        System.out.println("Protected c = " + obj.c);
        System.out.println("Public d = " + obj.d);

        obj.display();
    }
}