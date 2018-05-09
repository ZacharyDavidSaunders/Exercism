package main.java;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public WordCount() {}

	public HashMap<String, Integer> phrase(String phrase){
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		Pattern regex = Pattern.compile("(\\w+'\\S)|((\\w+))"); //
		Matcher matcher = regex.matcher(phrase);
		while (matcher.find()){
			String key = matcher.group().toLowerCase();
			if(map.containsKey(key)){
				map.put(key, map.get(key) + 1);
			}else{
				map.put(key,1);
			}
		}
		return map;
	}
}
