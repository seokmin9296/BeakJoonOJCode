import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, e, f = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        e = sc.nextInt();
        f = sc.nextInt();
        result(a, b, c, d, e, f);
    }
    public static void result(int king, int queen, int rook, int bishop, int knight, int pawn){
        int kingPiece = checkChessPiece(king , 1);
        int queenPiece = checkChessPiece(queen ,1);
        int rookPiece = checkChessPiece(rook , 2);
        int bishopPiece = checkChessPiece(bishop , 2);
        int knightPiece = checkChessPiece(knight, 2);
        int pawnPiece = checkChessPiece(pawn, 8);
        System.out.println(kingPiece);
        System.out.println(queenPiece);
        System.out.println(rookPiece);
        System.out.println(bishopPiece);
        System.out.println(knightPiece);
        System.out.println(pawnPiece);
    }
    public static int checkChessPiece(int piece, int num){
        int result = num - piece;
        return result;
    }
}