package services;

import java.util.ArrayList;
import java.util.List;

public class AdminService {
	public List<String> getServiceName() {
		List<String> serviceNames = new ArrayList<>();
		serviceNames.add("Admin Function A");
		serviceNames.add("Admin Function B");
		serviceNames.add("Admin Function C");
		return serviceNames;
	}
}
