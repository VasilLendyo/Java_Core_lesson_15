package home_work;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class ZooClub {

	private Map<Person, List<Animal>> map = new HashMap<>();

	public void addClubMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name");
		String name = sc.next();
		System.out.println("Enter age");
		int age = sc.nextInt();

		map.put(new Person(name, age), new ArrayList<>());

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry);
		}
	}

	public void addAnimalToClubMember() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of member");
		String pers = sc.next();

		System.out.println("Enter type of animal");
		String type = sc.next();

		System.out.println("Enter name of animal");
		String name = sc.next();

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		Iterator<Entry<Person, List<Animal>>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equals(pers)) {
				next.getValue().add(new Animal(type, name));
			}
		}

		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry);
		}
	}

	public void removeAnimalFromClubMember() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of person");
		String personName = sc.next();

		System.out.println("Enter name of animal");
		String animalName = sc.next();

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(personName)) {
				Iterator<Animal> iterator2 = next.getValue().iterator();
				while (iterator2.hasNext()) {
					Animal next2 = iterator2.next();
					if (next2.getNameOfAnimal().equalsIgnoreCase(animalName)) {
						iterator2.remove();
					}
				}
			}
			for (Entry<Person, List<Animal>> entry : entrySet) {
				System.out.println(entry);
			}
		}
	}

	public void removeClubMember() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name of member");
		String personName = sc.next();

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		Iterator<Entry<Person, List<Animal>>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if (next.getKey().getName().equalsIgnoreCase(personName)) {
				iterator.remove();
			}
		}

		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry);
		}
	}

	public void removeTypeOfAnimal() {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter type of animal");
		String type = sc.next();

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		Iterator<Entry<Person, List<Animal>>> iterator = entrySet.iterator();

		while (iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			Iterator<Animal> iterator2 = next.getValue().iterator();
			while (iterator2.hasNext()) {
				if (iterator2.next().getTypeOfAnimal().equalsIgnoreCase(type)) {
					iterator2.remove();
				}
			}
		}

		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry);
		}
	}

	public void printAll() {

		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry);
		}
	}
}
