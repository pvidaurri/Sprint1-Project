package main.com.adventure;

import main.com.adventure.settings.Command;
import main.com.adventure.settings.CommandVerb;

import java.util.Scanner;

public class GameInputProcessor {

    /**
     * Starts the prompt process to the user.
     * @return the response from the user.
     */
    public String prompt() {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Enter your next command:");
        String input = scanner.nextLine();
        return input;
    }

    /**
     * Inputs that come into this method represent single action with no object. When building the command, you'll want
     * to supply the first word as the verb and leave the objectName blank
     * @param input - the input from the user
     * @return - the Command object with the proper verb and blank object
     */
    private Command buildSimpleCommand(String input) {

        String[] newArray = input.split(" ");
        return new Command(CommandVerb.getVerb(newArray[0]));

//        Object o =input ;
//        if (input.equals(o)) {
//
//            }
//                return new Command(CommandVerb.getVerb(input));

//        CommandVerb verb = null;
//        int space = input.indexOf(" ");
//
//        if (space == -1) {
//            verb = CommandVerb.getVerb(input);
//        }
//
//        return new Command(verb);

    }


    /**
     * Inputs that come into this method will have an object or objects that the action is acting on. You'll need to
     * include the object as part of the Command object.
     * @param input - the input from the user
     * @return - the Command object with the proper verb and object
     */
    private Command buildCommandWithObject(String input) {

//        String object;
//        CommandVerb verb;
//        int space = input.indexOf("");
//
//        object = input.substring(space + 1);
//        if (space == -1) {
//            verb = CommandVerb.getVerb(input);
//        } else {
//            verb = CommandVerb.getVerb(input.substring(0, space));
//        }
//            return new Command(object, verb);
           String[] newArray = input.split(" ");
           System.out.println(newArray[0]);
           System.out.println(newArray[1]);
           CommandVerb verb = CommandVerb.getVerb(newArray[0]);
           String objectName = newArray[1];
           return new Command(verb, objectName);
//

//        String[] newArray = input.split(" ");
//        return new Command(CommandVerb.getVerb(newArray[0], newArray[1]));


    }



    /** DO NOT CHANGE ANYTHING BELOW THIS LINE. **/

    /**
     * Gets the next command from the user.
     * @return a command object
     */
    public Command getNextCommand() {
        String input = prompt();
        return processCommand(input);
    }

    private Command processCommand(String input) {
        if (input.contains(Command.MOVE) ||
                input.contains(Command.USE) ||
                input.contains(Command.TAKE) ||
                input.contains(Command.EXAMINE)
        ) {
            return buildCommandWithObject(input);
        } else {
            return buildSimpleCommand(input);
        }
    }

}
