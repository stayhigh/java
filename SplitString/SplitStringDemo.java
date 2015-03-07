public class SplitStringDemo{
    public static void main (String[] args){
        String [] rawData = { 
            "hello1\tworld1",
            "hello2\tworld2"
        };

        for (String sentence: rawData){
            String[] tokens = sentence.split("\t");
            for (String token: tokens){
                System.out.print(token + "\t|");
            }
            System.out.println();

        }
    }
}
