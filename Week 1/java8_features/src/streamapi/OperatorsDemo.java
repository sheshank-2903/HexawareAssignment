package streamapi;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class OperatorsDemo {
	public static void main(String[] args) {
		
List<Integer>list=new ArrayList<>();
		
		list.add(30); //new Integer(30);
		list.add(10);
		list.add(15);
		list.add(15);
		list.add(100);
		list.add(9);
		
		Stream<Integer>stream=list.stream();
		
		//stream.limit(3).forEach(System.out::println);
		
		//stream.skip(3).forEach(System.out::println);
		
		//stream.distinct().forEach(System.out::println);
		
		Integer result=stream.reduce((a,b)->{return a+b;}).orElse(0);
		System.out.println(result);
		
		
		
	}

}
