package ru.netology;

import java.util.ArrayList;
import java.util.List;

public class NewMathOperations {
    public List<Integer> positiveNumbers(List<Integer> inList) {
        List<Integer> positiveNumbersList = new ArrayList<>();
        for (Integer value : inList) {
            if (value > 0)
                positiveNumbersList.add(value);
        }
        return positiveNumbersList;
    }
    List<Integer> evenNumber(List<Integer> inList) {
        List<Integer> evenNumberList = new ArrayList<>();
        for (Integer value : inList) {
            if (value % 2 == 0)
                evenNumberList.add(value);
        }
        return evenNumberList;
    }
    public int commissionPercentCalc(int amount) {
        double percentCommission = 0.75;
        int minimumCommission = 35;
        int commission = (int) (amount * percentCommission) / 100;
        return (commission > minimumCommission) ? commission : minimumCommission;
    }

}
