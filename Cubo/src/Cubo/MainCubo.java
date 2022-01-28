package Cubo;

public class MainCubo {

	public static void main(String[] args) {
		char cubo [][][] = new char [6][3][3];
		int i = 0 ,j = 0 ,k = 0, unidades = 0, caras = 0;
		// llenado de datos 
		for (i = 0; i<=5;i++) {
			for(j= 0; j<=2;j++) {
				for (k = 0;k <= 2;k++) {
					switch(i) {
					  case 1:
						cubo[i][j][k] = 'W';
						break;
					  case 2:
							cubo[i][j][k] = 'O';
							break;
					  case 3:
							cubo[i][j][k] = 'Y';
							break;
					  case 4:
							cubo[i][j][k] = 'G';
							break;
					  case 5:
								cubo[i][j][k] = 'R';
								break;
					   case 6:
								cubo[i][j][k] = 'B';
								break;							
					 default:
						   System.out.println("Error de operacion"); 
						   break;
				    }
				 }
			}
	      }
		
		// Busca caras completas
		for (i = 0; i<=5;i++) {
			for(j= 0; j<=2;j++) {
				for (k = 0;k <= 2;k++) {
					
					if (cubo[i][j][k] == cubo[i][j][k]) {
						unidades++; 
					}
					if(unidades == 9) { // pregunta si el total de unidades es igual a 9 porque cada cara tine 9 unidades  
					   caras++; 
					   unidades = 0;
					}
				}
			}
		}

		if(caras == 6) {
			System.out.println("El cubo esta completo ");
		}else 
			System.out.println("El cubo esta incompleto ");
			
	}
}

