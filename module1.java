import java.lang.*;
import java.util.*;
import java.io.Console;

public class Main {
    public static void main(String[] args) {
        boolean count = false;
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
                    break;
                }
            }
            if(count){
                System.out.print("Authentication Successfull");
            }
            else{
                System.out.println("Authentication Failed");
            }
           } catch (Exception e) {
}
    }
}