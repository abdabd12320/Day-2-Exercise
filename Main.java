import java.util.Scanner;
import java.util.Locale;
public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.US);

        Ex1:
        System.out.print("Enter your Height(m): ");
        Double h = in.nextDouble();
        h *=1000;
        System.out.print("Enter your Weight(kg): ");
        Double w = in.nextDouble();

        System.out.println("BMI = " + (h/w));
        System.out.println("--------------------------");
        // Ex2
        System.out.print("Enter your Obtained Marks: ");
        int o_m = in.nextInt();
        System.out.print("Enter your Total Marks: ");
        int o_t = in.nextInt();
        double p = o_m;
        System.out.println("Percentage = " + p + "%");
        System.out.println("--------------------------");
        //Ex3
        System.out.print("Enter amount in USD: ");
        Double u = in.nextDouble();
        System.out.print("Enter Exchange Rate(USD to EUR): ");
        Double e = in.nextDouble();
        System.out.println("Amount in EUR = " + (u*e));
        System.out.println("--------------------------");
        //Ex4
        System.out.print("Enter your String: ");
        in.nextLine();
        String sss = in.nextLine();
        String r = "";
        for(int i=sss.length()-1;i>=0;i--)
        {
            r += sss.charAt(i);
        }
        System.out.println("Length of the string : " + sss.length() + " And Reversed string : " + r);
        System.out.println("--------------------------");
        //Ex5
        System.out.print("Enter Sentence: ");
        String sentence = in.nextLine();
        System.out.print("Enter Start index: ");
        int s_index = in.nextInt();
        System.out.print("Enter End index: ");
        int e_index = in.nextInt();

        String exp = sentence.substring(s_index,e_index);
        System.out.println("Expected Sentence : " + exp);
        System.out.println("--------------------------");
        //Ex6
        System.out.print("Enter sentence: ");in.nextLine();
        String sen = in.nextLine();
        System.out.print("Enter keyword: ");
        String key = in.nextLine();
        CharSequence cc = key;
        if(sen.contains(cc))
        {
            System.out.println("Keyword: " + key + " is present");
        }
        System.out.println("--------------------------");

        //Ex7
        System.out.print("Enter Sentence: ");
        String sentence3 = in.nextLine();
        System.out.print("Enter Replace: ");
        String rep = in.nextLine();
        System.out.print("Enter Replacement: ");
        String rep2 = in.nextLine();
        String exp2 = sentence3.replaceAll(rep,rep2);
        System.out.println("Expected Sentence : " + exp2);
        System.out.println("--------------------------");
        //Ex8
        System.out.print("Enter String1: ");
        String string1 = in.nextLine();
        System.out.print("Enter String2: ");
        String string2 = in.nextLine();
        if(string1.equalsIgnoreCase(string2) == true)
            System.out.println("String are equal");
        else
            System.out.println("String are not equal");
    }
}