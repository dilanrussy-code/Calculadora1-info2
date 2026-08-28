import java.util.Scanner;

public class Calculadora1 {

    float a;
    float b;
    String operacion;

    public float sumar() {
        return a + b;
    }

    public float restar() {
        return a - b;
    }

    public float multiplicar() {
        return a * b;
    }

    public float dividir() {
        return a / b;
    }

    public float modulo() {
        return a % b;
    }

    public double potencia() {
        return Math.pow(a, b);
    }

    public double coseno() {
        return Math.cos(a);
    }

    public double seno() {
        return Math.sin(a);
    }

    public static void main(String[] args) {

        Scanner nume = new Scanner(System.in);

        Calculadora1 calculadora1 = new Calculadora1();

        System.out.print("Digite la operacion (+, -, *, /, %, pow, cos, sin): ");
        calculadora1.operacion = nume.next();

        System.out.println("Digite el primer valor");
        calculadora1.a = nume.nextFloat();

        System.out.println("Digite el segundo valor");
        calculadora1.b = nume.nextFloat();

        if (calculadora1.operacion.equals("+")) {
            System.out.println(calculadora1.sumar());
        }

        if (calculadora1.operacion.equals("-")) {
            System.out.println(calculadora1.restar());
        }

        if (calculadora1.operacion.equals("*")) {
            System.out.println(calculadora1.multiplicar());
        }

        if (calculadora1.operacion.equals("/")) {
            System.out.println(calculadora1.dividir());
        }

        if (calculadora1.operacion.equals("%")) {
            System.out.println(calculadora1.modulo());
        }

        if (calculadora1.operacion.equals("pow")) {
            System.out.println(calculadora1.potencia());
        }

        if (calculadora1.operacion.equals("cos")) {
            System.out.println(calculadora1.coseno());
        }

        if (calculadora1.operacion.equals("sin")) {
            System.out.println(calculadora1.seno());
        }
    }
}
