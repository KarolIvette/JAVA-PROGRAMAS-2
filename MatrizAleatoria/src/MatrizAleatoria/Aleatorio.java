package MatrizAleatoria;
import java.util.Random;
import javax.swing.JOptionPane;

public class Aleatorio {
	int filas, columnas, total;
	int arr[][];
	int dig;

	public Aleatorio(int[][] arr, int filas,int columnas, int dig) {
		//int matriz[][] = new int [filas][columnas];
	}
	
	public int get_filas(){
		return this.get_filas(); 
	}
	
	public void set_filas(int arr[][], int filas){
		this.filas = filas  ; 
	}
	
	public int get_columnas(){
		return this.get_columnas(); 
	}
	
	public void set_columnas(int arr[][], int columnas){
		this.columnas = columnas  ; 
	}
	
	public int get_dig(){
		return this.get_dig(); 
	}
	
	public void set_dig(int dig){
		this.dig = dig  ; 
	}
	
	public void cargar(int arr[][], int filas, int columnas, int dig){
		arr = new int[filas][columnas];
        for(int f = 0; f < arr.length; f++){
        	for(int c = 0; c < arr[f].length; c++){
                arr[f][c] = ((int) (Math.random()*100)+1);
            }
        }
        
        for(int f = 0; f < arr.length; f++){
            for(int c = 0 ; c < arr[f].length; c++){
                System.out.print(arr[f][c]+"	");
            }
            System.out.println();
        }
        
        System.out.println("\n\nLOS NUMEROS DE LA MATRIZ TERMINADOS EN EL DIGITO "+dig+" SON:\n");
        for(int f = 0; f < arr.length; f++){
            for(int c = 0 ; c < arr.length; c++){
            	if(arr[f][c]%10 == dig){
                	System.out.print(arr[f][c]);
                }
            	else{
            	}
            }
            System.out.println();
        }
    }	
}
