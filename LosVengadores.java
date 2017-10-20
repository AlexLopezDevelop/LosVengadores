import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class LosVengadores {
	public static void main(String[] args) throws IOException {
		
		int opcion=1;
		
		ArrayList nombres = new ArrayList();
		ArrayList habilidad = new ArrayList();
		ArrayList nivel = new ArrayList();
		ArrayList mejorAmigo = new ArrayList();
		
		while(opcion !=6 ){
			
			
			System.out.println("Los Vengadores");
			System.out.println("-------MENU------");
			System.out.println("                 ");
			System.out.println("1-Yo quiero ser un vengador");
			System.out.println("2-Numero de vengadores");
			System.out.println("3-Ordenar vengadores");
			System.out.println("4-El mas mejor amigo");
			System.out.println("5-Mejorar nivel de superheroe");
			System.out.println("6-Salir");
			System.out.println(" ");
			
			BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

			String op = buffer.readLine();
			opcion = Integer.parseInt(op);
			
			if(opcion!=1 || opcion!=2 || opcion!=3 || opcion!=4 || opcion!=5 || opcion!=6) System.out.println("Opcion no valida");
			
			switch (opcion) {

			case 1:
				
				
				
				break;
				
			}
			
		}
	}
}
