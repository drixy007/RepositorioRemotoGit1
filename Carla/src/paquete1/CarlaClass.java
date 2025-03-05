package paquete1;
import java.util.Scanner;
public class CarlaClass {
	public static void main(String[] args) {
		String respuesta = "si";
        Scanner scanner = new Scanner(System.in);
        while (respuesta == "si") {
            System.out.println("Introduce tu edat: ");
            int edad = scanner.nextInt();
            if (edad >= 18) {
                System.out.println("Eres mayor de edad");
            }
            Scanner scanner2 = new Scanner(System.in);
            System.out.println("Quieres decir otra edad?");
            respuesta = scanner2.nextLine();
        }
        System.out.println("Gracias por utilizar el programa");
	}
}

