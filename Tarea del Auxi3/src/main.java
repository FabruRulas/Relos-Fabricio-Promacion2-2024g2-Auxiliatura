import java.util.Random;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inventario inventario = new Inventario();
		inventario.agregarItem("Casco");
		inventario.agregarItem("Pechera");
		inventario.mostrarItem();
		Random valorRandom = new Random();
		Mago Chespi = new Mago("Chespi",valorRandom.nextInt(100)+1,100, 70);
		Guerrero Barbaro = new Guerrero ("Barbaro",valorRandom.nextInt(100)+1,100,80);
		while (Chespi.getPuntosdeVida()>0 && Barbaro.getPuntosdeVida()>0) {
			Chespi.lanzarHechizo();
			int dano = valorRandom.nextInt(11)+10;
				Barbaro.recibirDano(dano);
			Barbaro.atacar();
			int danno = valorRandom.nextInt(11)+10;
				Chespi.recibirDano(danno);
			System.out.println(Chespi.mostrarEstado()); 
			System.out.println(Barbaro.mostrarEstado());
			if(Chespi.getPuntosdeVida()>0 && Barbaro.getPuntosdeVida()<=0) {
				System.out.println("Gano "+ Chespi.getNombre());
				Chespi.Hablar();
			}
			if(Chespi.getPuntosdeVida()<=0 && Barbaro.getPuntosdeVida()>0) {
				System.out.println("Gano "+ Barbaro.getNombre());
				Barbaro.Hablar();
			}
			if(Chespi.getPuntosdeVida()<=0 && Barbaro.getPuntosdeVida()<=0) {
				System.out.println("Perdieron los 2");
			}
		}
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Elija su personaje");
		System.out.println("1 Arquero, 2 Guerrero, 3 Mago");
		Integer Personaje = scanner.nextInt();
		System.out.println("Elija los atributos de su personaje (Nombre, nivel,puntos de vida y AtributoNivel)");
		String Nombre = scanner.next();
		Integer  Nivel = scanner.nextInt();
		Integer PuntosdeVida = scanner.nextInt();
		Integer AtributoEspecial = scanner.nextInt();
		System.out.println("Elija su enemigo");
		System.out.println("1 Vampiro, 2 Zombie");
		Integer Enemigo = scanner.nextInt(); 
		System.out.println("Elija los atributos de su enemigo (Nombre y Ataque) ");
		String NombreE = scanner.next();
		Integer Ataquebase = scanner.nextInt();
		Arquero arquero = new Arquero(Nombre,Nivel,PuntosdeVida,AtributoEspecial); 
		Mago mago = new Mago(Nombre,Nivel,PuntosdeVida,AtributoEspecial); 
		Guerrero guerrero = new Guerrero(Nombre,Nivel,PuntosdeVida,AtributoEspecial); 
		Zombie zombie = new Zombie(NombreE,100,Ataquebase);
		Vampiro vampiro = new Vampiro (NombreE,100,Ataquebase); 
		boolean HabilitadoparaJefes = false;
		if(Personaje == 1) {
			if(Enemigo == 1) {
				while (vampiro.estaVivo() && arquero.getPuntosdeVida()>0) {
					arquero.LanzarFlecha();
					int dano = valorRandom.nextInt(11)+10;
						vampiro.recibirDano(dano);
					
						arquero.recibirDano(vampiro.atacar());
				
					System.out.println(arquero.mostrarEstado());
					if(arquero.getPuntosdeVida()>0 && !vampiro.estaVivo()) {
						Chespi.Hablar();
						HabilitadoparaJefes = true;
					}
					if(arquero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			else {
				while (zombie.estaVivo() && arquero.getPuntosdeVida()>0) {
					arquero.LanzarFlecha();
					int dano = valorRandom.nextInt(11)+10;
						zombie.recibirDano(dano);
					
						arquero.recibirDano(zombie.atacar());
				
					System.out.println(arquero.mostrarEstado());
					if(arquero.getPuntosdeVida()>0 && !zombie.estaVivo()) {
						arquero.Hablar();
						HabilitadoparaJefes = true;
					}
					if(arquero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
		}
		if(Personaje == 2) {
			if(Enemigo == 1) {
				while (vampiro.estaVivo() && guerrero.getPuntosdeVida()>0) {
					guerrero.atacar();
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						vampiro.recibirDano(dano);
					
						guerrero.recibirDano(vampiro.atacar());
				
					System.out.println(guerrero.mostrarEstado());
					if(guerrero.getPuntosdeVida()>0 && !vampiro.estaVivo()) {
						guerrero.Hablar();
						HabilitadoparaJefes = true;
					}
					if(guerrero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			else {
				while (zombie.estaVivo() && guerrero.getPuntosdeVida()>0) {
					guerrero.atacar();;
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						zombie.recibirDano(dano);
					
						guerrero.recibirDano(zombie.atacar());
				
					System.out.println(guerrero.mostrarEstado());
					if(guerrero.getPuntosdeVida()>0 && !zombie.estaVivo()) {
						guerrero.Hablar();
						HabilitadoparaJefes = true;
					}
					if(guerrero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
		}
		if(Personaje == 3) {
			if(Enemigo == 1) {
				while (vampiro.estaVivo() && mago.getPuntosdeVida()>0) {
					mago.lanzarHechizo();
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						vampiro.recibirDano(dano);
					
						mago.recibirDano(vampiro.atacar());
				
					System.out.println(mago.mostrarEstado());
					if(mago.getPuntosdeVida()>0 && !vampiro.estaVivo()) {
						mago.Hablar();
						HabilitadoparaJefes = true;
					}
					if(mago.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			else {
				while (zombie.estaVivo() && mago.getPuntosdeVida()>0) {
					mago.lanzarHechizo();
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						zombie.recibirDano(dano);
					
						mago.recibirDano(zombie.atacar());
					System.out.println(mago.mostrarEstado());
					if(guerrero.getPuntosdeVida()>0 && !zombie.estaVivo()) {
						mago.Hablar();
						HabilitadoparaJefes = true;
					}
					if(mago.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
		}
		System.out.println("Preparate contra la linterna Negra");
		String basura = scanner.nextLine();
		Jefe jefe = new Jefe("Blandin Blendin", 1000000, 5000, 2);
		if(HabilitadoparaJefes) {
			jefe.hablar();
			System.out.println("AGARRENSE A VERGAZOS...");
			if(Personaje == 1) {
				while (jefe.estaVivo() && arquero.getPuntosdeVida()>0) {
					arquero.LanzarFlecha();;
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						jefe.recibirDano(dano);
						int danoCritico = valorRandom.nextInt(10);
						if(danoCritico == 0) {
							arquero.recibirDano(jefe.ataqueCritico());
						}else {
							arquero.recibirDano(jefe.atacar());
						}
				
					System.out.println(arquero.mostrarEstado());
					
					if(arquero.getPuntosdeVida()>0 && !jefe.estaVivo()) {
						arquero.Hablar();
					}
					if(arquero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			if(Personaje == 2) {
				while (jefe.estaVivo() && guerrero.getPuntosdeVida()>0) {
					guerrero.atacar();
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						jefe.recibirDano(dano);
					
						int danoCritico = valorRandom.nextInt(10);
						if(danoCritico == 0) {
							guerrero.recibirDano(jefe.ataqueCritico());
						}else {
							guerrero.recibirDano(jefe.atacar());
						}
				
					System.out.println(guerrero.mostrarEstado());
					if(guerrero.getPuntosdeVida()>0 && !jefe.estaVivo()) {
						guerrero.Hablar();
					}
					if(guerrero.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			if(Personaje == 3) {
				while (jefe.estaVivo() && mago.getPuntosdeVida()>0) {
					mago.lanzarHechizo();
					int dano = (int) (valorRandom.nextInt(11)+10*(Nivel*0.10));
						jefe.recibirDano(dano);
					
						int danoCritico = valorRandom.nextInt(10);
						if(danoCritico == 0) {
							mago.recibirDano(jefe.ataqueCritico());
						}else {
							mago.recibirDano(jefe.atacar());
						}
				
					System.out.println(mago.mostrarEstado());
					if(mago.getPuntosdeVida()>0 && !jefe.estaVivo()) {
						mago.Hablar();
					}
					if(mago.getPuntosdeVida()<=0) {
						System.out.println("Game over");
					}
				}
			}
			
		}
	}
}
