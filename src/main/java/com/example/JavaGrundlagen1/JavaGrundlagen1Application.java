package com.example.JavaGrundlagen1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JavaGrundlagen1Application {

	public static void main(String[] args) {
		List<Integer> myList = new ArrayList<Integer>(Arrays.asList(1, 3, 6, 39, 265, 9534, 359));
		
		int sum = 0;
		
		for(Integer item: myList) {
			if(item % 2 == 0) 
				System.out.println(sum += item);
		}
	}
}
