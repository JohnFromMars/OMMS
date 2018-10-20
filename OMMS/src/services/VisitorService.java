package services;

import java.util.ArrayList;
import java.util.List;

public class VisitorService {

	public List<String> getServiceName() {
		List<String> serviceNames = new ArrayList<>();
		serviceNames.add("Visitor Function A");
		serviceNames.add("Visitor Function B");
		serviceNames.add("Visitor Function C");
		return serviceNames;
	}

}
