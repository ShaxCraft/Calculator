import java.util.List;

public class Calculator {

    public int calc(Data data) {
        List<Integer> numbers = data.getNumbers();
        List<Operation> operations = data.getOperations();
        int sum = numbers.get(0);
        for (int i = 0; i < operations.size(); i++) {
            if (operations.get(i) == Operation.PLUS) {
                sum = sum + numbers.get(i + 1);
            }

            if (operations.get(i) == Operation.MINUS) {
                sum = sum - numbers.get(i + 1);
            }
            if (operations.get(i) == Operation.DIV) {
                sum = sum / numbers.get(i + 1);
            }
            if (operations.get(i) == Operation.MULT) {
                sum = sum * numbers.get(i + 1);
            }
        }
        return sum;
    }
}


