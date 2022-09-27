package utilities;

public class Check {

    public static void main(String[] args) {
        char letter = 'b';
        String word = "ahmetbulutluoz";
        int num = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i)==letter){
                num++;
            }
        }

        if (num>0){
            System.out.println("word has letter");
        }else {
            System.out.println("word has not letter");
        }
    }
}
