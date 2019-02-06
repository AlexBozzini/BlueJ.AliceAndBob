/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args )
    {
        
        
        Scanner reader = new Scanner(System.in);
            System.out.print ("What is your name?");
           
            String name = reader.nextLine();
            
            if(name.equals ("Alice")) {
                System.out.print ("Hello Alice!");
            } else if (name.equals( "Bob")){
                System.out.print ("Hello Bob!");
            } else {
                System.out.print ("Goodbye");
            }
                
                
                
            }
                
                
            
            
        
        
        
        
        

    }

