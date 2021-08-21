public class Figuras {
    private int ladoCuadrado = 30;
    private int areaCuadrado = ladoCuadrado * ladoCuadrado;
    private int baseTriangulo = 20;
    private int alturaTriangulo = 30;
    private int areaTriangulo = baseTriangulo * alturaTriangulo;
    private int radioRotonda = 5;
    private double areaRotonda = Math.PI * Math.pow(radioRotonda,2);
    
    public void getAreaCuadrado() {
        System.out.println(areaCuadrado);
    }
    
    public void getAreaTriangulo() {
        System.out.println(areaTriangulo);
    }
    
    public void getAreaRotonda() {
        System.out.println(areaRotonda);
    }
}