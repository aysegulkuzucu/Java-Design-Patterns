package abstractFactoryOrnegi;

public class ColorFactory extends AbstractFactory {
	  @Override
	  Color getColor(String color) {
	   if(color.equalsIgnoreCase("kirmizi")) {
	   return new Red();
	  }
	  else if (color.equalsIgnoreCase("mavi")) {
	   return new Blue();
	  }
	  else if(color.equalsIgnoreCase("yesil")) {
	   return new Green();
	  }
	 return null;
	 }
	  @Override
	  Shape getShape(String shape) {
	  return null;
	 }
	}

