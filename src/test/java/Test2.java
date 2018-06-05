import aop.Loggable;
import org.junit.Test;

public class Test2 {
	@Test
	public void test(){
		Temp test = new Temp();
		test.temp();
	}
}

class Temp{
	@Loggable
	public void temp(){
		System.out.println("!@#");
	}
}
