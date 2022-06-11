package abstractfactory;

public class TypeFactory extends AbstractFactory {

	@Override
	public
	Color getColor(String colorName) {
		// Shape factory... cannot return color
		return null;
	}

	@Override
	public
	Type getType(String typeName) {
		if(typeName.equals("DOLL")) {
			return new Doll();
		}
		
		if(typeName.equals("BIKE")) {
			return new Bike();
		}
		System.out.println("Unknown type");
		return null;
	}

}
