package com.cejv416.switchstatement;

import java.util.Scanner;

/**
 *
 * @author Ken Fogel
 */
public class SwitchSelection {

    /**
     * This method manages the actions to be performed
     */
    public void perform() {
        char choice = inputCharacter();
        doOldSwitch(choice);
        doNewStatementSwitch(choice);
        doNewExpressionSwitch(choice);
    }

    /**
     * This method uses the old switch statement style
     * @param choice The letter entered by the user
     */
    public void doOldSwitch(char choice) {
        var switchType = "Old Statement Switch";
        // old switch
        switch (choice) {
            case 'A':
                doLetterA(switchType);
                break;
            case 'B':
                doLetterB(switchType);
                break;
            case 'C':
                doLetterC(switchType);
                break;
            case 'D':
                doLetterD(switchType);
                break;
            default:
                System.out.println("Invalid Character");
        }

    }

    /**
     * This method uses the new switch statement style
     * @param choice The letter entered by the user
     */
    public void doNewStatementSwitch(char choice) {
        var switchType = "New Statement Switch";
        // statement
        switch (choice) {
            case 'A' ->
                doLetterA(switchType);
            case 'B' ->
                doLetterB(switchType);
            case 'C' ->
                doLetterC(switchType);
            case 'D' ->
                doLetterD(switchType);
            default ->
                System.out.println(switchType + ": Invalid Character");
        }
    }

    /**
     * This method uses the new switch expression style
     * @param choice The letter entered by the user
     */
    public void doNewExpressionSwitch(char choice) {
        var switchType = "New Expression Switch";
        // statement
        String message = switch (choice) {
            case 'A' ->
                switchType + ": You entered the letter A";
            case 'B' ->
                switchType + ": You entered the letter B";
            case 'C' ->
                switchType + ": You entered the letter C";
            case 'D' ->
                switchType + ": You entered the letter D";
            default ->
                switchType + ": Invalid Character";
        };

        System.out.println(message);
    }

    /**
     * A method to be called in the old and new switch statements
     * @param type 
     */
    public void doLetterA(String type) {
        System.out.println(type + ": You entered the letter A");
    }

    public void doLetterB(String type) {
        System.out.println(type + ": You entered the letter B");
    }

    public void doLetterC(String type) {
        System.out.println(type + ": You entered the letter C");
    }

    public void doLetterD(String type) {
        System.out.println(type + ": You entered the letter D");
    }

    /**
     * Example of console input control by a regular expression
     *
     * @return the character that the user entered
     */
    public char inputCharacter() {

        // Declaration
        char ch;

        // Process
        var sc = new Scanner(System.in);
        do {
            System.out.println("Enter a char from a to d: ");

            // Check if the characters in the keyboard buffer match the expression
            if (sc.hasNext("[a-dA-D]")) {
                ch = sc.next().toUpperCase().charAt(0);
            } else {
                // Cannot be a 'z' so force a failure in the while loop
                ch = 'z';
                // As long as the character is invalid
                System.out.println("Invalid");
            }
            sc.nextLine();
        } while (ch == 'z');

        return ch;
    }

    public static void main(String... args) {
        new SwitchSelection().perform();
    }

}
