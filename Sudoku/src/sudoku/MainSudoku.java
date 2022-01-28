package sudoku;

public class MainSudoku {

	public static void main(String[] args) {
		char tablero [][][] = new char [9][3][3];
		int i = 0 ,j = 0 ,k = 0, unidades = 0, cuadros = 0,numeroInvalido = 0;
		
		// llenado de datos 
		for (i = 0; i<=5;i++) {
			for(j= 0; j<=2;j++) {
				for (k = 0;k <= 2;k++) {
				 }
			}
	      }
		
		// 
		for (i = 0; i<=5;i++) {
			for(j= 0; j<=2;j++) {
				for (k = 0;k <= 2;k++) {
					
					if (tablero[i][j][k] <= 0 || tablero[i][j][k] >= 10)  {
						numeroInvalido ++; 
						break; // sale del ciclo 
					}
				}
			}
		}

		if (numeroInvalido == 1) {
			System.out.println("Numero invalido, verifique ... ");
		}	
		
		if(caras == 6) {
			System.out.println(" ");
		}else 
			System.out.println(" ");
			
	
		
		
		
		
		
		

	}

}
