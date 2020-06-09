package Step2_Calculator;

public class InputErrorHandler {
    public static void checkCalculatorIllegalArgument(String s){
        String numbersToSingleLength = s.replaceAll("-?\\d+", "1");
        String noSpace = numbersToSingleLength.replaceAll(" ", "");
        if(numbersToSingleLength.length() != noSpace.length()*2-1) {
            throw new IllegalArgumentException("Wrong input Format! Must be (number) (arithmetic Operator) (number) ... so on with no null inputs");
        }

        if(!s.matches("[\\d+*/\\-]+")){
            System.out.println("asdasdasd");
            throw new IllegalArgumentException("Wrong inputs!!!");
        }

    }
}
