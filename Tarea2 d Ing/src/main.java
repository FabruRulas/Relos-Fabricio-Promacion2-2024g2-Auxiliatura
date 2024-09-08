import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner scanner = new Scanner(System.in);
        Contact con1 = new Contact("javi","as",2,"2222");
        Integer option;
        addressBook.loadContacts();
        do {
            System.out.println("\n*** Lista de Contactos ***");
            System.out.println("1. Agregar Contacto");
            System.out.println("2. Ver Contacto");
            System.out.println("3. Buscar Contacto");
            System.out.println("4. Borrar contacto");
            System.out.println("5. Salir");
            System.out.print("Selecciona una opcion: ");
            option = scanner.nextInt();
            scanner.nextLine(); // Clear 

            switch (option) {
                case 1:
                    System.out.print("Ingrese nombre: ");
                    String name = scanner.nextLine();
                    System.out.print("Ingresar Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Ingresar Edad: ");
                    int age = scanner.nextInt();
                    scanner.nextLine(); // Clear buffer
                    System.out.print("Ingresar numero de celular: ");
                    String phone = scanner.nextLine();
                    Contact contact = new Contact(name, email, age, phone);
                    addressBook.addContact(contact);
                    break;
                case 2:
                    addressBook.viewContacts();
                    break;
                case 3:
                    System.out.print("Ingrese el email del contacto para buscar: ");
                    email = scanner.nextLine();
                    addressBook.searchContact(email);
                    break;
                case 4:
                    System.out.print("Ingrese el email del contacto a eliminar: ");
                    email = scanner.nextLine();
                    addressBook.deleteContact(email);
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opcion invalidad intentelo de nuevo.");
            }
        } while (option != 5);
    }
}