import java.io.*;

public class RemoveTask {

    public static void removeTask(int index) throws IOException {
        File inputFile = new File("list.txt");
        File tempFile = new File("templist.txt");

        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        int indexRemove = index;
        String currentLine;
        int count = 0;

        while((currentLine = reader.readLine()) != null) {
            count++;
            if (count == indexRemove) {
                continue;
            }
            writer.write(currentLine + "\n");
        }
        writer.close();
        reader.close();
        inputFile.delete();
        tempFile.renameTo(inputFile);
    }
}
