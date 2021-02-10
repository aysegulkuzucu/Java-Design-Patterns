public class OctalObserver extends Observer{

   public OctalObserver(Subject subject){
      this.subject = subject;
      this.subject.attach(this);
   }

   @Override
   public void update() {
     System.out.println( "Sekizlik String: " + Integer.toOctalString( subject.getState() ) ); 
   }
}