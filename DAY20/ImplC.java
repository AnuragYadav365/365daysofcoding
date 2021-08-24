package DAY20;
interface BaseI{
    void method();
}

public BaseC{
    public void method(){
        System.out.println("Inside BaseC:: method");
    }
}

public class ImplC implements BaseI{
    public static void main(String[] args) {
        (new ImplC()).method();
    }
}
