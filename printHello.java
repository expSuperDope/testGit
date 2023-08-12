public class printHello {

    private String fun;

    public printHello()
    {
        this.fun = "hello from function";
    }

    public void printWords()
    {
        
        System.out.println(fun);
    }

    public void change(String n)
    {
        fun = n;
    }
}
