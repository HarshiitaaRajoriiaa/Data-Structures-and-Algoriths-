//?https://leetcode.com/problems/check-if-two-chessboard-squares-have-the-same-color/
public class Chess {
    public boolean checkTwoChessboards(String coordinate1, String coordinate2) {
        String chess[][] = new String[8][8];
        //breakdown coordinates
        int col1 = coordinate1.charAt(0)-'a'+1;
        int col2 = coordinate2.charAt(0)-'a'+1;
        int row1 = coordinate1.charAt(1);
        int row2 = coordinate2.charAt(1);
        return ((col1 + row1) % 2) == ((col2 + row2) % 2);
    }
}
