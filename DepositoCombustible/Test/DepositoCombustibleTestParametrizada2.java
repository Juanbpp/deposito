import static org.junit.Assert.*;
import java.util.*;
//import org.junit.*;

//import org.junit.jupiter.api.Test;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class DepositoCombustibleTestParametrizada2 {
	private double max;
	private double lev;
	private double llenar;
	private double res;

	public DepositoCombustibleTestParametrizada2(double m, double l,double ll,double r) {
		max =m;
		lev = l;
		llenar = ll;
		res = r;
	}
	
	@Parameters
	public static Collection<Object[]> numeros(){
		return Arrays.asList(new Object[][] {
			{2000,0,500,500},{2000,500,500,1000},{2000,1000,1000,2000}
		});
		
	}
	
	@Test
	public void testLlenar() {
		DepositoCombustible dep = new DepositoCombustible(max,lev);
		dep.fill(llenar);
		double resultado = dep.getDepositoNivel();
		assertEquals(res,resultado,0);
	}
	
	
	
	

}
