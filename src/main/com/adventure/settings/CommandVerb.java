package main.com.adventure.settings;

import main.com.adventure.EmptyCommandException;
import main.com.adventure.InvalidCommandException;



/**
 * Sprint 3 Module 1
 * This CommandVerb will be used instead of strings once we've learned about Enums.
 */

public enum CommandVerb {
    TAKE,
    MOVE,
    USE,
    DIG,
    EXAMINE,
    LOOK,
    INVALID,
    HELP,
    //Used in Sprint 3 Module 2
    FIGHT,
    //Used in Sprint 3 Module 3
    INVENTORY;



    /**
     * Takes a users input and determines which verb to include in the command.
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) throws EmptyCommandException, InvalidCommandException {

        String vString = verbString;

        if (vString == null) {

            throw new EmptyCommandException();
        }

        int spaceIndex = vString.indexOf(' ');
        if (spaceIndex > 0) {

            vString = vString.substring(0, spaceIndex);
        }

        vString = vString.trim().toUpperCase();
        CommandVerb resultant;

        switch (vString) {

            case "TAKE": {

                resultant = CommandVerb.TAKE;
                break;
            }
            case "MOVE": {

                resultant = CommandVerb.MOVE;
                break;
            }
            case "USE": {

                resultant = CommandVerb.USE;
                break;
            }
            case "DIG": {

                resultant = CommandVerb.DIG;
                break;
            }
            case "EXAMINE": {

                resultant = CommandVerb.EXAMINE;
                break;
            }
            case "LOOK": {

                resultant = CommandVerb.LOOK;
                break;
            }
            case "HELP": {

                resultant = CommandVerb.HELP;
                break;
            }
            case "FIGHT": {

                resultant = CommandVerb.FIGHT;
                break;
            }
            case "INVENTORY": {

                resultant = CommandVerb.INVENTORY;
                break;
            }
            case "": {

                throw new EmptyCommandException();
            }
            default: {

                throw new InvalidCommandException();
            }
        }

        return resultant;
    }

    /**
     * Converts a CommandVerb to a string.
     * @param verb - CommandVerb to be converted
     * @return - the String equivalent to the CommandVerb
     * @throws InvalidCommandException - thrown if the command entered by the user matches no valid commands.
     */
    public static String toString(CommandVerb verb) throws InvalidCommandException {

        String resultant;

        switch (verb) {

            case TAKE: {

                resultant = "TAKE";
                break;
            }
            case MOVE: {

                resultant = "MOVE";
                break;
            }
            case USE: {

                resultant = "USE";
                break;
            }
            case DIG: {

                resultant = "DIG";
                break;
            }
            case EXAMINE: {

                resultant = "EXAMINE";
                break;
            }
            case LOOK: {

                resultant = "LOOK";
                break;
            }
            case HELP: {

                resultant = "HELP";
                break;
            }
            case FIGHT: {

                resultant = "FIGHT";
                break;
            }
            case INVENTORY: {

                resultant = "INVENTORY";
                break;
            }
            default: {

                throw new InvalidCommandException();
            }
        }

        return resultant;
    }

}


