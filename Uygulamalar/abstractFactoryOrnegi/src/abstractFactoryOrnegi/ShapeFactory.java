package abstractFactoryOrnegi;

public class ShapeFactory extends AbstractFactory{
	  @Override
	   Color getColor(String color) {
	     return null;
	   }
	  @Override
	  Shape getShape(String shape ) {
	    if(shape.equalsIgnoreCase("daire")) {
	     return new Circle();
	    }
	    else if (shape.equalsIgnoreCase("kare")){
	     return new Square();
	    }
	    else if (shape.equalsIgnoreCase("dikdortgen")) {
	     return new Rectangle();
	    }
	return null;
	    }
	}