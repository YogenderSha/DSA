package com.dsa.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Q079_Recursion_letterCominations2To9 {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits.isEmpty()) {
            return result;
        }
        letterCombinationHelper("", digits , result);
        return result;
    }

		private static final String[] DIALPAD_LETTERS = {
		    "",      // 0
		    "",      // 1
		    "abc",   // 2
		    "def",   // 3
		    "ghi",   // 4
		    "jkl",   // 5
		    "mno",   // 6
		    "pqrs",  // 7
		    "tuv",   // 8
		    "wxyz"   // 9
		};

		private static void letterCombinationHelper(String prefix, String digits, List<String> result) {
        if (digits.isEmpty()) {
            result.add(prefix);
            return;
        }
        int digit = digits.charAt(0) - '0';
        String letters = DIALPAD_LETTERS[digit];
        for (char ch : letters.toCharArray()) {
            letterCombinationHelper(prefix + ch, digits.substring(1), result);
        }
    }

}
