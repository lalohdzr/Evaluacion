package sudoku;

public class MainSudoku {

	public static void main(String[] args) {
		char tablero [][][] = new char [9][3][3];
		int i = 0 ,j = 0 ,k = 0, numeroInvalido = 0,filas = 0, columna = 0;
		
		// llenado de datos 
		for (i = 0; i<=5;i++) {
			for(j= 0; j<=2;j++) {
			}
	      }
		
		// llenado de datos 
				tablero[0][0][0] = '5';
				tablero[0][0][1] = '3';
				tablero[0][0][2] = '4';
				tablero[0][1][0] = '6';
				tablero[0][1][1] = '7';
				tablero[0][1][2] = '2';
				tablero[0][2][0] = '1';
				tablero[0][2][1] = '9';
				tablero[0][2][2] = '8';

				tablero[1][0][0] = '8';
				tablero[1][0][1] = '5';
				tablero[1][0][2] = '9';
				tablero[1][1][0] = '4';
				tablero[1][1][1] = '2';
				tablero[1][1][2] = '6';
				tablero[1][2][0] = '7';
				tablero[1][2][1] = '1';
				tablero[1][2][2] = '3';
				
				tablero[2][0][0] = '9';
				tablero[2][0][1] = '6';
				tablero[2][0][2] = '1';
				tablero[2][1][0] = '2';
				tablero[2][1][1] = '8';
				tablero[2][1][2] = '7';
				tablero[2][2][0] = '3';
				tablero[2][2][1] = '4';
				tablero[2][2][2] = '5';
				
				tablero[3][0][0] = '5';
				tablero[3][0][1] = '7';
				tablero[3][0][2] = '8';
				tablero[3][1][0] = '1';
				tablero[3][1][1] = '9';
				tablero[3][1][2] = '5';
				tablero[3][2][0] = '3';
				tablero[3][2][1] = '4';
				tablero[3][2][2] = '2';

				tablero[4][0][0] = '7';
				tablero[4][0][1] = '6';
				tablero[4][0][2] = '1';
				tablero[4][1][0] = '8';
				tablero[4][1][1] = '5';
				tablero[4][1][2] = '3';
				tablero[4][2][0] = '9';
				tablero[4][2][1] = '2';
				tablero[4][2][2] = '4';
				
				tablero[5][0][0] = '5';
				tablero[5][0][1] = '3';
				tablero[5][0][2] = '7';
				tablero[5][1][0] = '4';
				tablero[5][1][1] = '1';
				tablero[5][1][2] = '9';
				tablero[5][2][0] = '2';
				tablero[5][2][1] = '8';
				tablero[5][2][2] = '6';
				
				tablero[6][0][0] = '9';
				tablero[6][0][1] = '1';
				tablero[6][0][2] = '2';
				tablero[6][1][0] = '3';
				tablero[6][1][1] = '4';
				tablero[6][1][2] = '1';
				tablero[6][2][0] = '5';
				tablero[6][2][1] = '6';
				tablero[6][2][2] = '7';

				tablero[7][0][0] = '4';
				tablero[7][0][1] = '2';
				tablero[7][0][2] = '3';
				tablero[7][1][0] = '7';
				tablero[7][1][1] = '9';
				tablero[7][1][2] = '1';
				tablero[7][2][0] = '8';
				tablero[7][2][1] = '5';
				tablero[7][2][2] = '6';
				
				tablero[8][0][0] = '2';
				tablero[8][0][1] = '8';
				tablero[8][0][2] = '4';
				tablero[8][1][0] = '6';
				tablero[8][1][1] = '3';
				tablero[8][1][2] = '5';
				tablero[8][2][0] = '1';
				tablero[8][2][1] = '7';
				tablero[8][2][2] = '9';
		
		 // incia validaciones 
		for (i = 0; i<=8;i++) {
			for(j= 0; j<=2;j++) {
				for(k= 0; k<=2;k++) { 
					// validacion de numeros de 1 a 9
					if (tablero[i][j][k] <= 0 || tablero[i][j][k] >= 10)  { 
						numeroInvalido ++; 
						break; // sale del ciclo 
					}
					
					// valida numero repetidos en un cuadrante 
					
					if (j == 2) {
						if (tablero[i][j][k-1] == tablero[i][j][k] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					} else { 
						if (tablero[i][j][k] == tablero[i][j][k+1] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					}
				
				}
			}
		}


		
		// valida numero repetidos en una fila 
		for (i = 0; i<=8;i++) {
		  if(filas <= 9) {
			  numeroInvalido = 0;
			  for(j= 0; j<=2;j++) {
				for(k= 0; k<=2;k++) { 
					if (k == 2) {
						if (tablero[i][j][k-1] == tablero[i][j][k] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					} else { 
						if (tablero[i][j][k] == tablero[i][j][k+1] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					}
				}
				filas++; 
			   }
		  }	  
		}
		// valida numero repetidos en una columna 
		for (i = 0; i<=8;i++) {
		  if(columna <= 9) {
			  numeroInvalido = 0;
			  for(k= 0; k<=2;k++) {
				for(j= 0; j<=2;j++) { 
					if (k == 2) {
						if (tablero[i][k-1][j] == tablero[i][k][j] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					} else { 
						if (tablero[i][k][j] == tablero[i][k+1][j] )  {
							numeroInvalido ++; 
							break; // sale del ciclo 
						}
					}
				}
				columna++; 
			   }
		  }	  
		}
		if (numeroInvalido >= 1) {
			System.out.println("Tablero armado incorrectamente ... " + numeroInvalido);
		}else {
			System.out.println("Tablero armado correctamente ... ");
		}
		
		

	}
	
	

}
