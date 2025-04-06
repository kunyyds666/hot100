package leetcode.editor.cn;

import java.util.*;
class ID640SolveTheEquation{
	public static void main(String[] args) {
		Solution solution = new ID640SolveTheEquation().new Solution();
		System.out.println(solution.solveEquation("x+5-3+x=6+x-2"));
        System.out.println(Integer.parseInt("+"));

		
		
	}
//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String solveEquation(String equation) {
        String[] parts = equation.split("=");

        int[] left = getSum(parts[0]);
        int[] right = getSum(parts[1]);

        int coef = left[0] - right[0]; // x的系数
        int val = right[1] - left[1]; // 常数项

        if (coef == 0) {
            return val == 0 ? "Infinite solutions" : "No solution";
        }

        return "x=" + val / coef;
    }

    private int[] getSum(String s) {
        int coef = 0, val = 0;
        int sign = 1; // 当前符号
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == '+') {
                sign = 1;
                i++;
            } else if (s.charAt(i) == '-') {
                sign = -1;
                i++;
            } else {
                int num = 0;
                boolean hasNum = false;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    num = num * 10 + (s.charAt(i) - '0');
                    i++;
                    hasNum = true;
                }
                if (i < s.length() && s.charAt(i) == 'x') {
                    coef += sign * (hasNum ? num : 1);
                    i++;
                } else {
                    val += sign * num;
                }
            }
        }
        return new int[]{coef, val};
    }
}


//leetcode submit region end(Prohibit modification and deletion)


    //class Solution {
//    public String solveEquation(String equation) {
//        int left = 0;
//        int right = 0;
//        int n = 0;
//        int index = 0;
//        StringBuilder temp = new StringBuilder();
//        for (int i = 0; i < equation.length(); i++) {
//            temp.append(equation.charAt(i));
//            if (equation.charAt(i) == 'x'){
//                String num = temp.substring(0,temp.length()-1);
//                if (index == 0){
//                    if (Objects.equals(num, "+")){
//                        num = "+1";
//                    }else if (Objects.equals(num, "-")) {
//                        num = "-1";
//                    }else num = "1";
//
//                    n = n + Integer.parseInt(num);
//                    temp.delete(0,temp.length());
//                }else {
//                    if (Objects.equals(num, "+")){
//                        num = "-1";
//                    }else if (Objects.equals(num, "-")){
//                        num = "+1";
//                    }else num = "-1";
//                    n = n + Integer.parseInt(num);
//                    temp.delete(0,temp.length());
//                }
//
//
//
//            } else if (equation.charAt(i) == '+' ||equation.charAt(i) == '-') {
//                if (index == 0 ){//left
//                    if(temp.deleteCharAt(temp.length()-1).toString().isEmpty()){
//                        temp.append("0");
//                    }
//                    left = left + Integer.parseInt(String.valueOf(temp));
//                    temp.delete(0,temp.length()-1);
//                } else {
//                    if(temp.deleteCharAt(temp.length()-1).toString().isEmpty()){
//                        temp.append("0");
//                    }
//                    right = right + Integer.parseInt(String.valueOf(temp));
//                    temp.delete(0,temp.length() -1);
//                }
//            }else if (equation.charAt(i) == '='){
//                index = i;
//                temp.delete(0,temp.length());
//            }
//
//        }
//        if(n == 0){
//            return "Infinite solutions";
//        }else {
//            return "x=" + (right-left)/n;
//        }
//
//    }
//}
}
