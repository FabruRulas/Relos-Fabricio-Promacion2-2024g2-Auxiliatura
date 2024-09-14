import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class AddressBook {
    private HashMap<String, Contact> contacts;

    public AddressBook() {
        this.contacts = new HashMap<>();
    }

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getEmail())) {
            System.out.println("Un contacto con este email ya existe");
        } else {
            contacts.put(contact.getEmail(), contact);
            System.out.println("Contacto agregado exitosamente.");
            storeContacts();
        }
    }

    public void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("La lista de direcciones esta vacia.");
            return;
        }
        for (Contact contact : contacts.values()) {
            System.out.println(contact.print());
        }
        
    }

    public void searchContact(String email) {
        if (contacts.containsKey(email)) {
            System.out.println(contacts.get(email));
        } else {
            System.out.println("Contacto no encontrado.");
        }
    }

    public void deleteContact(String email) {
        if (contacts.containsKey(email)) {
            contacts.remove(email);
            System.out.println("Contacto borrado.");
            storeContacts();
        } else {
            System.out.println("No se encontro el contacto con este email.");
        }
    }
    
    
    public void storeContacts() {
    	try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("contact.txt"))){
			oos.writeObject(contacts);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
    
    public void loadContacts() {
    	try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("contact.txt"))){
			contacts = (HashMap<String,Contact>) ois.readObject();
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}