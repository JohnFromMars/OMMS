package test;

import org.junit.Assert;
import org.junit.Test;

import services.VisitorService;

public class VisitorServiceTest {
	
	@Test
	public void testGetServiceNames() {

		Assert.assertEquals("[Visitor Function A, Visitor Function B, Visitor Function C]",
				new VisitorService().getServiceName().toString());

	}
}
