import java.io.*;

/**
 * Created by fidel on 2/23/2018.
 */
public class Main {
    public static void main(String[] args) throws IOException{
        FileInputStream fileInputStream = new FileInputStream("C:\\Test\\inputText.txt");
        BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
        UpperCaseFilter upperCaseFilter = new UpperCaseFilter(bufferedInputStream);

        int i = 0;
        while((i = upperCaseFilter.read())!= -1){
            System.out.print((char)i);
        }
        upperCaseFilter.close();
    }
}

//abierto a extension, cerrado a cambio