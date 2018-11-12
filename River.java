import java.util.Scanner;

public class River extends GameStage implements playable
{
    public River()
    {
        super("You face a river. Which way do you wish to travel? " + playable.inputPrompt);
    }

    public void run()
    {
        super.run();
        while(!hasEscaped)
        {
            String userIn = sc.nextLine();
            if (userIn.equals("E") || userIn.equals("W"))
            {
                System.out.println("You walk along the river and haven't escaped yet. Try again. " + playable.inputPrompt);
            }
            else if (userIn.equals("N"))
            {
                System.out.println("That's the way you came from. Try again. " + playable.inputPrompt);
            }
            else if (userIn.equals("S"))
            {
                System.out.println("You find a log to cross over and escape from the river. Now onto the next stage.");
                hasEscaped = true;
            }
            else
            {
                System.out.println("Invalid input. Try again. " + playable.inputPrompt);
            }
        }
    }
}