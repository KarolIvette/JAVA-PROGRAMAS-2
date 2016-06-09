package FiguraRombo;

public class Rombo
{
	int tamaño;
	
	public int get_tamaño(){
		return this.tamaño; 
	}
	
	public void set_tamaño(int tamaño){
		this.tamaño=tamaño; 
	}
	
	
	public void dibujarombo ( int tamaño ) {
		for (int i = 0; i < tamaño; ++i) {
			System.out.println();
            System.out.print(" ");
           
            for (int j = 0; j < tamaño-i-1; ++j){
            	System.out.print(" ");           
            }
            
            for (int j = 0; j < 2*i+1; ++j){
            	if ((i==0)||(j==0)||(j==2*i)){
                    System.out.print("*");
                } else {
                    	System.out.print(" ");
                  }
            }
        }
        
		System.out.println();
		
		for (int i = 1; i <= tamaño*2+1; i++) {
			if ((i>1 && i<tamaño*2+1 ))
				System.out.print( " " );
			else
				System.out.print( "*" );
		}
		
        for (int j = tamaño-1; j >= 0; --j) {
            System.out.println();
            System.out.print(" ");
            
            for (int i = 0; i < tamaño-j-1; ++i) {                
                System.out.print(" ");
            }
            
            for (int i = 0; i < 2*j+1; ++i) {
            	if ((j==0)||(i==0)||(i==2*j)){
            		System.out.print("*");
                } else {
                    System.out.print(" ");
                  }                
            }
        }
        System.out.println();
    }
}