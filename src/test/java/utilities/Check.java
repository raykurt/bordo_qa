package utilities;

public class Check {

    public static void main(String[] args) {

        String input="Ja5+**__?va cok 1__*guzel";
        input=input.replaceAll("[0-9,%,.,_,,*,+,-]","");
        System.out.println(input);

    }

}
