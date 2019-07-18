import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class todo {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            start();
        }

        if (args[0].equals("-l")) {
            listTheTasks();
        }

        if (args[0].equals("-a")) {
            if (args.length == 2) {
                addNewLineText(args[1]);
            } else {
                System.out.println("Unable to add: no task provided");
            }
        }

    }

    public static void start() {
        System.out.println("Command Line Todo application\n" +
                "=============================\n" +
                "\n" +
                "Command line arguments:\n" +
                "    -l   Lists all the tasks\n" +
                "    -a   Adds a new task\n" +
                "    -r   Removes an task\n" +
                "    -c   Completes an task");
    }

    public static void listTheTasks() {
        List<String> listOfTasks = new ArrayList<>();
            try {
                Path filePath = Paths.get("C:\\Users\\atti_\\Desktop\\greenfox\\torokattila\\week-04\\day-4\\torokattila_handle-todo-app\\src\\list.txt");
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

    public static void addNewLineText(String appendWord) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\atti_\\Desktop\\greenfox\\torokattila\\week-04\\day-4\\torokattila_handle-todo-app\\src\\list.txt", true));
        writer.newLine();
        writer.write(appendWord);
        writer.close();
    }

}
