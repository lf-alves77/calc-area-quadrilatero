public class quadrilatero {

    public static double area(double lado) {

        System.out.println("Área do quadrado: " + lado * lado);
        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        System.out.println("Área do retângulo: " + lado1 * lado2);
        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        System.out.println("Área do trapézio: " + ((baseMenor+baseMaior)*altura) / 2);
        return ((baseMenor+baseMaior)*altura) / 2;
    }

    public static float area(float diagonal1, float diagonal2) {

        System.out.println("Area do Losango: " + ((diagonal1 * diagonal2) / 2));
        return ((diagonal1 * diagonal2) / 2);
    } 




    
}
