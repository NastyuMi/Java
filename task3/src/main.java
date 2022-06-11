import java.util.Scanner;

public class main {
    static String maxWord(String sentence )
    {
        String[]words = sentence .split(" ");
        String result="";
        for(String word: words)
        {
            if(word.length()>result.length())
                result=word;
        }
        return(result);
    }

    static String reverseSecondWord (String sentence )
    {
        String[]words = sentence .split(" ");
        String word= words[1];
        String result="";
        for(int i=word.length()-1; i >= 0; i--)
        {
            result+=word.charAt(i);
        }
        return result;
    }

    static void pattern_for_US_currency (String sentence )
    {
        String parts[]=sentence.split(" ");
        String regEx = "^[-]?[$]\\d{1,3}(\\d{3})*\\.\\d{2}$";

        System.out.println("\nCurrency occurrences:");
        for (String part : parts) {
            if(part.matches(regEx)) {
                System.out.println(part);
            }
        }
    }

    static public void main(String args[])
    {
        while (true)
        {
            Scanner cin = new Scanner(System.in);
            System.out.print("Input sentence: ");
            String sentence= cin.nextLine();
            System.out.print("Enter  number of task: ");
            int task = Integer.parseInt(cin.nextLine());

            switch (task){
            case (1):
                System.out.println(maxWord(sentence));
                System.out.println(maxWord(sentence).length());
                System.out.println(reverseSecondWord(sentence));
                break;
            case (2):
                sentence = sentence.replaceAll("( )+", " ");
                System.out.println(sentence);
                break;
            case (3):
                pattern_for_US_currency(sentence);
                break;
            default:
                System.out.print("\nNothing selected: ");
                break;
            }
        }

    }
}
