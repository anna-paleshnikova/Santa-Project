package abstractfactory;

public class ColorFactory extends AbstractFactory {

	@Override
	public
	Color getColor(String colorName) {
		if(colorName.equals("BLUE")) {
			return new Blue();
		}
		
		if(colorName == "PINK") {
			return new Pink();
		}
		System.out.println("Unknown color");
		return null;
	}

	@Override
	public
	Type getType(String shapeName) {
		// Color factory... cannot return shape
		return null;
	}

}
