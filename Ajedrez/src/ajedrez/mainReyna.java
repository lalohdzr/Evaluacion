package ajedrez;

public class mainReyna {

	public static void main(String[] args) {
		
		char tablero[][][] = new char [8][8][8];
		int i = 0 ,j = 0 ,k = 0, reynas = 0, enMovimientoDiagonal = 0,columnas = 0,filas = 0,diagonal = 0;
		
		// llenado de datos 
		tablero[0][0][0] = 'R';
		tablero[1][1][4] = 'R';
		tablero[2][2][7] = 'R';
		tablero[3][3][5] = 'R';
		tablero[4][4][2] = 'R';
		tablero[5][5][5] = 'R';
		tablero[6][6][1] = 'R';
		tablero[7][7][3] = 'R';
						
		
		// Buscar si reyna ataca
		for (i = 0; i<=7;i++) {
			
			for(j= 0; j<=7;j++) {
				for (k = 0;k <= 7;k++) {
					enMovimientoDiagonal = 1;
					if (tablero[i][j][k] != tablero[i][j][k+1]) {
						columnas = 1; // ataca en por columnas  
					}
					if (tablero[i][j][k] != tablero[i][j+enMovimientoDiagonal][k+enMovimientoDiagonal]) {
						diagonal = 1; // ataca en diagonal  
					}
					
				}
				if (tablero[i][j] != tablero[i][j+1]) {
					filas = 1; // ataca en por filas  
				}
				
			}
			if(columnas == 1 || diagonal == 1 || filas == 1) {
				reynas++;
		}

		if(reynas == 8) {
			System.out.println("Tablero armado correctamente");
		}else 
			System.out.println("Tablero armado incorrectamente ");
			
	}		
		
		
		
		
		
		
		
		
		
		

	}

}
