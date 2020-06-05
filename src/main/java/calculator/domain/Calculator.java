package calculator.domain;

public class Calculator {
    public int getTotalCalculation(String arithmeticOperation) {
        StringReader reader = new StringReader();

        int[] numbers = reader.extractNumber(arithmeticOperation);
        String[] operators = reader.extractOperator(arithmeticOperation);

        int answer = 0;

        for (int i = 0; i < operators.length; i += 1) {
            if (operators[i].equals("+")) {
                int value = this.add(numbers[i], numbers[i + 1]);
                numbers[i + 1] = value;
                answer = value;
                continue;
            }

            if (operators[i].equals("-")) {
                int value = this.subtract(numbers[i], numbers[i + 1]);
                numbers[i + 1] = value;
                answer = value;
                continue;
            }

            if (operators[i].equals("*")) {
                int value = this.multiply(numbers[i], numbers[i + 1]);
                numbers[i + 1] = value;
                answer = value;
                continue;
            }

            if (operators[i].equals("/")) {
                int value = this.divide(numbers[i], numbers[i + 1]);
                numbers[i + 1] = value;
                answer = value;
            }
        }

        return answer;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        return a / b;
    }
}
