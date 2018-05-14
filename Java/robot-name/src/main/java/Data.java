package src.main.java;

import java.util.ArrayList;

public class Data {

	static ArrayList<String> robotNames = new ArrayList<String>();

	static public void addRobotName(String name){
		robotNames.add(name);
	}

	static public ArrayList<String> getRobotNames(){
		return robotNames;
	}

	static public void removeRobotName(String robotName){
		if(robotNames.contains(robotName)){
			robotNames.remove(robotName);
		}
	}
}
