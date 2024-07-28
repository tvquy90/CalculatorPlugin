package cordova.plugin.calculator.CalculatorPlugin;

public class PerformTask {
    public int add(int a, int b){
        a = a +b;
        return a;
    }

    public int sub(int a, int b){
        a = a -b;
        return a;
    }

    public int mul(int a, int b){
        a = a * b;
        return a;
    }

    public int div(int a, int b){
        a = a / b;
        return a;
    }
}
