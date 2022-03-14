package ru.manu.webSpring;

import org.springframework.stereotype.Component;

@Component("classic")
public class Classical  implements Music{

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Playing  Classical music ";
	}
	
	public void doMyinit() {
		System.out.println("DOING initialization");
	}
	
	
	public void doDesc() {
		System.out.println("DOING destruct");
	}

}
