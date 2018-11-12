
public class driver
{
    public static void main(String[] args)
    {
        River r = new River();        
        r.run();

        Forest f = new Forest();
        f.run();

        Treasure t = new Treasure();
        t.run();
        System.out.println("End Game");
    }
}