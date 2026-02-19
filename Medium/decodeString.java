class Solution {
    public String decodeString(String s) {
        Stack<String> strS = new Stack<>();
        Stack<Integer> numS = new Stack<>();
        StringBuilder result = new StringBuilder();
        int index = 0;
        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int num = 0;
                while (Character.isDigit(s.charAt(index))) {
                    num = num * 10 + (s.charAt(index) - '0');
                    index++;
                }
                numS.push(num);
            } else if (s.charAt(index) == '[') {
                strS.push(result.toString());
                result = new StringBuilder();
                index++;
            } else if (s.charAt(index) == ']') {
                StringBuilder temp = new StringBuilder(strS.pop());
                int times = numS.pop();
                for (int i = 0; i < times; i++) {
                    temp.append(result);
                }
                result = temp;
                index++;
            } else {
                result.append(s.charAt(index++));
            }
        }
        return result.toString();
    }

}