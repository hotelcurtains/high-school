public class ProtocolDroid extends Droid  implements Robot {
  public ProtocolDroid(String name) {
    super(name,DroidType.PROTOCOL);
  }
  public void identifySelf() {
    System.out.println(getName()+", "+getTypeString()+" droid says: I am "+getName()+", human cyborg relations");
  }
  public void perform(String action) {
    System.out.println("I waddle around and "+action+" at your service.");
  }
}