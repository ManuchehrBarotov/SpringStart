package ru.manu.webSpring;

import org.springframework.stereotype.Component;

@Component("rock")
public class RockMusic  implements Music{

	@Override
	public String getSong() {
		// TODO Auto-generated method stub
		return "Playing Rock Music ";
	}

}
