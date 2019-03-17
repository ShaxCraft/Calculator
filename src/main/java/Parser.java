public class Parser {

    public Data parse(String[] args) {
        String s = "";
        for (String arg : args) {
            s = s + arg;
        }
        System.out.println(s);
        return parse(s);
    }

    public Data parse(String s) {
        Data data = new Data();
        boolean nextNumber = true;
        String buf = "";
        int number;
        for (int i = 0; i < s.length(); i++) {
            char param = s.charAt(i);
            switch (param) {
                case '+':
                    number = parseNumber(buf);
                    buf = "";
                    data.addNumber(number);
                    data.addOperation(Operation.PLUS);
                    break;
                case '-':
                    number = parseNumber(buf);
                    buf = "";
                    data.addNumber(number);
                    data.addOperation(Operation.MINUS);
                    break;
                case '/':
                    number = parseNumber(buf);
                    buf = "";
                    data.addNumber(number);
                    data.addOperation(Operation.DIV);
                    break;
                case '*':
                    number = parseNumber(buf);
                    buf = "";
                    data.addNumber(number);
                    data.addOperation(Operation.MULT);
                    break;
                default:
                    buf = buf + param;
                    if ((i + 1) == s.length()) {
                        number = parseNumber(buf);
                        data.addNumber(number);
                    }
            }
        }
        return data;
    }

    public int parseNumber(String numberStr) {
        if (numberStr.equals("I"))
            return 1;
        if (numberStr.equals("II"))
            return 2;
        if (numberStr.equals("III"))
            return 3;
        if (numberStr.equals("IV"))
            return 4;
        if (numberStr.equals("V"))
            return 5;
        if (numberStr.equals("VI"))
            return 6;
        if (numberStr.equals("VII"))
            return 7;
        if (numberStr.equals("VIII"))
            return 8;
        if (numberStr.equals("IX"))
            return 9;
        if (numberStr.equals("X"))
            return 10;
        int number = Integer.parseInt(numberStr);
        return number;
    }
}
