import Modelo.CV;
import Modelo.CVBuilder;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CVBuilder builder = new CVBuilder();

        System.out.print("¿Desea incluir educación en el CV? (si/no): ");
        if (scanner.nextLine().equalsIgnoreCase("si")) {
            System.out.print("Ingrese la educación: ");
            builder.setEducation(scanner.nextLine());
        }

        System.out.print("¿Desea incluir experiencia en el CV? (si/no): ");
        if (scanner.nextLine().equalsIgnoreCase("si")) {
            System.out.print("Ingrese la experiencia: ");
            builder.setExperience(scanner.nextLine());
        }

        System.out.print("¿Desea incluir habilidades en el CV? (si/no): ");
        if (scanner.nextLine().equalsIgnoreCase("si")) {
            System.out.print("Ingrese las habilidades: ");
            builder.setSkills(scanner.nextLine());
        }

        CV cv = builder.build();
        System.out.println("\nCV generado:");
        System.out.println(cv);

        scanner.close();
    }
}


