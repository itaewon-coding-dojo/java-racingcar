package calculator.domain;

import java.util.*;
import java.util.regex.*;

public class StringReader {
    public int[] extractNumber(String str) {
        if (this.checkWeird(str)) {
            throw new IllegalArgumentException();
        }

        String[] arr = str.split(" ");

        removeUnnecessaryParts(arr);
        ArrayList<String> pureNumbers = convertArrayToArrayList(arr);
        ArrayList<String> result = considerBracket(pureNumbers);

        return extractNumbersFromBracket(result);
    }

    public String[] extractOperator(String str) {
        if (this.checkWeird(str)) {
            throw new IllegalArgumentException();
        }

        String[] arr = str.split(" ");

        ArrayList<String> pureOperators = convertArrayToArrayList(arr);
        Object[] objOperators = pureOperators.stream()
                .filter(v -> Pattern.matches("[\\*\\-\\+\\/]", v))
                .toArray();

        return convertObjectArrayToStringArray(objOperators);
    }

    public boolean checkWeird(String str) {
        String weirds = str.replaceAll("[0-9\\+\\-\\*\\/\\' '\\(\\)]", "");
        return weirds.length() > 0;
    }

    private void removeUnnecessaryParts(String[] arr) {
        for (int i = 0; i < arr.length; i += 1) {
            arr[i] = arr[i].replaceAll("[^0-9\\-\\(\\)]", "");
        }
    }

    private ArrayList<String> convertArrayToArrayList(String[] arr) {
        ArrayList<String> arrayList = new ArrayList<>();

        for (String e : arr) {
            arrayList.add(e);
        }

        return arrayList;
    }

    private String[] convertObjectArrayToStringArray(Object[] objArr) {
        String[] strArr = new String[objArr.length];

        int index = 0;
        for (Object operator: objArr) {
            strArr[index] = operator.toString();
            index += 1;
        }

        return strArr;
    }

    private ArrayList<String> considerBracket(ArrayList<String> arrayList) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < arrayList.size(); i += 1) {
            String e = arrayList.get(i);
            if (e.length() > 0 && e.charAt(0) == '(') {
                result.add(e);
                continue;
            }

            if (Pattern.matches("[0-9]{1,}", e)) {
                result.add(e);
            }
        }

        return result;
    }

    private int[] extractNumbersFromBracket(ArrayList<String> arrayList) {
        int[] answer = new int[arrayList.size()];

        for (int i = 0; i < answer.length; i += 1) {
            String e = arrayList.get(i);

            if (e.charAt(0) == '(') {
                String substr = e.substring(1, e.length() - 1);
                answer[i] = Integer.parseInt(substr);
                continue;
            }

            answer[i] = Integer.parseInt(e);
        }

        return answer;
    }
}
