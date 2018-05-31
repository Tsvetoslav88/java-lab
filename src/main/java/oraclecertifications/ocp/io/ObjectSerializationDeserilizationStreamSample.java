package oraclecertifications.ocp.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;


public class ObjectSerializationDeserilizationStreamSample {
	
	public static List<Animal> getAnimals(File dataFile) throws IOException, ClassNotFoundException{
		List<Animal> animals = new ArrayList<>();
		try(ObjectInputStream in = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream(dataFile)))){
			while(true) {
				Object object = in.readObject();
				if(object instanceof Animal) {
					animals.add((Animal)object);
				}
			}
		}catch (EOFException e) {
			// File end reached
		}
		return animals;
	}
	
	public static void createAnimalsFile(List<Animal> animals, File dataFile) throws IOException{
		try(ObjectOutputStream out = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream(dataFile)))){
			for(Animal animal: animals) {
				out.writeObject(animal);
			}
		}
	}
	
	
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		//src\\main\\resources\\oraclecertifications\\ocp\\io\\
		List<Animal> animals = new ArrayList<>();
		animals.add(new Animal("Tommy Tiger",5,'T'));
		animals.add(new Animal("Tommy Tiger",5,'T'));
		
		File dataFile = new File("src\\main\\resources\\oraclecertifications\\ocp\\io\\animal.data");
		createAnimalsFile(animals,dataFile);
		System.out.println(getAnimals(dataFile));
		
	}
}
