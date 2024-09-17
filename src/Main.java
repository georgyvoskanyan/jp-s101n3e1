import helpers.InputHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {



    public static void printMenu() {

        System.out.println("-------------------------------------------------");
        System.out.println("1. Introduir redactor");
        System.out.println("2. Eliminar redactor");
        System.out.println("3. Introduir notícia a un redactor");
        System.out.println("4. Eliminar notícia");
        System.out.println("5. Mostrar totes les notícies per redactor");
        System.out.println("6. Calcular puntuació de la notícia");
        System.out.println("7. Calcular preu de la notícia");
        System.out.println("0. Sortir de l'aplicació");
        System.out.println("-------------------------------------------------");

    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        List<Editor> editorsList = new ArrayList<>();

        System.out.println("Benvingut/da!");




        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.println("Tria l'acciò del menú:");
            printMenu();
            System.out.println("Tria:");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Nom:");
                    String name = scanner.nextLine();
                    System.out.println("DNI:");
                    String DNI = scanner.nextLine();

                    Editor newEditor = new Editor(DNI, name);
                    if(editorsList.contains(newEditor)) {
                        System.out.println("ERROR: Redactor amb aquest DNI ja està a la llista!");
                        break;
                    }

                    editorsList.add(newEditor);
                    System.out.println("Redactor afegit!");
                    System.out.printf("La colecciò dels redactors ara té %d elements\n", editorsList.size());

                    break;
                }
                case 2: {
                    System.out.println("El DNI del redactor per eliminar:");
                    String DNI = scanner.nextLine();

                    if(!editorsList.removeIf(editor -> editor.getDNI().equals(DNI))) {
                        System.out.println("ERROR: No s'ha trobat un redactor amb aquest DNI!");
                    }
                    else {
                        System.out.println("Redactor eliminat!");
                        System.out.printf("La colecciò dels redactors ara té %d elements\n", editorsList.size());
                    }

                    break;
                }

                case 3: {

                    String name = InputHelper.requestField("El nom del redactor:");

                    Editor editor =
                            editorsList.stream()
                                    .filter( e -> e.getName().equals(name) )
                                    .findAny().orElse(null);

                    if(editor == null) {
                        System.out.println("ERROR: No s'ha trobat un redactor amb aquest nom!");
                        break;
                    }

                    System.out.println("La classe de la noticia per crear:");
                    NewsEntry entry = new NewsManager(scanner).requestNewsEntry();
                    if(entry != null) {
                        editor.addNewsEntry(entry);
                    }
                    break;
                }
                case 4: {
                    String editorName = InputHelper.requestField("El nom del redactor:");

                    Editor editor =
                            editorsList.stream()
                                    .filter( e -> e.getName().equals(editorName) )
                                    .findAny().orElse(null);

                    if(editor == null) {
                        System.out.println("ERROR: No s'ha trobat un redactor amb aquest nom!");
                        break;
                    }

                    String newsTitle = InputHelper.requestField("El titular de la noticia:");

                    /********************
                     * NEWS DELETION CODE
                     */

                    break;
                }


                case 5: {
                    System.out.println("El nom del redactor:");
                    String name = scanner.nextLine();

                    Editor editor =
                            editorsList.stream()
                                    .filter( e -> e.getName().equals(name) )
                                    .findAny().orElse(null);

                    if(editor == null) {
                        System.out.println("ERROR: No s'ha trobat un redactor amb aquest nom!");
                        break;
                    }

                    editor.printNews();
                    break;

                }



                case 6:

                    break;

                case 7:

                    break;

                case 0:
                    System.out.println("Redactors:");
                    for (Editor editor: editorsList) {
                        System.out.printf("Nom %s, DNI %s\n", editor.getName(), editor.getDNI());
                    }
                    System.exit(0);
                default:
                    System.out.println("ERROR: No s'ha pogut reconèixer la teva tria!");
            }
        }
    }


}