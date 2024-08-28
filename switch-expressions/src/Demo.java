

public class Demo {
    public static void main(String[] args) {
        Day day = Day.FRIDAY;
        System.out.println(STR."Number of letters in \{day}: \{getNumberOfLetters(day)}");
    }
    public static int getNumberOfLetters(Day day){
        int numberOfLetters;
        switch (day){
            case FRIDAY -> numberOfLetters = 5;
            case SUNDAY, MONDAY -> numberOfLetters = 6;
            case TUESDAY  -> numberOfLetters = 7;
            case THURSDAY, SATURDAY -> numberOfLetters = 8;
            case WEDNESDAY -> numberOfLetters = 9;
            default -> throw new IllegalArgumentException(STR."Invalid day\{day}");
        }
        return numberOfLetters;
    }
}
