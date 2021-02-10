package abstractFactoryOrnegi;

public class FactoryProducer {
	  public static AbstractFactory getFactory(String choice) {
	   if(choice.equalsIgnoreCase("renk")) {
	   return new ColorFactory();
	   }
	   else if(choice.equalsIgnoreCase("sekil")) {
	    return new ShapeFactory();
	   }
	 return null;
	 }
	}

