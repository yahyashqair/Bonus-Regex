import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    public static void main(String[] arg){

        while(true){
            System.out.flush();
            System.out.println("------------------------------------------");
            System.out.println("---- Welcome to Validation Program ------- ");
            System.out.println("----- Select one of these cheeses -------- ");
            System.out.println("---------- 1- Email Validation ----------- ");
            System.out.println("-------- 2-MAC address validation -------- ");
            System.out.println("-------- 3-ipv4 address validation ------- ");
            int operation ;
            String input ;
            Scanner scanner=new Scanner(System.in);
            operation=scanner.nextInt();
            System.out.println("Please enter your input :");
            input=scanner.next();
            if(operation==1){
                doEmailValidate(input);
            }else if (operation==2){
                doMacValidate(input);
            }else{
                doIpv4Validate(input);
            }
            System.out.println("Press \"ENTER\" to continue... ");
            scanner.nextLine();
            scanner.nextLine();

        }








    }
     static void doEmailValidate(String x){
        if(testInput("^[a-z]\\w{2,50}@\\w{2,20}[.][a-z]{1,5}$",x)){
            System.out.println("Valid Email ... ");
        }else{
            System.out.println("Not Valid Email");
        }
    }
    static  void doMacValidate(String x){
        if(testInput("^[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}:[0-9A-Fa-f]{2}$",x)){
            System.out.println("Valid MAC Address ... ");
        }else{
            System.out.println("Not Valid MAC Address");
        }
    }
    static  void doIpv4Validate(String x){
        if(testInput("^([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])[.]([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])$",x)){
            System.out.println("Valid Ipv4 Address ... ");
        }else{
            System.out.println("Not Valid Ipv4 Address ");
        }
    }

    public static boolean testInput(String regex,String input){
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(input);
        while (matcher.find()) {
            return true;
        }
        return false;
    }

}
