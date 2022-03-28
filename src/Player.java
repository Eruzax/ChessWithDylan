import java.util.Scanner;

public class Player
{
    private String name;
    private Scanner scan;

    public Player(String n)
    {
        scan = new Scanner(System.in);
        name = n;
    }

    public String getName()
    {
        return name;
    }
    public void move(String str)
    {
        System.out.println("What's your next move: ");
        String choice = scan.nextLine();

    }
    public static int row(String str)
    {
        if (str.substring(0, 1).equals("A") || str.substring(0, 1).equals("a"))
        {
            return 1;
        }
        else if (str.substring(0, 1).equals("B")|| str.substring(0, 1).equals("b"))
        {
            return 2;
        }
        else if (str.substring(0, 1).equals("C")|| str.substring(0, 1).equals("c"))
        {
            return 3;
        }
        else if (str.substring(0, 1).equals("D")|| str.substring(0, 1).equals("d"))
        {
            return 4;
        }
        else if (str.substring(0, 1).equals("E")|| str.substring(0, 1).equals("e"))
        {
            return 5;
        }
        else if (str.substring(0, 1).equals("F")|| str.substring(0, 1).equals("f"))
        {
            return 6;
        }
        else if (str.substring(0, 1).equals("G")|| str.substring(0, 1).equals("g"))
        {
            return 7;
        }
        else if (str.substring(0, 1).equals("H")|| str.substring(0, 1).equals("h"))
        {
            return 8;
        }
        return 1;
    }

    public static int col(String str)
    {
        if (str.substring(1).equals("1"))
        {
            return 1;
        }
        else if (str.substring(1).equals("2"))
        {
            return 2;
        }
        else if (str.substring(1).equals("3"))
        {
            return 3;
        }
        else if (str.substring(1).equals("4"))
        {
            return 4;
        }
        else if (str.substring(1).equals("5"))
        {
            return 5;
        }
        else if (str.substring(1).equals("6"))
        {
            return 6;
        }
        else if (str.substring(1).equals("7"))
        {
            return 7;
        }
        else if (str.substring(1).equals("8"))
        {
            return 8;
        }
        return 1;
    }
}
