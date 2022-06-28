public class Main {
  public static void main() {
    Cliente cliente = new Cliente();
    Trabajador trabajador = new Trabajador();
    cliente.nombre = "Mauro";
    cliente.edad = 21;
    cliente.telefono = 123456789;
    cliente.credito = 150.55;
    System.out.println("Soy " + cliente.nombre + ", tengo" + cliente.edad + " años y mi telefono es" + cliente.telefono + " y mi credito disponible es " + cliente.credito + "$");
  }
}

class Persona {
  int edad;
  int telefono;
  String nombre;
}

class Cliente extends Persona{
  double credito;
}

class Trabajador extends Persona{
  double salario;
}