package home_work;

public class Animal {

	private String typeOfAnimal;
	private String nameOfAnimal;

	public Animal() {

	}

	public Animal(String typeOfAnimal, String nameOfAnimal) {
		super();
		this.typeOfAnimal = typeOfAnimal;
		this.nameOfAnimal = nameOfAnimal;
	}

	public String getTypeOfAnimal() {
		return typeOfAnimal;
	}

	public void setTypeOfAnimal(String typeOfAnimal) {
		this.typeOfAnimal = typeOfAnimal;
	}

	public String getNameOfAnimal() {
		return nameOfAnimal;
	}

	public void setNameOfAnimal(String nameOfAnimal) {
		this.nameOfAnimal = nameOfAnimal;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfAnimal == null) ? 0 : nameOfAnimal.hashCode());
		result = prime * result + ((typeOfAnimal == null) ? 0 : typeOfAnimal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Animal other = (Animal) obj;
		if (nameOfAnimal == null) {
			if (other.nameOfAnimal != null)
				return false;
		} else if (!nameOfAnimal.equals(other.nameOfAnimal))
			return false;
		if (typeOfAnimal == null) {
			if (other.typeOfAnimal != null)
				return false;
		} else if (!typeOfAnimal.equals(other.typeOfAnimal))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Animal [typeOfAnimal=" + typeOfAnimal + ", nameOfAnimal=" + nameOfAnimal + "]";
	}
}
