package lagersystemTestPackage;

import static org.junit.Assert.fail;

import junit.framework.Assert;
import lagersystemPackage.*;




public class LagerTest {

	@org.junit.Test
public void test() {
		
		Lager x = new Lager();
		x.setName("Bücherregal1");
		
		Assert.assertEquals("Bücherregal1", x.getName());
	}
	
	@org.junit.Test
	public void LagerAnlegen() {
		
		Lager x = new Lager();
		x.setName("Bücherregal1");
		
		Assert.assertEquals("Bücherregal1", x.getName());
	}
}