public class Main {

    public static void main(String[] args) {

        System.out.println(switchCases('a'));
        System.out.println(switchCases('b'));
        System.out.println(switchCases('c'));
        System.out.println(switchCases('d'));
        System.out.println(switchCases('e'));
        System.out.println(switchCases('f'));
    }

    public static String switchCases(char character)
    {
        switch (character){
            case 'a' : return "Alpha";
            case 'b' : return "Beta";
            case 'c' : return "Charles";
            case 'd' : return "Delta";
            case 'e' : return "Epsilon";
            default :{ System.out.println(character + " is not in the switch case");
            return "";}
        }
    }
}
