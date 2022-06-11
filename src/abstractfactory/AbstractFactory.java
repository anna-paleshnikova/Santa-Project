package abstractfactory;

public abstract class AbstractFactory {
	public abstract Color getColor(String colorName);
	public abstract Type getType(String typeName);
}
