//inheritance
class Super{
}

class Sub extends Super{
}

public class JavaProgramProtype{

    //Java basic data types
    byte bytedata;
    short shortdata;
    int intdata;
    long longdata;
    double doubledata;
    boolean booleandata;
    char chardata;

    //instance variables with access modifiers
    private static int private_instance_variable;
    protected static int protected_instance_variable;
    public static int public_instance_variable;

    //constructor overloading
    JavaProgramProtype(){
        private_instance_variable = 1;
        protected_instance_variable = 2;
        public_instance_variable = 3;
    }

    JavaProgramProtype(int private_instance_variable, int protected_instance_variable, int public_instance_variable){
        /*
         * 'this' keyword is used to differentiate the instance variables from local variables 
         * (left-side: instance variable, right-side: local variable)
         */
        this.private_instance_variable = private_instance_variable;
        this.protected_instance_variable = protected_instance_variable;
        this.public_instance_variable = public_instance_variable;
    }

    //method overloading
    public void publicmethod(){
        System.out.println("publicmethod:");
    }

    protected void protectedmethod(){
        System.out.println("publicmethod:");
    }

    private void privatemethod(){
        System.out.println("publicmethod:");
    }

    public void publicmethod(int num){
        System.out.println("publicmethod:" + num);
    }

    protected void protectedmethod(int num){
        System.out.println("publicmethod:" + num);
    }

    private void privatemethod(int num){
        System.out.println("publicmethod:" + num);
    }

    public static void main(String[] args){
        System.out.println("Hello World");
    }

    protected void finalize(){
        System.out.println("The object has been finalized.");
    }
}
