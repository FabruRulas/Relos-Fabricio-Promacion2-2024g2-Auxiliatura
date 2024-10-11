public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaNormal cartanormal = new CartaNormal(7 , "Fresco");
		cartanormal.jugar();
		cartanormal.joker();
		CartaEspecial cartaespecial = new CartaEspecial(9, "Fhis");
		cartaespecial.realizarAccion();
		cartaespecial.joker();
		Coche coche = new Coche ("Nissan", "2025",120);
		coche.mostrarInfo();
		coche.gasolina();
		Moto moto = new Moto ("Kawasaki", "2025", 500);
		moto.activarTurbo();
		moto.gasolina();
		Vaca vaca = new Vaca ("Herry Vaca",35);
		vaca.hacerSonido();
		vaca.mostrarInfo();
		vaca.producir();
		vaca.muerte();
		Oveja ovejita = new Oveja ("Pessi", 38);
		ovejita.mostrarInfo();
		ovejita.hacerSonido();
		ovejita.producir();
		ovejita.muerte();
	}
	
}
