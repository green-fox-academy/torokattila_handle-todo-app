import java.io.*;

public class todo {

    public static void main(String[] args) throws IOException {

        if (args.length == 0) {
            start();
        } else if (args[0].equals("-l")) {
            ListTheTasks.listTheTasks();
        } else if (args[0].equals("-a")) {
            if (args.length == 2) {
                AddNewLine.addNewLineText(args[1]);
            } else {
                System.out.println("Unable to add: no task provided");
            }
        } else if (args[0].equals("-r")) {
            RemoveTask.removeTask(Integer.parseInt(args[1]));
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





}
