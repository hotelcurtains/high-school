// Interfaces Classes Exercise
// 0. FORK this code so you can edit it.
// 1. Look through the following .java files:
//    a. Robot.java - the Robot interface that contains the perform() method template
//    b. ProtocolDroid.java - now implements the Robot interface and has the 
//        perform() method definition
//    c. Main.java - now has a line that invokes the perform() method on 
//                the ProtocolDroid object Run the Main program
// 2. Run the Main program and observe the output
// 3. Add the line "implements Robot" to the R2Unit class in the R2Unit.java file
// 4. Run the program... Why do you get the error: 
//    R2Unit is not abstract and does not override abstract method perform(String) in Robot
// 5. Fix the error by implementing the perform() method with a different message.
// 6. Make sure the BattleDroid also implements the Robot interface
// 7. Add lines in main() that demonstrate calling the perform() method

class Main {
  public static void main(String[] args) {
    R2Unit r2d2=new R2Unit("R2-D2");
    ProtocolDroid c3po=new ProtocolDroid("C3PO");
    BattleDroid bd=new BattleDroid("Larry");
    r2d2.identifySelf();
    c3po.identifySelf();
    bd.identifySelf();

    r2d2.perform("01100010 01101001 01110100 00101110 01101100 01111001 00101111 00110011 01001100 00110101 00111000 01001110 01001100 01001111");
		c3po.perform("babble");
		bd.perform("[Star Wars refe]");
  }
}