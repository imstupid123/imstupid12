
/**
 * Write a description of class asd here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class Family
{
    public static void main(String [] args) throws IOException
    {
        int gg = 0;
        int bb = 0;
        int gb = 0;
        String token = "";
        Scanner inFile = new Scanner(new File("MaleFemaleFamily.txt"));
        
        while(inFile.hasNext())
        {
         token = inFile.next();
        
        
        if(token.equalsIgnoreCase("gg"))
        {
            gg++;
            token = inFile.next();

        }
        else if(token.equalsIgnoreCase("bb"))
        {
            bb++;
            token = inFile.next();
        }
        else
        {
            gb++;
            token = inFile.next();
        }
        }
        inFile.close();
        
   
        
        int sampleSize = bb + gg + gb;
        int boyBoyPercent = bb / sampleSize;
        int girlBoyPercent = gb / sampleSize;
        int girlGirlPercent = gg / sampleSize;
        
        System.out.println("Sample size: " + sampleSize);
        System.out.println("Two boys: " + boyBoyPercent);
        System.out.println("Two girls: " + girlGirlPercent);
        System.out.println("One boy and one girl: " + girlBoyPercent);

        
        
    
    
    
    }
}

