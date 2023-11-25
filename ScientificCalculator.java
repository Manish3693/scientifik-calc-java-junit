package org.example;

import java.util.Scanner;
import java.lang.Math;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angmode = 0;
        int choice = 0;
        while(true) {
            displayWelcome();
            int mode = scanner.nextInt();
            switch(mode){
                case 1:
                    displayWelcomeStd();
                    while(choice != 5){
                        displayMenuStd();
                        choice = scanner.nextInt();
                        switch(choice){
                            case 1:
                                performBinaryOperation(scanner, "Addition", ScientificCalculator::add);
                                break;
                            case 2:
                                performBinaryOperation(scanner, "Subtraction", ScientificCalculator::subtract);
                                break;
                            case 3:
                                performBinaryOperation(scanner, "Multiplication", ScientificCalculator::multiply);
                                break;
                            case 4:
                                performBinaryOperation(scanner, "Division", ScientificCalculator::divide);
                                break;
                            case 5:
                                System.out.println("Exiting standard calculator.");
                                break;
                            default:
                                System.out.println("Please enter a number between 1 and 5");
                                break;
                        }
                    }
                    firstTime2=true;
                    break;
                case 2:
                    displayWelcomeScientific();
                    while (choice != 54) {
                    displayMenuScientific();

                    choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            performBinaryOperation(scanner, "Addition", ScientificCalculator::add);
                            break;
                        case 2:
                            performBinaryOperation(scanner, "Subtraction", ScientificCalculator::subtract);
                            break;
                        case 3:
                            performBinaryOperation(scanner, "Multiplication", ScientificCalculator::multiply);
                            break;
                    case 4:
                        performBinaryOperation(scanner, "Division", ScientificCalculator::divide);
                        break;
                    case 5:
                        performUnaryOperation(scanner, "Square Root", ScientificCalculator::sqrt);
                        break;
                    case 6:
                        performBinaryOperation(scanner, "Power", ScientificCalculator::power);
                        break;
                    case 7:
                        performTrigonometricOperation(scanner, 'a', angmode);
                        break;
                    case 8:
                        performTrigonometricOperation(scanner, 'b', angmode);
                        break;
                    case 9:
                        performTrigonometricOperation(scanner, 'c', angmode);
                        break;
                    case 10:
                        performTrigonometricOperation(scanner, 'd', angmode);
                        break;
                    case 11:
                        performTrigonometricOperation(scanner, 'e', angmode);
                        break;
                    case 12:
                        performTrigonometricOperation(scanner, 'f', angmode);
                        break;
                    case 13:
                        performUnaryOperation(scanner, "Logarithm (Base 10)", ScientificCalculator::log10);
                        break;
                    case 14:
                        performUnaryOperation(scanner, "Natural Logarithm", ScientificCalculator::log);
                        break;
                    case 15:
                        performUnaryOperation(scanner, "Logarithm (Base 2)", ScientificCalculator::log2);
                        break;
                    case 16:
                        performUnaryOperation(scanner, "Absolute Value", ScientificCalculator::abs);
                        break;
                    case 17:
                        performUnaryOperation(scanner, "Ceiling", ScientificCalculator::ceil);
                        break;
                    case 18:
                        performUnaryOperation(scanner, "Floor", ScientificCalculator::floor);
                        break;
                    case 19:
                        performUnaryOperation(scanner, "Round", ScientificCalculator::round);
                        break;
                    case 20:
                        performBinaryOperation(scanner, "Logarithm (Custom Base)", ScientificCalculator::logCustomBase);
                        break;
                    case 21:
                        performUnaryOperation(scanner, "Factorial", ScientificCalculator::factorial);
                        break;
                    case 22:
                        performUnaryOperation(scanner, "Exponential", ScientificCalculator::exp);
                        break;
                    case 23:
                        System.out.println("Angle Mode Changed");
                        angmode = ~angmode;
                        break;
                    case 24:
                        performUnaryOperation(scanner, "Degrees to Radians", ScientificCalculator::degreesToRadians);
                        break;
                    case 25:
                        performUnaryOperation(scanner, "Radians to Degrees", ScientificCalculator::radiansToDegrees);
                        break;
                    case 26:
                        performTernaryOperation(scanner, "(a+b)^c", ScientificCalculator::powerOfSum);
                        break;
                    case 27:
                        performTernaryOperation(scanner, "(a-b)^c", ScientificCalculator::powerOfDiff);
                        break;
                    case 28:
                        performUnaryOperation(scanner, "Absolute Power", ScientificCalculator::absPower);
                        break;
                    case 29:
                        performBinaryOperation(scanner, "Modulus", ScientificCalculator::modulus);
                        break;
                    case 30:
                        performUnaryOperation(scanner, "Square", ScientificCalculator::square);
                        break;
                    case 31:
                        performUnaryOperation(scanner, "Cube", ScientificCalculator::cube);
                        break;
                    case 32:
                        performBinaryOperation(scanner, "Minimum", ScientificCalculator::minimum);
                        break;
                    case 33:
                        performBinaryOperation(scanner, "Maximum", ScientificCalculator::maximum);
                        break;
                    case 34:
                        performBinaryOperation(scanner, "Average", ScientificCalculator::average);
                        break;
                    case 35:
                        performBinaryOperation(scanner, "Average", ScientificCalculator::geoaverage);
                        break;
                    case 36:
                        performBinaryOperation(scanner, "Average", ScientificCalculator::harmaverage);
                        break;
                    case 37:
                        performUnaryOperation(scanner, "Inverse", ScientificCalculator::inverse);
                        break;
                    case 38:
                        performBinaryOperation(scanner, "Percentage", ScientificCalculator::percentage);
                        break;
                    case 39:
                        performUnaryOperation(scanner, "Round Up", ScientificCalculator::roundUp);
                        break;
                    case 40:
                        performUnaryOperation(scanner, "Round Down", ScientificCalculator::roundDown);
                        break;
                    case 41:
                        performUnaryOperation(scanner, "Hyperbolic Sine", ScientificCalculator::sinh);
                        break;
                    case 42:
                        performUnaryOperation(scanner, "Hyperbolic Cosine", ScientificCalculator::cosh);
                        break;
                    case 43:
                        performUnaryOperation(scanner, "Hyperbolic Tangent", ScientificCalculator::tanh);
                        break;
                    case 44:
                        performInvTrigonometricOperation(scanner, 'a', angmode);
                        break;
                    case 45:
                        performInvTrigonometricOperation(scanner, 'b', angmode);
                        break;
                    case 46:
                        performInvTrigonometricOperation(scanner, 'c', angmode);
                        break;
                    case 47:
                        performBinaryOperation(scanner, "Permutation", ScientificCalculator::permutation);
                        break;
                    case 48:
                        performBinaryOperation(scanner, "Combination", ScientificCalculator::combination);
                        break;
                    case 49:
                        performUnaryOperation(scanner,"Sum of n",ScientificCalculator::sumofn);
                        break;
                    case 50:
                        performUnaryOperation(scanner,"Sum of squares n",ScientificCalculator::sum2ofn);
                        break;
                    case 51:
                        performUnaryOperation(scanner,"Sum of cubes n",ScientificCalculator::sum3ofn);
                        break;
                    case 52:
                        performBinaryOperation(scanner,"Sum of cubes n",ScientificCalculator::sumkofn);
                        break;
                    case 53:
                        performUnaryOperation(scanner,"nth Harmonic number",ScientificCalculator::harmnum);
                        break;
                    case 54:
                        System.out.println("Exiting scientific calculator.");
                        break;
                    default:
                        System.out.println("Invalid choice. Please enter a number between 1 and 54.");
                    }
                    }
                    firstTime=true;
                    break;
                case 3:
                    System.out.println("Exiting. Thank you for using Calculator Program");
                    System.exit(0);
            }
        }
    }

    private static boolean firstTime = true;
    private static boolean firstTime2 = true;

    private static void displayWelcomeScientific() {
        if (firstTime) {
            System.out.println("Welcome to the Scientific Calculator!");
            System.out.println("Explore a wide range of mathematical operations.");
            System.out.println("Let's get started!");
            System.out.println();
            firstTime = false;
        }
    }

    private static void displayMenuScientific() {
        String[] menuItems = {
                "Addition", "Subtraction", "Multiplication", "Division",
                "Square Root", "Power", "Sin","Cos","Tan","Secant","Co-secant","Co-tangent", "Logarithm (Base 10)",
                "Natural Logarithm", "Absolute Value", "Ceiling", "Floor", "Round",
                "Logarithm (Custom Base)", "Factorial", "Exponential", "Angle Mode: Degrees/Radians",
                "Degrees to Radians","Radians to Degrees",
                "(a+b)^c", "Absolute Power", "Modulus", "Square", "Cube", "Minimum", "Maximum",
                "Average", "Inverse", "Percentage", "Round Up", "Round Down", "Hyperbolic Sine",
                "Hyperbolic Cosine", "Hyperbolic Tangent", "Arcsine", "Arccosine", "Arctangent",
                "Permutation", "Combination", "Sum of n", "Sum of squares of n","Sum of cubes of n","Harmonic Number",
                "Sum of kth power of n","Exit"
        };

        int columnWidth = 300;
        int columns = 5;
        int rows = (int) Math.ceil((double) menuItems.length / columns);

        displayWelcomeScientific();

        System.out.println("Scientific Calculator");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows;
                if (index < menuItems.length) {
                    System.out.printf("%-" + columnWidth + "s", (index + 1) + ". " + menuItems[index]);
                }
            }
            System.out.println();
        }
        System.out.print("Enter your choice: ");
    }

    private static void displayWelcome(){
        System.out.println("Welcome to the Calculator Program");
        System.out.println("Please select a mode");
        System.out.println("1. Standard");
        System.out.println("2. Scientific");
        System.out.println("3. Exit");
        System.out.println();
    }
    private static void displayWelcomeStd() {
        if (firstTime2) {
            System.out.println("Welcome to the Standard Calculator!");
            System.out.println("Let's get started!");
            System.out.println();
            firstTime2 = false;
        }
    }

    private static void displayMenuStd() {
        String[] menuItems = {
                "Addition",
                "Subtraction",
                "Multiplication",
                "Division",
                "Percentage"
        };

        int columnWidth = 25;
        int columns = 5;
        int rows = (int) Math.ceil((double) menuItems.length / columns);

        displayWelcomeScientific();

        System.out.println("Standard Calculator");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                int index = i + j * rows;
                if (index < menuItems.length) {
                    System.out.printf("%-" + columnWidth + "s", (index + 1) + ". " + menuItems[index]);
                }
            }
            System.out.println();
        }
        System.out.print("Enter your choice: ");
    }

    private static void performBinaryOperation(Scanner scanner, String operationName, BinaryOperation operation) {
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        double res = operation.apply(num1, num2);
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        System.out.println();

    }

    private static void performUnaryOperation(Scanner scanner, String operationName, UnaryOperation operation) {
        System.out.print("Enter a number: ");
        double num = scanner.nextDouble();
        double res = operation.apply(num);
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        System.out.println();
    }

    private static void performTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        if(angmode == 0)
            System.out.print("Enter angle in degrees.");
        else {
            System.out.print("Enter angle in radians.");
            trigop += 6;
        }
        switch (trigop) {
            case 'a':
                performUnaryOperation(scanner, "Sine", ScientificCalculator::sin);
                break;
            case 'b':
                performUnaryOperation(scanner, "Cosine", ScientificCalculator::cos);
                break;
            case 'c':
                performUnaryOperation(scanner, "Tangent", ScientificCalculator::tan);
                break;
            case 'd':
                performUnaryOperation(scanner, "Secant", ScientificCalculator::sec);
                break;
            case 'e':
                performUnaryOperation(scanner, "Co-secant", ScientificCalculator::cosec);
                break;
            case 'f':
                performUnaryOperation(scanner, "Co-tangent", ScientificCalculator::cot);
                break;
            case 'g':
                performUnaryOperation(scanner, "Sine-Rad", ScientificCalculator::sinrad);
                break;
            case 'h':
                performUnaryOperation(scanner, "Cosine-Rad", ScientificCalculator::cosrad);
                break;
            case 'i':
                performUnaryOperation(scanner, "Tangent-Rad", ScientificCalculator::tanrad);
                break;
            case 'j':
                performUnaryOperation(scanner, "Secant-Rad", ScientificCalculator::secrad);
                break;
            case 'k':
                performUnaryOperation(scanner, "Co-secant-Rad", ScientificCalculator::cosecrad);
                break;
            case 'l':
                performUnaryOperation(scanner, "Co-tangent-Rad", ScientificCalculator::cotrad);
                break;
            default:
                System.out.println("Invalid choice for trigonometric function");
        }
        System.out.println();
    }

    private static void performInvTrigonometricOperation(Scanner scanner,char trigop,int angmode) {
        if(angmode == 0)
            System.out.println("Results in degrees");
        else {
            System.out.println("Results in radians");
            trigop += 3;
        }
        switch (trigop) {
            case 'a':
                performUnaryOperation(scanner, "Arc Sine", ScientificCalculator::arcsin);
                break;
            case 'b':
                performUnaryOperation(scanner, "Arc Cosine", ScientificCalculator::arccos);
                break;
            case 'c':
                performUnaryOperation(scanner, "Arc Tangent", ScientificCalculator::arctan);
                break;
            case 'd':
                performUnaryOperation(scanner, "Arc Sine-Rad", ScientificCalculator::arcsinrad);
                break;
            case 'e':
                performUnaryOperation(scanner, "Arc Cosine-Rad", ScientificCalculator::arccosrad);
                break;
            case 'f':
                performUnaryOperation(scanner, "Arc Tangent-Rad", ScientificCalculator::arctanrad);
                break;
            default:
                System.out.println("Invalid choice for trigonometric function");
        }
        System.out.println();
    }

    private static void performTernaryOperation(Scanner scanner, String operationName, TernaryOperation operation) {
        System.out.print("Enter first number (a): ");
        double numA = scanner.nextDouble();
        System.out.print("Enter second number (b): ");
        double numB = scanner.nextDouble();
        System.out.print("Enter third number (c): ");
        double numC = scanner.nextDouble();
        double res=operation.apply(numA, numB, numC);
        if(Double.isInfinite(res))
            System.out.println("Value out of range!!");
        System.out.println();
    }

    // Binary operations
    private static double add(double num1, double num2) {
        System.out.println("Performing Addition: " + num1 + " + " + num2);
        double result = num1 + num2;
        System.out.println("Result: " + result);
        return result;
    }

    private static double subtract(double num1, double num2) {
        System.out.println("Performing Subtraction: " + num1 + " - " + num2);
        double result = num1 - num2;
        System.out.println("Result: " + result);
        return result;
    }

    private static double multiply(double num1, double num2) {
        System.out.println("Performing Multiplication: " + num1 + " * " + num2);
        double result = num1 * num2;
        System.out.println("Result: " + result);
        return result;
    }

    private static double divide(double num1, double num2) {
        System.out.println("Performing Division: " + num1 + " / " + num2);
        if (num2 != 0) {
            double result = num1 / num2;
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    private static double power(double base, double exponent) {
        System.out.println("Performing Power Calculation: " + base + " ^ " + exponent);
        double result = Math.pow(base, exponent);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        System.out.println("Result: " + result);
        return result;
    }

    // Unary operations
    private static double sqrt(double num) {
        if(num >= 0) {
            System.out.println("Performing Square Root Calculation: sqrt(" + num + ")");
            double result = Math.sqrt(num);
            System.out.println("Result: " + result);
            return result;
        }
        else{
            System.out.println("Error: Square root of negative numbers is not defined");
            return Double.NaN;
        }
    }
    private static double log10(double num) {
        System.out.println("Performing Logarithm (Base 10) Calculation: log10(" + num + ")");
        if (num > 0) {
            double result = Math.log10(num);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    private static double log2(double num) {
        System.out.println("Performing Logarithm (Base 10) Calculation: log10(" + num + ")");
        if (num > 0) {
            double result = Math.log10(num) / Math.log10(2);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    private static double log(double num) {
        System.out.println("Performing Logarithm Calculation: ln(" + num + ")");
        if (num > 0) {
            double result = Math.log(num);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate natural logarithm of a non-positive number");
            return Double.NaN;
        }
    }

    private static double abs(double num) {
        System.out.println("Performing Absolute Value Calculation: |" + num + "|");
        double result = Math.abs(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double ceil(double num) {
        System.out.println("Performing Ceiling Calculation: ceil(" + num + ")");
        double result = Math.ceil(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double floor(double num) {
        System.out.println("Performing Floor Calculation: floor(" + num + ")");
        double result = Math.floor(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double round(double num) {
        System.out.println("Performing Round Calculation: round(" + num + ")");
        double result = Math.round(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double logCustomBase(double base, double num) {
        System.out.println("Performing Logarithm (Custom Base) Calculation: log_" + base + "(" + num + ")");
        if (base > 0 && base != 1 && num > 0) {
            double result = Math.log(num) / Math.log(base);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for logarithm with custom base");
            return Double.NaN;
        }
    }

    private static double factorial(double num) {
        System.out.println("Performing Factorial Calculation: " + num + "!");
        if (num >= 0) {
            double result = factorial((int) num);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Cannot calculate factorial of a negative number");
            return Double.NaN;
        }
    }

    private static double exp(double num) {
        System.out.println("Performing Exponential Calculation: e^" + num);
        double result = Math.exp(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double degreesToRadians(double degrees) {
        System.out.println("Performing Degrees to Radians Conversion: " + degrees + " degrees");
        double result = Math.toRadians(degrees);
        System.out.println("Result: " + result + " radians");
        return result;
    }

    private static double radiansToDegrees(double rads) {
        System.out.println("Performing Radians to Degrees Conversion: " + rads + " radians");
        double result = Math.toDegrees(rads);
        System.out.println("Result: " + result + " radians");
        return result;
    }

    // Trigonometric operations
    private static double sin(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = Math.sin(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double cos(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = Math.cos(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double tan(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = Math.tan(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double sec(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = 1/Math.cos(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double cosec(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = 1/Math.sin(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double cot(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = 1/Math.tan(Math.toRadians(angle));
        System.out.println("Result: " + result);
        return result;
    }

    private static double sinrad(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = Math.sin(angle);
        System.out.println("Result: " + result);
        return result;
    }

    private static double cosrad(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = Math.cos(angle);
        System.out.println("Result: " + result);
        return result;
    }

    private static double tanrad(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = Math.tan(angle);
        System.out.println("Result: " + result);
        return result;
    }

    private static double secrad(double angle) {
        System.out.println("Performing Sine Calculation: sin(" + angle + " degrees)");
        double result = 1/Math.cos(angle);
        System.out.println("Result: " + result);
        return result;
    }

    private static double cosecrad(double angle) {
        System.out.println("Performing Cosine Calculation: cos(" + angle + " degrees)");
        double result = 1/Math.sin(angle);
        System.out.println("Result: " + result);
        return result;
    }

    private static double cotrad(double angle) {
        System.out.println("Performing Tangent Calculation: tan(" + angle + " degrees)");
        double result = 1/Math.tan(angle);
        System.out.println("Result: " + result);
        return result;
    }

    // Factorial function
    private static int factorial(int n) {
        System.out.println("Performing Factorial Calculation: " + n + "!");
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    private static int sumofn(int n) {
        return (n * (n+1)) / 2;
    }

    private static int sum2ofn(int n) {
        return (n * (n+1) * (2*n+1)) / 6;
    }

    private static int sum3ofn(int n) {
        return (int)Math.pow((double)(n * (n+1)) / 2,2);
    }

    // Combination and Permutation functions
    private static double combination(double n, double r) {
        System.out.println("Performing Combination Calculation: C(" + n + ", " + r + ")");
        if (n >= r && n >= 0 && r >= 0) {
            double result = factorial(n) / (factorial(r) * factorial(n - r));
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for combination");
            return Double.NaN;
        }
    }

    private static double permutation(double n, double r) {
        System.out.println("Performing Permutation Calculation: P(" + n + ", " + r + ")");
        if (n >= r && n >= 0 && r >= 0) {
            double result = factorial(n) / factorial(n - r);
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Invalid input for permutation");
            return Double.NaN;
        }
    }

    // Binary operations
    private static double powerOfSum(double a, double b, double c) {
        System.out.println("Performing Power of Sum Calculation: (" + a + " + " + b + ") ^ " + c);
        double result = Math.pow((a + b), c);
        if(Double.isNaN(result)) {
            System.out.println("Error: Invalid input.");
            return Double.NaN;
        }
        System.out.println("Result: " + result);
        return result;
    }
    private static double powerOfDiff(double a, double b, double c) {
        System.out.println("Performing Power of Difference Calculation: (" + a + " - " + b + ") ^ " + c);
        double result = Math.pow((a - b), c);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid input.");
            return Double.NaN;
        }
        System.out.println("Result: " + result);
        return result;
    }


    // Unary operations
    private static double absPower(double num) {
        System.out.println("Performing Absolute Power Calculation: |" + num + "| ^ 2");
        double result = Math.pow(Math.abs(num), 2);
        System.out.println("Result: " + result);
        return result;
    }

    private static double inverse(double num) {
        System.out.println("Performing Inverse Calculation: 1 / " + num);
        if (num != 0) {
            double result = 1 / num;
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Division by zero");
            return Double.NaN;
        }
    }

    private static double square(double num) {
        System.out.println("Performing Square Calculation: " + num + " ^ 2");
        double result = Math.pow(num, 2);
        System.out.println("Result: " + result);
        return result;
    }

    private static double cube(double num) {
        System.out.println("Performing Cube Calculation: " + num + " ^ 3");
        double result = Math.pow(num, 3);
        System.out.println("Result: " + result);
        return result;
    }

    private static double arcsin(double num) {
        System.out.println("Performing Arcsine Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        System.out.println("Result: " + result);
        return result;
    }

    private static double arcsinrad(double num) {
        System.out.println("Performing Arcsine(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double arccos(double num) {
        System.out.println("Performing Arccos Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        System.out.println("Result: " + result);
        return result;
    }

    private static double arccosrad(double num) {
        System.out.println("Performing Arccos(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double arctan(double num) {
        System.out.println("Performing Arctan Calculation: arcsin(" + num + ")");
        double result = radiansToDegrees(Math.asin(num));
        System.out.println("Result: " + result);
        return result;
    }

    private static double arctanrad(double num) {
        System.out.println("Performing Arctan(Radians) Calculation: arcsin(" + num + ")");
        double result = Math.asin(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double sinh(double num) {
        System.out.println("Performing Hyperbolic Sine Calculation: sinh(" + num + ")");
        double result = Math.sinh(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double cosh(double num) {
        System.out.println("Performing Hyperbolic Cosine Calculation: cosh(" + num + ")");
        double result = Math.cosh(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double tanh(double num) {
        System.out.println("Performing Hyperbolic Tangent Calculation: tanh(" + num + ")");
        double result = Math.tanh(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double roundUp(double num) {
        System.out.println("Performing Round Up Calculation: ceil(" + num + ")");
        double result = Math.ceil(num);
        System.out.println("Result: " + result);
        return result;
    }

    private static double roundDown(double num) {
        System.out.println("Performing Round Down Calculation: floor(" + num + ")");
        double result = Math.floor(num);
        System.out.println("Result: " + result);
        return result;
    }

    // Binary operations
    private static double modulus(double num1, double num2) {
        System.out.println("Performing Modulus Calculation: " + num1 + " % " + num2);
        if (num2 != 0) {
            double result = num1 % num2;
            System.out.println("Result: " + result);
            return result;
        } else {
            System.out.println("Error: Modulus by zero");
            return Double.NaN;
        }
    }

    private static double minimum(double num1, double num2) {
        System.out.println("Performing Minimum Calculation: min(" + num1 + ", " + num2 + ")");
        double result = Math.min(num1, num2);
        System.out.println("Result: " + result);
        return result;
    }

    private static double maximum(double num1, double num2) {
        System.out.println("Performing Maximum Calculation: max(" + num1 + ", " + num2 + ")");
        double result = Math.max(num1, num2);
        System.out.println("Result: " + result);
        return result;
    }

    private static double average(double num1, double num2) {
        System.out.println("Performing Average Calculation: ( " + num1 + " + " + num2 + " ) / 2");
        double result = (num1 + num2) / 2;
        System.out.println("Result: " + result);
        return result;
    }

    private static double geoaverage(double num1, double num2) {
        System.out.println("Performing Geometric Mean Calculation: ( " + num1 + " + " + num2 + " ) / 2");
        double result =  sqrt(num1 * num2);
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        System.out.println("Result: " + result);
        return result;
    }

    private static double harmaverage(double num1, double num2) {
        System.out.println("Performing Harmonic Mean Calculation: ( " + num1 + " + " + num2 + " ) / 2");
        double result =  1/num1 + 1/num2;
        if(Double.isNaN(result)){
            System.out.println("Error: Invalid Input");
            return Double.NaN;
        }
        System.out.println("Result: " + result);
        return result;
    }
    private static double percentage(double num1, double num2) {
        System.out.println("Performing Percentage(b is % of a) Calculation: ( " + num1 + " / " + num2 + " ) * 100");
        double result = (num1 / num2) * 100;
        System.out.println("Result: " + result);
        return result;
    }

    private static double harmnum(double num){
        System.out.println("Finding " + num + "th harmonic number." );
        if (num >= 0) {
            int n=(int)num;
            double result=0;
            for(int i=1;i<=n;i++){
                result += 1.0/(double)i;
            }
            System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate if n is negative.");
            return Double.NaN;
        }
    }
    private static double sumofn(double num) {
        System.out.println("Performing Sum of n numbers Calculation: S(" + num + ")" );
        if (num >= 0) {
            double result = sumofn((int) num);
            System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S(n) if n is negative.");
            return Double.NaN;
        }
    }

    private static double sum2ofn(double num) {
        System.out.println("Performing Sum of Squares of n numbers Calculation: S2(" + num + ")" );
        if (num >= 0) {
            double result = sum2ofn((int) num);
            System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S2(n) if n is negative.");
            return Double.NaN;
        }
    }

    private static double sum3ofn(double num) {
        System.out.println("Performing Sum of Cubes of n numbers Calculation: S3(" + num + ")" );
        if (num >= 0) {
            double result = sum3ofn((int) num);
            System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S3(n) if n is negative.");
            return Double.NaN;
        }
    }

    private static double sumkofn(double num,double k){
        System.out.println("Performing Sum of kth power of n numbers Calculation: Sk(" + num + ")" );
        if(num >= 0){
            double result = 0;
            for(double i=1;i<=num;i++){
                result+=Math.pow(i,k);
            }
            System.out.println("Result: " + result);
            return result;
        }
        else {
            System.out.println("Error: Cannot calculate S3(n) if n is negative.");
            return Double.NaN;
        }
    }

    // Functional interfaces for binary and unary operations
    @FunctionalInterface
    interface BinaryOperation {
        double apply(double num1, double num2);
    }

    @FunctionalInterface
    interface UnaryOperation {
        double apply(double num);
    }

    @FunctionalInterface
    interface TernaryOperation {
        double apply(double a, double b, double c);
    }

}

