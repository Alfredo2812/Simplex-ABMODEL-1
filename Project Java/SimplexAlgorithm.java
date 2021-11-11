import java.util.Scanner;
import java.io.*;
public class SimplexAlgorithm{
    public static void main(String args[]){

        //Variables de la matriz
        int filas = 0, columnas = 0, contador =  1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Escribe el número de restricciones que quieres");
        filas = entrada.nextInt();

        filas=filas+1;
        System.out.println("Escribe la cantidad de variables que tienes");
        columnas = entrada.nextInt();
        columnas=columnas+filas+1;
        
        System.out.println("Valor filas "+filas);
        System.out.println("Valor Colmnas "+columnas);


        Double numeros [][] = new Double [filas][columnas];

        for(int j = 0; j < filas; j++){
            for(int i = 0; i < columnas; i++){
                if(i < filas-1){
                    System.out.println("Ingrese las variable x " + i+":" );
                    numeros[j][i] = entrada.nextDouble();

                }else if(i >=filas-1 && i != columnas-1){
                    System.out.println("Ingrese las variable S " + i +":" );
                    numeros[j][i] = entrada.nextDouble();

                }else if (i==columnas-1){
                    System.out.println("Ingrese el valor de solucion: " + i );
                    numeros[j][i] = entrada.nextDouble();

                }   
            }
        }
            
        
        for(int j = 0; j < filas; j++){
            for(int i = 0; i < columnas; i++){
			System.out.print(" "+numeros[j][i]);	
			}
			System.out.println(" ");
		}
        System.out.println(" prueba");
	
    }
}