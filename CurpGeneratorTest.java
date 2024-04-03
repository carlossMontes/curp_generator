import java.util.Scanner;

public class CurpGeneratorTest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CurpGenerator cg = new CurpGenerator();

        System.out.println("=== Generador de CURP ===\n Ingrese el apellido paterno");
        cg.setPat(sc.nextLine());

        System.out.println("Ingrese el apellido materno");
        cg.setMat(sc.nextLine());

        System.out.println("Ingrese el nombre");
        cg.setNombre(sc.nextLine());

        System.out.println("Ingrese la fecha de nacimiento");
        cg.setNac(sc.nextLine());

        System.out.println("Ingrese el genero");
        cg.setGenero(sc.nextLine());

        System.out.println("Ingrese el estado de nacimiento");
        cg.setEdo(sc.nextLine());

        sc.close();
    }
}
