import java.io.*;

class OverridingRules{

    public static void pub_static_method(){ System.out.println("Hello pub_static_method");};
    protected static void pro_static_method(){System.out.println("Hello pro_static_method");};
    private static void pri_static_method(){System.out.println("Hello pri_static_method");};
    public void pub_method(){System.out.println("Hello pub_method");};
    protected void pro_method(){System.out.println("Hello pro_method");};
    private void pri_method(){System.out.println("Hello pri_method");};
    
    public static void main(String [] args){
        System.out.println("Hello World");
        OverridingRules superobj = new OverridingRules ();
        Subclass subobj = new Subclass ();
        subobj.pub_static_method();
        subobj.pro_static_method();
        //subobj.pri_static_method(); //error
        subobj.pub_method();
        subobj.pro_method();
        //subobj.pri_method(); //error
        subobj.final_pub_static_method();
    }
}

class Subclass extends OverridingRules{
    public static void pub_static_method(){ System.out.println("Subclass Hello pub_static_method");};
    protected static void pro_static_method(){System.out.println("Subclass Hello pro_static_method");};
    private static void pri_static_method(){System.out.println("Subclass Hello pri_static_method");};
    public void pub_method(){System.out.println("Subclass Hello pub_method");};
    protected void pro_method(){System.out.println("Subclass Hello pro_method");};
    private void pri_method(){System.out.println("Subclass Hello pri_method");};
}
