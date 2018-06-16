package lagersystemTestPackage;

import static org.junit.Assert.fail;

import junit.framework.Assert;
import lagersystemPackage.*;




public class Test {

	@org.junit.Test
	public void test() {
		
		Lager x = new Lager();
		x.setName("Bücherregal1");
		
		Assert.assertEquals("Bücherregal1", x.getName());
	}
}