import java.lang.*;
import java.util.*;
import java.io.Console;

public class test {
    public static void main(String[] args) {
        boolean count = false;
        int mathi[] = new int[100];
        String mathc = null;
        try {
            String name[]={"nekelash","jayanth","hello","monish","mahaprabhu"};
            String passw[]={"neke","jaya","hello","moni","maha"};
            Scanner s = new Scanner(System.in);

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
            if(count){
                System.out.println("Authentication Successfull");
            }
            else{
                System.out.println("Authentication Failed");
            }
        } catch (Exception e) {
        }
        System.out.println("Your Encrypted Password is");
        int i = 0;
        while(i<mathc.length()){
            mathi[i]=mathc.codePointAt(i)+2;
            System.out.print((char)mathi[i]);
            i++;
        }
    }
}