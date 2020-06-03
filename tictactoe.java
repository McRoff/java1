public class tictactoe {
    /* private static boolean isWinnerExists(char symb) {
        if (field[0][0] == symb && field[0][1] == symb && field[0][2] == symb) return true;
        if (field[1][0] == symb && field[1][1] == symb && field[1][2] == symb) return true;
        if (field[2][0] == symb && field[2][1] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][0] == symb && field[2][0] == symb) return true;
        if (field[0][1] == symb && field[1][1] == symb && field[2][1] == symb) return true;
        if (field[0][2] == symb && field[1][2] == symb && field[2][2] == symb) return true;

        if (field[0][0] == symb && field[1][1] == symb && field[2][2] == symb) return true;
        if (field[2][0] == symb && field[1][1] == symb && field[0][2] == symb) return true;
        return false;
    }*/
    private static boolean isWinnerExists(char symb) {
        for (field x = 0; x < 3; x++) {
            field == symb;
            for (field y = 0; y < 3; y++) {
                field == symb;
            }
        }
    }
}
