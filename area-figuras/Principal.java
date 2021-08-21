public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido");
        Figuras areaFiguras = new Figuras();
        System.out.println("Area cuadrado: ");
        areaFiguras.getAreaCuadrado();
        System.out.println("Area triangulo: ");
        areaFiguras.getAreaTriangulo();
        System.out.println("Area rotonda: ");
        areaFiguras.getAreaRotonda();
    }
}