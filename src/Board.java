public class Board
{
    private String[][] board;
    private Space[][] chessBoard;

    public Board()
    {
        board = new String[][]{{"♖ ", "♘ ", "♗ ", "♕ ", "♔ ", "♗ ", "♘ ", "♖ "},
                {"♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ "},
                {" ⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ "},
                {" ⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ "},
                {" ⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ "},
                {" ⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ ", "⬜ ", "⬛ "},
                {"♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ ", "♟ "},
                {"♜ ", "♞ ", "♝ ", "♛ ", "♚ ", "♝ ", "♞ ", "♜ "}};
        chessBoard = new Space[9][9];
        for(int i = 0; i < 9; i++)
        {
            for (int j = 0; j < 9; j++)
            {
                Space s = new Space();
                chessBoard[i][j] = s;
            }
        }
    }

    public String[][] draw()
    {

        return board;
    }
    public void drawBoard()
    {
        for(int i = 0; i < board.length; i++)
        {
            for (int j = 0; j < board[0].length; j++)
            {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }


    public void setBoard()
    {
        int rowCounter = 1;
        int colCounter = 1;
        for(int i = 0; i <chessBoard.length; i++)
        {
            for (int j = 0; j < chessBoard[i].length; j++)
            {
                if (j == 8)
                {
                    if (i == 0)
                    {
                        System.out.println(row(rowCounter) + " | ");
                        rowCounter++;
                    }
                    else if (j == 0)
                    {
                        System.out.println(colCounter + " | ");
                        colCounter++;
                    }
                    else if (i == 1 && j == 1)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.println("R | ");
                    }
                    else if (i == 1 && j == 2)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.println("N | ");
                    }
                    else if (i == 1 && j == 3)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.println("B | ");
                    }
                    else if (i == 1 && j == 4)
                    {
                        chessBoard[i][j].setContainsKing(true);
                        System.out.println("K | ");
                    }
                    else if (i == 1 && j == 5)
                    {
                        chessBoard[i][j].setContainsQueen(true);
                        System.out.println("Q | ");
                    }
                    else if (i == 1 && j == 6)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.println("B | ");
                    }
                    else if (i == 1 && j == 7)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.println("N | ");
                    }
                    else if (i == 1 && j == 8)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.println("R | ");
                    }
                    else if (i == 2 || i == 7)
                    {
                        chessBoard[i][j].setContainsPawn(true);
                        System.out.println("P | ");
                    }
                    else if (i == 8 && j == 1)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.println("R | ");
                    }
                    else if (i == 8 && j == 2)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.println("N | ");
                    }
                    else if (i == 8 && j == 3)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.println("B | ");
                    }
                    else if (i == 8 && j == 4)
                    {
                        chessBoard[i][j].setContainsKing(true);
                        System.out.println("K | ");
                    }
                    else if (i == 8 && j == 5)
                    {
                        chessBoard[i][j].setContainsQueen(true);
                        System.out.println("Q | ");
                    }
                    else if (i == 8 && j == 6)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.println("B | ");
                    }
                    else if (i == 8 && j == 7)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.println("N | ");
                    }
                    else if (i == 8 && j == 8)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.println("R | ");
                    }
                    else
                    {
                        System.out.println("  | ");
                    }
                }
                else
                {
                    if(i == 0 && j == 0)
                    {
                        System.out.print("  | ");
                    }
                    else if (i == 0)
                    {
                        System.out.print(row(rowCounter) + " | ");
                        rowCounter++;
                    }
                    else if (j == 0)
                    {
                        System.out.print(colCounter + " | ");
                        colCounter++;
                    }
                    else if (i == 1 && j == 1)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.print("R | ");
                    }
                    else if (i == 1 && j == 2)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.print("N | ");
                    }
                    else if (i == 1 && j == 3)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.print("B | ");
                    }
                    else if (i == 1 && j == 4)
                    {
                        chessBoard[i][j].setContainsKing(true);
                        System.out.print("K | ");
                    }
                    else if (i == 1 && j == 5)
                    {
                        chessBoard[i][j].setContainsQueen(true);
                        System.out.print("Q | ");
                    }
                    else if (i == 1 && j == 6)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.print("B | ");
                    }
                    else if (i == 1 && j == 7)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.print("N | ");
                    }
                    else if (i == 1 && j == 3)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.print("R | ");
                    }
                    else if (i == 2 || i == 7)
                    {
                        chessBoard[i][j].setContainsPawn(true);
                        System.out.print("P | ");
                    }
                    else if (i == 8 && j == 1)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.print("R | ");
                    }
                    else if (i == 8 && j == 2)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.print("N | ");
                    }
                    else if (i == 8 && j == 3)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.print("B | ");
                    }
                    else if (i == 8 && j == 4)
                    {
                        chessBoard[i][j].setContainsKing(true);
                        System.out.print("K | ");
                    }
                    else if (i == 8 && j == 5)
                    {
                        chessBoard[i][j].setContainsQueen(true);
                        System.out.print("Q | ");
                    }
                    else if (i == 8 && j == 6)
                    {
                        chessBoard[i][j].setContainsBishop(true);
                        System.out.print("B | ");
                    }
                    else if (i == 8 && j == 7)
                    {
                        chessBoard[i][j].setContainsKnight(true);
                        System.out.print("N | ");
                    }
                    else if (i == 8 && j == 8)
                    {
                        chessBoard[i][j].setContainsRook(true);
                        System.out.print("R | ");
                    }
                    else
                    {
                        System.out.print("  | ");
                    }
                }

            }
            System.out.println("-----------------------------------");
        }
    }

    public String row(int row)
    {
        if (row == 1)
        {
            return "A";
        }
        else if (row == 2)
        {
            return "B";
        }
        else if (row == 3)
        {
            return "C";
        }
        else if (row == 4)
        {
            return "D";
        }
        else if (row == 5)
        {
            return "E";
        }
        else if (row == 6)
        {
            return "F";
        }
        else if (row == 7)
        {
            return "G";
        }
        else if (row == 8)
        {
            return "H";
        }
        return "A";
    }



}