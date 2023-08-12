class test{
    public static void main(String args[])
    {
        System.out.println("Hello from main!");
        printHello n = new printHello();
        n.printWords();
        n.change("after change");
        n.printWords();
    } 
}