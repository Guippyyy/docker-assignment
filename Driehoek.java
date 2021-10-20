package Domein;

public class Driehoek {

	//attributen
	private int a; int b ; int c;
	
	//constructor
	public Driehoek(int a, int b, int c) {
		setA(a);
		setB(b);
		setC(c);
	}
	
	
	//getters - <<Property>>
	public int getA() {
		return a;
	}
	
	public int getB() {
		return b;
	}
	
	public int getC() {
		return c;
	}
	
	//setters
	private void setA(int a) {
		this.a = a = a > 0 ? a : 1;
	}
	private void setB(int b) {
		this.b = b = b > 0 ? b : 1;
	}
	private void setC(int c) {
		this.c = c = c > 0 ? c : 1;
	}
	
	
	public boolean isRechthoekig() {
		return c*c == a*a + b*b || a*a == b*b + c*c || b*b == a*a + c*c;
	}
}
