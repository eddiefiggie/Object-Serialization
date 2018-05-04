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

// import CardSerializable;

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
        System.out.println("Card Descritpion");
        System.out.println("----------------");

        try {
            while(true) {
                card = (CardSerializable) input.readObject();
                System.out.println(card.display());
            }            
        }
        catch(Exception e) {
            return; // end of file was reached
        }
    }


    public void closeFile() {
        try {
            if(input != null) {
                input.close();
            }
        }
        catch(IOException ioException) {
            System.err.println("Error closing file.");
            System.exit(1);
        }
    }
}
