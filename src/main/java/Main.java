public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Parser parser = new Parser();
        Data data = parser.parse(args);
        int result = calculator.calc(data);
        System.out.println(result);
    }
}
