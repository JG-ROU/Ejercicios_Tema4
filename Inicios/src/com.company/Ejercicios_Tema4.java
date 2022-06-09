package com.company;

public class Ejercicios_Tema4 {
    public static void main (String[] args){

        //Primer Punto
        System.out.println(">>>>> Primer Punto");
        int numeroIf=90;

            if (numeroIf >0 ){
                System.out.println("es positivo");
                      }else if (numeroIf < 0){
                System.out.println("Es negativo");
            }else{
                System.out.println("Ingrese un numero diferente de 0");
            }
        System.out.println("");
        System.out.println(">>>>> Segundo Punto");
        // Segundo Punto
        int numeroWhile =1;

        while (numeroWhile < 3) {
            System.out.println(numeroWhile);
            numeroWhile = numeroWhile + 1;
        }
        System.out.println("");
        System.out.println(">>>>> Tercer Punto");
        // Tercer Punto
        int numeroDoWhile =2;

        do {
            System.out.println(numeroDoWhile);
            numeroDoWhile = numeroWhile +1;
        }while (numeroDoWhile < 3);

        System.out.println("");
        System.out.println(">>>>> Cuarto Punto");
        // Cuarto Punto
        for(int numeroFor=0; numeroFor<=3; numeroFor = numeroFor +1){
            System.out.println(numeroFor);
        }
        System.out.println("");
        System.out.println(">>>>> QuintoPunto");
        // Quinto Punto
        String Estacion="lolo";
        switch (Estacion){
            case "Primavera":
                System.out.println("Esta estacion es:"+Estacion);
                break;
            case "Otoño":
                System.out.println("Esta estacion es:"+Estacion);
                break;
            case "Invierno":
                System.out.println("Esta estacion es:"+Estacion);
                break;
            case "Verano":
                System.out.println("Esta estacion es:"+Estacion);
                break;
            default:
                System.out.println("Ingrese una estacion valida");
                break;
        }

    }
    //Aqui las funciones
}
