import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ListTheTasks {

    public static void listTheTasks() {
        List<String> listOfTasks = new ArrayList<>();
        try {
            Path filePath = Paths.get("list.txt");
            listOfTasks = Files.readAllLines(filePath);
            for (int i = 0; i < listOfTasks.size(); i++) {
                if (listOfTasks.isEmpty()) {
                    System.out.println("No todos for today! :)");
                } else {
                    System.out.println(i + 1 + " - " + listOfTasks.get(i));
                }
            }
        } catch (Exception ex) {
            System.out.println("It doesn't readable!");
        }
    }

}
