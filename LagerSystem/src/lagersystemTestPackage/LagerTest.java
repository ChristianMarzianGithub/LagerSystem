package lagersystemTestPackage;

import static org.junit.Assert.fail;

import junit.framework.Assert;
import lagersystemPackage.*;




public class LagerTest {

	@org.junit.Test
public void test() {
		
		Lager x = new Lager();
		x.setName("B�cherregal1");
		
		Assert.assertEquals("B�cherregal1", x.getName());
	}
	
	@org.junit.Test
	public void LagerAnlegen() {
		
		Lager x = new Lager();
		x.setName("B�cherregal1");
		
		Assert.assertEquals("B�cherregal1", x.getName());
	}
}