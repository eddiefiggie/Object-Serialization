/*****************************************************************
 * Name: Edwin Figueroa
 * Date: 5/2/18
 *
 * Description: Reads a sequential File 
 *****************************************************************/

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import CardSerializable;

public class ReadSequentialFile {

    private ObjectInputStream input;

    // enable user to open file
    public void openFile() {
        try {
            input = new ObjectInputStream(new FileInputStream("card.ser"));
        }
        catch(IOException ioException) {
            System.err.println("Error opening file.");
        }
    }

    public void readRecords() {
        CardSerializable card;
        System.out.printf("%-10s%\n", "Card Type");

        try {
            while(true) {
                card = (CardSerializable) input.readObject();
                
                // call CardSerializable display() method
                System.out.printf("%-10s%\n", "Card Type");
            }            
        }
        catch(EOFException endOfFileException) {
            return; // end of file was reached
        }
        catch(ClassNotFoundException classNotFoundException) {
            System.err.println("Unable to create object.");
        }
        catch(IOException ioException) {
            System.err.println("Error during read from file.");
        }
    }

    public void closeFile() {
        try {
            if(input != null) {
                input.close;
            }
        }
        catch(IOException ioException) {
            System.err.println("Error closing file.");
        }
    }
    

}
