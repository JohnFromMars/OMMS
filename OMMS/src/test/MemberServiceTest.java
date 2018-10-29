package test;

import org.junit.Assert;
import org.junit.Test;

import services.MemberService;

public class MemberServiceTest {

	@Test
	public void testGetServiceNames() {

		Assert.assertEquals("[Member Function B, Member Function C]",
				new MemberService().getServiceName().toString());

	}

}
