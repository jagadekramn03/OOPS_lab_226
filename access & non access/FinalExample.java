class FinalExample
{
    final int a = 10;

    void show()
    {
        System.out.println("Final value: " + a);
    }

    public static void main(String args[])
    {
        FinalExample obj = new FinalExample();
        obj.show();
    }
}