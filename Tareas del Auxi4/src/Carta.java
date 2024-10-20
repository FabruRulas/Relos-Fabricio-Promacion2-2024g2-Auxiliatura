public abstract class Carta {
	Integer Valor;
	String Palo;
	
    public Carta (Integer Valor,String Palo){
    	this.Palo = Palo;
    	this.Valor = Valor;
    }
    public abstract void jugar();
    public void mostrarCarta() {
    	System.out.println(Valor + Palo);
    }
}
