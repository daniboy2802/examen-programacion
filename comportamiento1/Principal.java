public class Principal {
    public static void main(String[] args) {
        System.out.println("Bienvenido a la aplicacion creadora de mascotas Robot");
        Perro perrito1 = new Perro();
        perrito1.setNombre("Jordan");
        perrito1.setEdad(7);
        perrito1.getComportamiento();
        perrito1.getNombre();
        perrito1.ladrar();
    }
}