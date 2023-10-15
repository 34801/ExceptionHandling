// Step 1: Create the custom checked exception class
class MySpecialNumberException extends Exception {
    public MySpecialNumberException(String message) {
        super(message);
    }
}

// Step 2: Implement the method myfunc
class NumberProcessor {
    public void myfunc(int x) throws MySpecialNumberException {
        if (x == 10) {
            throw new MySpecialNumberException("Input value is 10. This is not allowed.");
        } else if (x == 20) {
            throw new MySpecialNumberException("Input value is 20. This is not allowed.");
        } else if (x == 30) {
            throw new MySpecialNumberException("Input value is 30. This is not allowed.");
        }
        // Other processing logic for values other than 10, 20, or 30
    }
}

public class Main {
    public static void main(String[] args) {
        NumberProcessor processor = new NumberProcessor();

        try {
            // Attempt to call myfunc with different values
            processor.myfunc(4); // No exception will be thrown
            processor.myfunc(10); // Will throw MySpecialNumberException
            processor.myfunc(20); // Will throw MySpecialNumberException
        } catch (MySpecialNumberException e) {
            System.err.println("Caught MySpecialNumberException: " + e.getMessage());
        } finally {
            System.out.println("Finally block - Cleanup or other final actions.");
        }
    }
}
