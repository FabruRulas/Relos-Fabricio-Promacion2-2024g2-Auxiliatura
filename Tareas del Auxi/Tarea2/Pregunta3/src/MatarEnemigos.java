import java.util.ArrayList;
import java.util.Random;

public class MatarEnemigos {
	
	public MatarEnemigos() {
		
	}
	
	Random random = new Random();
	String items[] ={"Arma","Escudo","Modificador"};
	String rarezas[] = {"Comun","Poco Comun","Raro","Epico","Legendario"};
	Botin botin = new Botin();
	
	ArrayList<Botin> lista = new ArrayList();
	
	
	
	public void generarBotin() {
		int item = random.nextInt(3);
		int rareza = random.nextInt(5);
		botin.setTipo(items[item]);
		botin.setRareza(rarezas[rareza]);
		if(item == 0){
			botin.setAtributo_1("Daño Doble");
			botin.setAtributo_2("Muerte");
			botin.setAtributo_3("Velocidad");
		}
		if(item == 1) {
			botin.setAtributo_1("Proteccion");
			botin.setAtributo_2("Espinas");
			botin.setAtributo_3("Fuego");	
		}
		if(item == 2) {
			botin.setAtributo_1("Invisibilidad");
			botin.setAtributo_2("Fuerza");
			botin.setAtributo_3("Telequinesis");
		}
		lista.add(botin);
	}
	
	public void mostrarBotin() {
		System.out.println(botin.getTipo());
		System.out.println(botin.getRareza());
		System.out.println(botin.getAtributo_1());
		System.out.println(botin.getAtributo_2());
		System.out.println(botin.getAtributo_3());
	}
	
	public void AcabarJuego() {
		for (int i = 0;i<lista.size();i++) {
			System.out.println("Arma numero "+(i+1));
			System.out.println(lista.get(i).getTipo());
			System.out.println(lista.get(i).getRareza());
			System.out.println(lista.get(i).getAtributo_1());
			System.out.println(lista.get(i).getAtributo_2());
			System.out.println(lista.get(i).getAtributo_3());
			System.out.println();
			System.out.println();
		}
			
		
	}
}
