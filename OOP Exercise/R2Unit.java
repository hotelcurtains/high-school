public class R2Unit extends Droid implements Robot {
  public R2Unit(String name) {
    super(name,DroidType.ASTROMECH);
  }
  public void identifySelf() {
    System.out.println(getName()+", "+getTypeString()+" droid says: BEEBOOBOPBOOBOP");
  }
	public void perform(String action){
		System.out.println(action);
	}
}