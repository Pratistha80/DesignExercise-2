package Zombie2020;

import java.util.ArrayList;
import java.util.HashMap;

public interface Zombie {

	HashMap<String, String> types = new HashMap<>();

	void addNewType(String type, String weekness);

	String getWeekness(String type);

}





