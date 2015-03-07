public class RegularExpressionDemo {
    public static void main(String [] args) throws IOException{
        String text = "abcdebcadxbc";
        String[] tokens = text.split(".bc");
        for (String token: tokens){
            System.out.print(token + " ");
        }
        System.out.println();
    }

}
