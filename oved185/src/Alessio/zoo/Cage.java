package Alessio.zoo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;
import java.util.Set;

public class Cage<T extends Animal> {
	static int lastId = 0;                   //contatore id
	
	private Set<T> guests;
	
	private int id;                           //id vero e proprio
	private int max;
	
	public Cage(int max) {
		guests = new HashSet<>();
		lastId += 1;
		id = lastId;
		this.max = max;
	}
	
	public static int getLastId() {
		return lastId;
	}
	
	public int getId() {
		return id;
		
	}
	
	public boolean add(T animal) {
		//TODO: 
		if(max == guests.size()) {
			return false;
		}else {
		guests.add(animal);
		return true;
	}
	}
	
	public Optional<T> remove(String name) {
		//todo: direct acces to guest
		Iterator<T> it = guests.iterator();
		while(it.hasNext()) {
			T animal = it.next();
				if(animal.getName().equals(name)) {
					guests.remove(animal);
					return Optional.of(animal);
					
				}
			}
			
			return Optional.empty();
		}
	//TODO: check animal in cage?
	// boolean isPresent(String name);
	
	@Override
	public String toString() {
		return "{Cage " + id + ": " + guests + "}";
	}
	
	}


