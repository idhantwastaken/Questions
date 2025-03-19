class Pattern {
    public static String getPattern(String str) {
        String output = "", topHalf = str + "\n", bottomHalf = str + "\n", line = "", spaces;
        int half = str.length() / 2;
        spaces = " ";
        for (int i = 1; i <= half; i++) {
            line = str.substring(0, half - i + 1) + spaces + str.substring(half + i) + "\n";
            topHalf += line;
            if (i < half)
                bottomHalf = line + bottomHalf;
            spaces += "  ";
        }
        output = topHalf + bottomHalf;
        return output;
    }

    public static void main(String[] args) {
        System.out.println(getPattern("HAPPY-HAPPY"));
    }
}