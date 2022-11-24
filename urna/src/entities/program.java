package entities;
import java.util.Scanner;

public class program {

	public static int voto = 0, aux = 0, ant = 0, jos = 0, mar = 0, bra = 0, nulo = 0;

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		do{
			System.out.println("Vote:\n [1] Antonio\n [2] Jose\n [3] Maria\n [4] Branco");
			System.out.print("Digite o respectivo voto: ");
			voto = sc.nextInt();
			
			if(voto==1){
				System.out.println("Confirmar voto em antonio?");
				Confirm();
				ant += aux;
			} else if (voto==2){
				System.out.println("Confirmar voto em José?");
				Confirm();
				jos += aux;
			} else if (voto==3){
				System.out.println("Confirmar voto em Maria?\n");
				Confirm();
				mar+= aux;
			} else if (voto==4){
				System.out.println("Confirmar voto em Branco?\n");
				Confirm();
				bra+=aux;
			} else if (voto>0 || voto<4){
				System.out.println("Confirmar voto nulo?\n");
				Confirm();
				nulo+=aux;
			} else if (voto==0) {
				break;
			}
		
		} while(voto!=0);
	
		Result();
	
	} //main
	
	public static int Confirm (){
		
		System.out.println("[0]Sim [1]Corrigir");
			
		Scanner cnf = new Scanner(System.in);
		int confirm = cnf.nextInt();
			
		if (confirm == 0) {
			return aux = 1;
		} else if (confirm == 1) {
			return aux = 0;
		} else{
			System.out.println("Inválido");
			return 100;
		}
		
	}
			
	public static void Result() {
		System.out.println();
		System.out.println("Fim da votação");
		System.out.println("Antonio " + ant);
		System.out.println("Jose " + jos);
		System.out.println("Maria " + mar);
		System.out.println("Branco " + bra);
		System.out.println("Nulos " + nulo);
		System.out.println();
			
		if (ant>jos && ant>mar){
			System.out.println("Antônio foi eleito prefeito do Rio de Janeiro!");
		} else if (jos>ant && jos>mar){
			System.out.println("Jose foi eleito prefeito do Rio de Janeiro!");
		} else if (mar>jos && mar>ant){
			System.out.println("Maria foi eleita prefeita do Rio de Janeiro!");
		}
			
		else if(mar==jos && jos==ant){
			System.out.println("Segundo turno");
		}
			
		else if (mar==jos){
			System.out.println("Maria e José irão disputar o segundo turno");
		} else if (jos==ant){
			System.out.println("José e Antônio irão disputar o segundo turno");
		} else if (mar==ant){
			System.out.println("Maria e Antônio irão disputar o segundo turno");
		} else if (jos==mar){	
			System.out.println("José e Maria irão disputar o segundo turno");
		} else System.out.println ("Segundo turno");
	}
}

