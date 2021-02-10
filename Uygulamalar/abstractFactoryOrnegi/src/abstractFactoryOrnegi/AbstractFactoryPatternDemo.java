package abstractFactoryOrnegi;

public class AbstractFactoryPatternDemo {
	 public static void main(String[] args) {
	 AbstractFactory shapeFactory = FactoryProducer.getFactory("sekil");
	 Shape shape = shapeFactory.getShape("kare");
	 shape.draw();
	 AbstractFactory colorFactory = FactoryProducer.getFactory("renk");
	 Color color = colorFactory.getColor("kirmizi");
	 color.fill();
	 }
	}