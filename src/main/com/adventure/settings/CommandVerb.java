package main.com.adventure.settings;

import java.util.Dictionary;
import java.util.Scanner;

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
     *
     * @param verbString - the users input.
     * @return - the CommandVerb associated with the given input.
     */
    public static CommandVerb getVerb(String verbString) {

//        String upperCaseVerbString = verbString.toUpperCase();
//
//        for (CommandVerb verb : CommandVerb.values()) {
//            if (verb.equals(upperCaseVerbString)) {
//                return verb;
//            }
//        }
//        return CommandVerb.INVALID;
        if (verbString.equals("take")) {
            return TAKE;
        } else if (verbString.equals("move")) {
            return MOVE;
        } else if (verbString.equals("use")) {
            return USE;
        } else if (verbString.equals("dig")) {
            return DIG;
        } else if (verbString.equals("examine")) {
            return EXAMINE;
        } else if (verbString.equals("look")) {
            return LOOK;
        } else if (verbString.equals("invalid")) {
            return INVALID;
        } else if (verbString.equals("help")) {
            return HELP;
        } else if (verbString.equals("fight")) {
            return FIGHT;
        } else if (verbString.equals("inventory")) {
            return INVENTORY;
        } else {
            return INVALID;
        }

    }
}


