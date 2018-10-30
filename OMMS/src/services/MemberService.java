package services;

import java.util.ArrayList;
import java.util.List;

public class MemberService {
	public List<String> getServiceName() {
		List<String> serviceNames = new ArrayList<>();
		serviceNames.add("Member Function B");
		serviceNames.add("Member Function C");
		return serviceNames;
	}

}
