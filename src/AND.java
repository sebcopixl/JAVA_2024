package src;

public class AND {
    public static void main(String[] args) {
        int topScore = 80;
        if (topScore < 100) {
            System.out.println("You got the high score!");
        }
        int secondTopScore = 81;
        if ((topScore > secondTopScore && topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }
    }
}

//explain this basic code
//The AND class is a simple Java program that demonstrates the use of the logical AND operator (&&) in an if statement.
//The main method is the entry point of the program, and it is where the program starts executing.
//The integer variable topScore is set to 80.
//The first if statement checks if the value of topScore is less than 100 using the < (less than) operator.
//If topScore is less than 100, the program prints the message "You got the high score!" to the console.
//The integer variable secondTopScore is set to 81.
//The second if statement checks if the value of topScore is greater than secondTopScore and less than 100 using the && (logical AND) operator.
//If both conditions are true, the program prints the message "Greater than second top score and less than 100" to the console.
//When the program is run, the messages will be displayed in the console if the conditions are met.
//The output will be:
//You got the high score!
//Greater than second top score and less than 100
//The program showcases the use of the logical AND operator to combine multiple conditions in an if statement.
//The && operator requires both conditions to be true for the code block inside the if statement to be executed.
//This allows for more complex conditional logic in the program, where multiple conditions need to be satisfied for a certain action to be taken.
//The messages printed to the console provide additional context and output for the program.
//Overall, the program demonstrates the basic usage of the logical AND operator in Java.