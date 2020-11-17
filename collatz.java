import java.util.Scanner;

public class collatz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int valor=0;
		int contador=0;
		Scanner teclado=new Scanner(System.in);
		
		System.out.println("Introduzca un valor para calcular la serie:");
		
		do {
					
			valor = teclado.nextInt();
		
			if(valor<=1) System.out.println("El valor debe ser mayor que 1");
				
		}while(valor<=1);
			
		teclado.close();
		
		System.out.print(valor + ", ");
		
		contador=contador+1;
		
		do {
			
			if(valor%2==0){valor=valor/2;
			}else {
				valor=(valor*3)+1;
			}
			
			contador=contador+1;
			
			if(valor!=1) {
				
				if(contador%10==0) {System.out.println(valor + ", ");
				}else {
					System.out.print(valor + ", ");
				}
				
				
			}else {System.out.print(valor);
			}
		
		}while(valor!=1);
		
		
		
	}

}
