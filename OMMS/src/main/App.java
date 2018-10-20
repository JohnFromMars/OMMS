package main;

import services.AdminService;
import services.MemberService;
import services.VisitorService;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello to OMMS main function");
		
		System.out.println("Visitor functions :" + new VisitorService().getServiceName());
		System.out.println("Member functions :" + new MemberService().getServiceName());
		System.out.println("Admin functions :" + new AdminService().getServiceName());

	}

}
