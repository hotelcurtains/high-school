public class BattleDroid extends Droid implements Robot {
  public BattleDroid(String name) {
    super(name,DroidType.BATTLE);
  }
  public void identifySelf() {
    System.out.println(getName()+", "+getTypeString()+" droid says: I am "+getName()+", and I am here to kill rebel scum.");
  }
	public void perform(String action){
		System.out.println("I run around and "+action+" at your service.");
	}
}