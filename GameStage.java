import java.util.Scanner;

public class GameStage implements playable
{
    protected Scanner sc;
    protected String msgStrt;
    protected boolean hasEscaped;

    public GameStage()
    {
        sc = new Scanner(System.in);
        hasEscaped = false;
        msgStrt = "This is a generic message. Please modify this.";
    }
    
    public GameStage(String msg)
    {
        sc = new Scanner(System.in);
        hasEscaped = false;
        msgStrt = msg;
    }

    public void run()
    {
        System.out.println(msgStrt);
    }
}