public class Persona {

    String nombre;
    String apellidos;
    int edad;

    public Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }
    
    public void Cumpleaños() {
        edad++;
        System.out.println("Feliz cumpleaños! " + nombre + " ahora tiene " + edad + " años.");
    }
    public static void main(String[] args) {
      Persona persona = new Persona("Pablo", "Aguilera", 18);

      System.out.println("Antes del cumpleaños:");
      System.out.println("Nombre: " + persona.nombre);
      System.out.println("Apellidos: " + persona.apellidos);
      System.out.println("Edad: " + persona.edad);

      persona.Cumpleaños();

      System.out.println("Después del cumpleaños:");
      System.out.println("Nombre: " + persona.nombre);
      System.out.println("Apellidos: " + persona.apellidos);
      System.out.println("Edad: " + persona.edad);
  }// comentario cambios
}    

    
