package test;

import org.junit.Assert;
import org.junit.Test;

import services.AdminService;

public class AdminServiceTest {
	
	@Test
	public void testGetServiceNames() {

		Assert.assertEquals("[Admin Function A, Admin Function B, Admin Function C, Admin Function D]",
				new AdminService().getServiceName().toString());

	}
}
