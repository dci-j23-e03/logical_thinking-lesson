
public class Main {
    public static void main(String[] args) {

        // boolean expression can be boolean literal (true/false), variable, method call, or combination of those with boolean operator
        // true == isEven(5) - complex boolean expression, combining boolean expressions with boolean operator ==
        // true && isEven(5) - logical expression
        // the whole expression needs to evaluate to a single boolean value
        boolean b = true; // b is boolean expression

        // logical expression is a combination of boolean expression(s) with logical operator
        if (true && b) { // true is a boolean expression, true && b is a logical expression
            System.out.println("Both conditions are met!");
        }

        // without logical operators, we have more code
        if (5 > 4) { // 5 > 4 is an expression
            if ("hello".equals("hello")) { // method call with boolean return type is a boolean expression
                System.out.println("Both conditions are met!");
            }
        }

        // usage of logical expressions in loops
        double a = 0;
        int c = 0;
        while (a < 0.9 && c < 10) {
            c = c + 1;
            a = Math.random();
            System.out.println(c);
            System.out.println(a);
        }

        // more complex logical expression, 3 operands, () to change precedence
        boolean x = true;
        int y = 1;

        while (x && (y < 10 || isEven(y))) {
            y = y + 1;
            System.out.println(y);
        }

        // Java is strongly typed language, and we need to provide true/false value for boolean variables
//        boolean t = 2;

        // logical not operator
        boolean s = true;
        System.out.println("Original value of s: " + s);
        System.out.println("Inverted s: " + !s);

        boolean p = 6 > 5 && true;
        System.out.println("Original value of p: " + p);
        System.out.println("Inverted p: " + !(6 > 5 && true));
    }

    static boolean isEven(int number) {
        System.out.println(number % 2 == 0);
        return number % 2 == 0;
    }
}