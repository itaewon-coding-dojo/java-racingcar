package Step2_Calculator;

public class InputErrorHandler {
    public static void checkCalculatorIllegalArgument(String s){
        String numbersToSingleLength = s.replaceAll("-?\\d+", "1");
        String noSpace = numbersToSingleLength.replaceAll(" ", "");
        if(numbersToSingleLength.length() != noSpace.length()*2-1) {
            throw new IllegalArgumentException("1");
        }
        if(s.matches("^[^\\d+*/\\-]+$")){
            throw new IllegalArgumentException("1");
        }
    }
}
