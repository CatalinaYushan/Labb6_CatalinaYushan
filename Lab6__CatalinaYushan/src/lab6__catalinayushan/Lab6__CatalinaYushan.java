package lab6__catalinayushan;

import java.util.Scanner;

import java.util.Random;

public class Lab6__CatalinaYushan {

    public static void main(String[] args) {
        Scanner quaxly = new Scanner(System.in); //Scanner
        int opcion = 0;
        boolean choice = true; //Menu que le muestra opciones al usuario
        System.out.println("---Bienvenido!---");
        System.out.println("1. Juego de la Vida");
        System.out.println("2. Rock, Paper, Scissor, Lizard, Spock!");
        System.out.println("3. Blink-182");
        System.out.println("4. Salir del Programa");
        
        System.out.println("Eliga una de las opciones entre 1-3: ");
        
        switch(opcion){ //Switch case que muestra que ayuda a mostrar los diferentes ejercicios
            case 1:
                //NoGameNoLife();
                break;
            case 2:
                //RockPaperScissorLizardSpock();
                break;
            case 3:
                Blink182();
                break;
            case 4:
                System.out.println("Bye-Bye!");
                break;
            
        }
        
    }
    public static void Blink182(){ //Metodo para Ejercicio 3
        Scanner quaxly = new Scanner(System.in);
        System.out.println("Ingrese el numero de filas que desea (y): ");
        System.out.println("Ingrese el numero de columnas que desea (x): ");
        int fila = quaxly.nextInt();
        int columna = quaxly.nextInt();
        
        int [][] neo = new int [fila][columna];
        char [][] tiffany = new char [fila][columna];
        
        for (int i = 0; i < neo.length; i++) {
            for (int j = 0; j < neo[1].length; j++) {
                int max = 122;
                int min = 97;
                int Random = new Random().nextInt((max - min) + 1) + min;
                
                neo [i][j] = Random;
          
            }
            
        }
        for (int i = 0; i < neo.length; i++) {
            for (int j = 0; j < neo[1].length; j++) {
            }
            System.out.println(neo[i][j]+"-");
            }
        System.out.println("");
        
            
        }
                
        

    }
    
    /*public static void RockPaperScissorLizardSpock(){
        Scanner quaxly = new Scanner(System.in);
        System.out.println("Bienvenido a Piedra, Papel, Tijera, Lizard y Spock, Dr. Cooper!");
        System.out.println("Aqui estan sus opciones");
        System.out.println("0. Tijera");
        System.out.println("1. Papel");
        System.out.println("2. Piedra");
        System.out.println("3. Lizard");
        System.out.println("4. Spock");
        
        System.out.println("Puede visualizar la tabla abajo: * es igual a ganar,.");
        System.out.println("Escriba su opcion (ex. Tijera): ");
        int [][] gameanalysis = new int [5][5];
        
        gameanalysis[0][0] = 0;
        gameanalysis[0][1] = 1;
        gameanalysis[0][2] = 2;
        gameanalysis[0][3] = 3;
        gameanalysis[0][4] = 4;
        gameanalysis[0][0] = 0;
        gameanalysis[1][0] = 1;
        gameanalysis[2][0] = 2;
        gameanalysis[3][0] = 3;
        gameanalysis[4][0] = 4;
        
        gameanalysis[1][0] = 0;
        gameanalysis[1][2] = 0;
        gameanalysis[1][3] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        gameanalysis[0][0] = 0;
        
        
        
    
        
    }          

    
    public static void NoGameNoLife(){*/
        
        
    }
    
}
