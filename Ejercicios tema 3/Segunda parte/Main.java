public class Main {
  public static void main(String[] args) {
    Coche miCoche = new Coche ();
    miCoche.AgregarPuerta();
    System.out.println(miCoche.puertas);
}

  public static int suma(int a, int b) {
    return a + b;
}
}

class Coche {
  public int puertas = 2;
  public void AgregarPuerta () {
    this.puertas++;
  }
}
