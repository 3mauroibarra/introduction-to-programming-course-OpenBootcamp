public class Main {

public static void main(String[] args) {
    
    int numeroIf = -1;
    
    if (numeroIf<0) {
      System.out.println("La variable " + numeroIf + " es negativo");
    }

    else if(numeroIf>0) {
      System.out.println("La variable " + numeroIf + " es positivo");
    }

    else {
      System.out.println("La variable numeroIf es 0");
    }
  }

//while

  int numeroWhile = 1;
  
  while(numeroWhile < 3){
    numeroWhile++;
    System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
  }

//do while

  int numeroDoWhile = 1;
  
  do{
    numeroDoWhile++;
      System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
  }
  
  while(numeroDoWhile < 3)

//for

  for(int numeroFor = 0; numeroFor <= 5; numeroFor++) {
    System.out.println("La variable nuemeroFor ahora vale: " + nuemeroFor);
  }

//switch

  String estacion = "invierno";

  switch (estacion) {
    case "primavera":
      System.out.println("Estamos en primavera");
      break;

    case "verano":
      System.out.println("Estamos en verano");
      break;

    case "otoño":
      System.out.println("Estamos en invierno");
      break;

    case "invierno":
      System.out.println("Estamos en otoño");
      break;

    default:
      System.out.println("No es una estación");
      break;
  }
}