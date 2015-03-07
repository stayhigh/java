import java.io.*;

public class Hello{
    public static void main(String[] args) throws IOException{
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( System.in));
        System.out.print("input a line of text which could contains blank: ");
        String text = bufferedReader.readLine();
        System.out.println("your input is: " + text );
    }
}
