public class ArithmeticOperation {
    private int operand1;
    private int operand2;

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public ArithmeticOperation(int[] arr) {
        operand1 = arr[0];
        operand2 = arr[1];
    }

    public int add() throws ArithmeticException {
        if(operand2 < 0 || operand1 <0) {
            throw new ArithmeticException("Adding can not be less than zero");
        }
        int ans = operand1+operand2;
        return ans;

    }

    public int substract() throws ArithmeticException {
        if(operand2 < 0 || operand1 <0) {
            throw new ArithmeticException("Substracting can not be less than zero");
        }
        int ans = operand1-operand2;
        return ans;

    }

    public int multiply() throws ArithmeticException{
        if(operand2 == 0 || operand1 == 0) {
            throw new ArithmeticException("Multiplier can not be  zero");
        }
        int ans = operand1*operand2;
        return ans;


    }

    public double divide() throws  ArithmeticException{
        if(operand2 == 0 || operand1 == 0) {
            throw new ArithmeticException("Divider can not be  zero");
        }
        double ans = (double)operand1/(double)operand2;
        return ans;
    }
}
