import java.lang.*;
import java.util.*;
import java.io.Console;

public class moudule3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        boolean count = false;
        boolean count1 =false;
        int mathi[] = new int[100];
        String mathc = null;
        try {
            String name[]={"nekelash","jayanth","hello","monish","mahaprabhu"};
            String passw[]={"neke","jaya","hello","moni","maha"};
            System.out.print("Enter your Username:");
            String username;
            username = s.nextLine();
            System.out.print("Enter your Password:");
            String password;
            password=s.nextLine();
            for (int i=0;i<name.length;i++){
                if(name[i].equals(username)&& passw[i].equals(password)){
                    count=true;
                    mathc=passw[i];
                    break;
                }
            }
            String password1;
            System.out.print("Re-enter your Password:");
            password1=s.nextLine();
            for (int i=0;i<name.length;i++){
                if(name[i].equals(username)&& passw[i].equals(password1)){
                    count1=true;
                    mathc=passw[i];
                    break;
                }
            }
            if(count&&count1){
                System.out.println("Authentication Successfull");
                System.out.println("Do you want to proceed further 1=YES 2=NO");
                int a=s.nextInt();
                if(a==1){
                    System.out.println("Welcome "+username+" to Account info page");
                    System.out.println("Enter the amount for deposit");
                    int amt=s.nextInt();
                    if(amt<1000){
                        System.out.println("The amount must be more than Rs.1000");
                    }
                    else{
                        System.out.println("Your "+amt+" is depostited in your 8721 5225 xxxx xxxx account");
                    }
                }
                else{
                    System.out.println("Wrong input");
                    System.out.println("Sorry for Security Reasons we are Closing the Application");
                }
            }
            else{
                System.out.println("Authentication Failed");
            }
        } catch (Exception e) {
        }


    }
}