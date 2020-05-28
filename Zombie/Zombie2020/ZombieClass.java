package Zombie2020;

import java.util.ArrayList;
import java.util.HashMap;

public class ZombieClass implements Zombie {
	@Override
	public void addNewType(String type, String weekness) {
		types.put(type, weekness);
	}

	@Override
	public String getWeekness(String type) {

		return types.get(type);

	}

}
			

		

