public class Space
{
    //instance variables
    private boolean containsPawn;
    private boolean containsRook;
    private boolean containsBishop;
    private boolean containsKing;
    private boolean containsQueen;
    private boolean containsKnight;

    //Constructors

    public Space()
    {
        containsPawn = false;
        containsRook = false;
        containsBishop = false;
        containsKnight = false;
        containsKing = false;
        containsQueen = false;
    }

    //getters
    public boolean ContainsPawn()
    {
        return containsPawn;
    }

    public boolean ContainsBishop()
    {
        return containsBishop;
    }

    public boolean ContainsRook()
    {
        return containsRook;
    }

    public boolean ContainsKing()
    {
        return containsKing;
    }

    public boolean ContainsQueen()
    {
        return containsQueen;
    }

    public boolean ContainsKnight()
    {
        return containsKnight;
    }

    //setters
    public void setContainsPawn(boolean containsPawn)
    {
        this.containsPawn = containsPawn;
    }

    public void setContainsBishop(boolean containsBishop)
    {
        this.containsBishop = containsBishop;
    }

    public void setContainsRook(boolean containsRook)
    {
        this.containsRook = containsRook;
    }

    public void setContainsKnight(boolean containsKnight)
    {
        this.containsKnight = containsKnight;
    }

    public void setContainsQueen(boolean containsQueen)
    {
        this.containsQueen = containsQueen;
    }

    public void setContainsKing(boolean containsKing)
    {
        this.containsKing = containsKing;
    }
}
