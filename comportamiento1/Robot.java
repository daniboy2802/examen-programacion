public class Robot {
    private String nombre;
    private int edad;
    private String color;
    private String comportamiento = "Para definir el comportamiento se tiene que definir primero la edad";
    
    public void setNombre(String y) {
        nombre = y;
    }
    
    public void setColor(String y) {
        color = y;
    }
    
    public void setEdad(int y) {
        edad = y;
        if(edad > 6) {
            comportamiento = "Adulto";
        } else {
            comportamiento = "Pequeño";
        }
    }
    
    public void getNombre() {
        System.out.println(nombre);
    }
    
    public void getComportamiento() {
        System.out.println(comportamiento);
    }
    
    public void getEdad() {
        System.out.println(edad);
    }
    
    public void getColor() {
        System.out.println(color);
    }
    
    public void comer() {
        System.out.println("*comiendo*");
    }
    
    public void dormir() {
        System.out.println("*durmiendo*");
    }
}
