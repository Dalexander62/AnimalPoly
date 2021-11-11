package com.qa.poly;


public class Runner{

	public static void main(String[] args) {
	

		
		Lion lion = new Lion();
		
		lion.foodType();
		lion.habitat();
		lion.king();
		lion.makeNoise();
		
		
		System.out.println("-------------------------------------");
	
		
		Animal animalLion = new Lion();
		
		animalLion.foodType();
		animalLion.makeNoise();
		((Lion) animalLion).habitat();
		
		
		System.out.println("-------------------------------------");
		
		
		Object objectLion = new Lion();
		
		((Lion) objectLion).king();
		((Lion) objectLion).habitat();
		
		
		System.out.println("-------------------------------------");
		
		
		Object objectAnimal = new Animal();
		
		((Animal) objectAnimal).foodType();
		((Animal) objectAnimal).makeNoise();
		
		
		
		
		
		
		

	}

}

	
