/*****************************************************************
 * Name: Edwin Figueroa
 * Date: 5/3/18
 *
 * Description: Creates a sequential File 
 *****************************************************************/

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CreateSequentialFile {

    private ObjectOutputStream output;
        
    public void openFile() {
        try {
            output = new ObjectOutputStream(new FileOutputStream("card.ser"));
        }
        catch(IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public void addRecord() {

        try {
            CardSerializable card;
            String value;
            String suit;
            
            Scanner input = new Scanner(System.in);
            System.out.print("Enter card value: ");
            value = input.next();
            System.out.print("Enter card value: ");
            suit = input.next();
            
            card = new CardSerializable(value, suit);
            output.writeObject(card);
        }
        catch(IOException ioException) {
            System.err.println("Error writing to file.");
            return;
        }
    }

    public void closeFile() {
        try {
            if(output != null) {
                output.close();
            }
        }
        catch(IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }
    }
}


