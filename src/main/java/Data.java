import java.util.ArrayList;
import java.util.List;

public class Data {

    List<Integer> numbers = new ArrayList<>();
    List<Operation> operations = new ArrayList<>();

    public void addNumber(int number) {
        numbers.add(number);
    }

    public void addOperation(Operation operation) {
        operations.add(operation);
    }

    public List<Integer> getNumbers() {
        return numbers;
    }

    public void setNumbers(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public void setOperations(List<Operation> operations) {
        this.operations = operations;
    }
}
