import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class AddNewLine {

    public static void addNewLineText(String appendWord) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("list.txt", true));
        writer.newLine();
        writer.write(appendWord);
        writer.close();
    }

}
