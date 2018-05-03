/*****************************************************************
 * Name: Edwin Figueroa
 * Date: 5/3/18
 *
 * Description: Test the created file. 
 *****************************************************************/

public class CreateSequentialFileTest {

    public static void main(String[] args) {
        CreateSequentialFile application = new CreateSequentialFile();

        application.openFile();
        application.addRecord();
    }
}
