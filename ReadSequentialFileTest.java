/*****************************************************************
 * Name: Edwin Figueroa
 * Date: 5/2/18
 *
 * Description: TesterFile 
 *****************************************************************/

public class ReadSequentialFileTest {
    
    public static void main(String[] args) {
        ReadSequentialFile application = new ReadSequentialFile();

        application.openFile();
        application.readRecords();
        application.closeFile();
    }
}
