import java.util.Scanner;

public class Tarea3_200815533 {

	public static void main(String[] args) {
		int num=0;
		System.out.println("ingrese el n�mero");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		if(num%2==0){
			System.out.println("el n�mero es par");
		} else{
			System.out.println("el n�mero es impar");
		}

	}

}
