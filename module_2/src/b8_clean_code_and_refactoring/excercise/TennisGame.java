package b8_clean_code_and_refactoring.excercise;
public class TennisGame {
    public static String drawDislay(int playerScore){
        String resultDisplay;
        switch (playerScore) {
            case 0:
                resultDisplay = "Love-All";
                break;
            case 1:
                resultDisplay = "Fifteen-All";
                break;
            case 2:
                resultDisplay = "Thirty-All";
                break;
            case 3:
                resultDisplay = "Forty-All";
                break;
            default:
                resultDisplay = "Deuce";
                break;
        }
        return resultDisplay;
    }
    public static String winDislay(int player1Score, int player2Score){
        int minusResult = player1Score - player2Score;

        if (minusResult == 1) return "Advantage player1";
        else if (minusResult == -1) return "Advantage player2";
        else if (minusResult >= 2) return "Win for player1";
        else return "Win for player2";
    }
    public static String matchDisplay(int playerScore){
        String result = "";
            switch(playerScore) {
                case 0:
                    result = "Love";
                    break;
                case 1:
                    result = "Fifteen";
                    break;
                case 2:
                    result = "Thirty";
                    break;
                case 3:
                    result = "Forty";
            }
            return result;
        }
    public static String getScore(int player1Score, int player2Score) {
        if (player1Score == player2Score) return drawDislay(player1Score);
        else if (player1Score >= 4 || player2Score >= 4) return winDislay(player1Score, player2Score);
        else return matchDisplay(player1Score) + " - " + matchDisplay(player2Score);
    }
}