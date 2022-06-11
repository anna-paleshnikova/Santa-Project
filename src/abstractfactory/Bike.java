package abstractfactory;

public class Bike  implements Type {

	@Override
	public void make() {
		System.out.println("Making a toy-bike");
	}

}
