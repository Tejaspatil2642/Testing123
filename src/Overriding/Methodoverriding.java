package Overriding;

class RBI{
	double rateofinterest() {
		return 0;
		
	}
}

class SBI extends RBI{
	double rateofinterest() {
		return 8.5;
	}
}

class ICICI extends RBI{
	double rateofinterest() {
		return 9.5;
		}
}

class AXIS extends RBI{
	double rateofinterest() {
		return 10.5;
	}
}

public class Methodoverriding {

	public static void main(String[] args) {
		AXIS axis =new AXIS();
	System.out.println(	"axis bank rate of interest is :-"+axis.rateofinterest());
	
	ICICI icici=new ICICI();
	System.out.println("icici bank rate of interest is:-"+icici.rateofinterest());
	
	SBI sbi = new SBI();
	System.out.println("sbi bank rate of interest is:-"+sbi.rateofinterest());
	
	
	RBI rbi = new AXIS();
	System.out.println(rbi.rateofinterest());
	
	RBI rbi1 = new SBI();
	System.out.println(rbi1.rateofinterest());
	
	RBI rbi2 = new ICICI();
	System.out.println(rbi2.rateofinterest());
	
	
	
	
	
	
	
	

	}

}
