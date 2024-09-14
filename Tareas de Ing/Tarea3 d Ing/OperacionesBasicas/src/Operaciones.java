
public class Operaciones {
	public Operaciones() {
		
	}
	
	
	public Integer suma(Integer x, Integer y) {
		return x + y;
	}
	
	public String suma(Vector a,Vector b) {
		return (a.getX()+b.getX())+"i + "+(b.getY()+a.getY())+"j";
	}
	
	public Integer resta(Integer a, Integer b) {
		return a-b;
	}
	
	public String resta(Vector a, Vector b) {
		return (a.getX()-b.getX())+"i + "+(a.getY()-b.getY())+"j";
	}
	
	public Integer multiplicacion (Integer a, Integer b) {
		return a*b;
	}
	public String multiplicacion (Integer r,Vector a) {
		return r*a.getX()+"i + "  +r*a.getY()+"j";
	}
	
	public Double division (Integer a, Integer b) {
		return (double) (a/b);
	}
}
