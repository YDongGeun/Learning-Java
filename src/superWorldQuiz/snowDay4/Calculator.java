package superWorldQuiz.snowDay4;

public class Calculator {
    public static void main(String[] args) {
        // 변수 선언 및 초기화

        try {
            int num1 = 1;
            int num2 = 0;

            char[] operator = {'+', 'w', '/', '-', '*'};

            for (char c : operator) {
                int answer = calculate(num1, num2, c);
                System.out.println(answer);
            }

        } catch (DivideByZeroException | InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("예상치 못한 오류가 발생했습니다.");
        }
    }

    public static int calculate(int num1, int num2, char operator) throws DivideByZeroException, InvalidOperatorException {
        int result = 0;
        if (operator == '/' && num2 == 0) {
            throw new DivideByZeroException("Divide by zero");
        } else {
            switch (operator){
                case '+': result = num1 + num2; break;
                case '-': result = num1 - num2; break;
                case '*': result = num1 * num2; break;
                case '/': result = num1 / num2; break;
                default: throw new InvalidOperatorException("Invalid Operator");
            }

            return result;
        }
    }
}

class DivideByZeroException extends RuntimeException {
    public DivideByZeroException(String message) {
        super(message);
    }
}

class InvalidOperatorException extends RuntimeException {
    public InvalidOperatorException(String message) {
        super(message);
    }
}
