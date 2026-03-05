import java.util.*;
import java.util.stream.*;
public class CountFrequencyOfEachCharacters{
	
	public static void CountFreq(String s){
		Map<Character,Long> map=s.chars().mapToObj(c->(char)c).filter(c -> c != ' ').collect(Collectors.groupingBy(c->c,Collectors.counting()));
		System.out.println(map);
	}

	public static void main(String args[]){
		
		CountFreq("  Kunal   Ananda Sagar 1234 atpadi   ");
	}
}
