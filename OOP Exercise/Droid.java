public abstract class Droid {
  private String name;
  private DroidType type;
  
  public Droid(String myName, DroidType myType) {
    setName(myName);
    setType(myType);
  }
  public abstract void identifySelf();

  // Mutator Methods (setters): 
  public void setName( String myName ) {
    name=myName;
  }
  public void setType( DroidType myType ) { 
    type=myType;
  }

  // Accessor Mehtods (getters):
  public String getName() {
    return name;
  }
  public DroidType getType() {
    return type;
  }
  public String getTypeString() {
    switch(type) {
      case ASTROMECH:
        return "astromech";
      case PROTOCOL:
        return "protocol";
      case BATTLE:
        return "battle";
      default:
        return "unidentified";
    }
  }
}