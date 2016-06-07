package MesVector;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class NumeroMes {
	int numes;

	public NumeroMes(String[] arr) {
		String vector[] = new String [12];
	}
	
	public int get_numes(){
		return this.numes; 
	}
	
	public void set_numes(int numes){
		this.numes =  numes ; 
	}
	
	static void getNombreMes(String[] arr, int numes){
			for(int i = numes; i<numes+1; i++){
				JOptionPane.showMessageDialog(null, "MES: "+arr[i-1]);
			}
	}
}
