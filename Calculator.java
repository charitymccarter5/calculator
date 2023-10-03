public class Calculator {
    public Calculator(){

    }

    public double add (double a, double b){
        double sum = a + b;
        System.out.println(sum);
        return sum;  
    }

    public double subtract (double a, double b){
        double diff = a - b;
        System.out.println(diff);
        return diff;  
    }

    public double multiply (double a, double b){
        double product = a * b;
        System.out.println(product);
        return product;  
    }

    public double divide (double a, double b){
        double quotient = a / b;
        System.out.println(quotient);
        return quotient;  
    }
}
