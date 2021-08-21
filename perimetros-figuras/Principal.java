public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Figuras perimetroFiguras = new Figuras();
        System.out.println("Perimetro cuadrado: ");
        perimetroFiguras.getPerimetroCuadrado();
        System.out.println("Perimetro triangulo: ");
        perimetroFiguras.getPerimetroTriangulo();
        System.out.println("Perimetro rotonda: ");
        perimetroFiguras.getPerimetroRotonda();
    }
}