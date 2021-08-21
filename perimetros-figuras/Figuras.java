public class Figuras {
    private int ladoCuadrado = 30;
    private int perimetroCuadrado = ladoCuadrado * 4;
    private int baseTriangulo = 20;
    private int alturaTriangulo = 30;
    private int hipotenusaTriangulo = 45;
    private int perimetroTriangulo = baseTriangulo + alturaTriangulo + hipotenusaTriangulo;
    private int radioRotonda = 5;
    private double perimetroRotonda = 2 * Math.PI * radioRotonda;
    
    public void getPerimetroCuadrado() {
        System.out.println(perimetroCuadrado);
    }
    
    public void getPerimetroTriangulo() {
        System.out.println(perimetroTriangulo);
    }
    
    public void getPerimetroRotonda() {
        System.out.println(perimetroRotonda);
    }
}