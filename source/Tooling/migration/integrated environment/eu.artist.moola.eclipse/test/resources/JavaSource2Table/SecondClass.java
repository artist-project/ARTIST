package resources.JavaSource2Table;

public class SecondClass {
	
	public void sc_m1(){
		FirstClass a = new FirstClass();
		a.fc_m1();
	}
	
	public void sc_m2(){
		this.sc_m1();
	}
}