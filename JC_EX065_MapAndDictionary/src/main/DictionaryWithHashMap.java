package main;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DictionaryWithHashMap {
	Map <String, String> dataWord = new HashMap<String, String>();
	
	public String addWord (String key, String value) {
		return this.dataWord.put(key, value);
	}
	public String deleteAWord (String key) {
		return this.dataWord.remove(key);
	}
	public String findValueFromKey (String key) {
		return this.dataWord.get(key);
	}
	public void printAllKey () {
		Set <String> setDictionary = this.dataWord.keySet(); 
		System.out.println("All elements in dictionary is " + Arrays.toString(setDictionary.toArray()));
	}
	public int getNumberWord () {
		return this.dataWord.size();
	}
	public void deleteAllWord () {
		this.dataWord.clear();
	}
}
