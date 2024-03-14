import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;
import java.lang.Math;

class Main {
  public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in).useDelimiter("\n");
		int repeatAmount = keyboard.nextInt();
		
		for(int h = 0; h < repeatAmount ; h++){
			int entriesCount = keyboard.nextInt();

			String allEntries = "";
			for (int i = 0; i < entriesCount ; i++){
				allEntries += keyboard.next()+" ";
			}
			allEntries.replaceAll("\n"," ");
			allEntries.replaceAll("  "," ");
			
			TestCase testCase = new TestCase();
			testCase.fillWithIDs();

			while(allEntries.indexOf(" ")!=-1){
				int time = Integer.valueOf(allEntries.substring(0,allEntries.indexOf(" "))); 
				allEntries=allEntries.substring(allEntries.indexOf(" ")+1);
				
				String teamID = allEntries.substring(0,allEntries.indexOf(" "));
				allEntries=allEntries.substring(allEntries.indexOf(" ")+1);
				
				char problemID = Character.toUpperCase(allEntries.charAt(0));
				allEntries=allEntries.substring(allEntries.indexOf(" ")+1);
				
				char outcome = Character.toUpperCase(allEntries.charAt(0));
				allEntries=allEntries.substring(allEntries.indexOf(" ")+1);
				
				Entry parsedEntry = new Entry(time, teamID, problemID, outcome);

				testCase.addEntry(parsedEntry.problemID, parsedEntry);
			}
			
			testCase = testCase.withoutDuplicates();
			
			String outputs[] = new String[testCase.allIDs.length];
			for (char i : testCase.allIDs){
				outputs[alphanumSwitch(i)] = Character.toUpperCase(i)+" "+testCase.numberOfAccepted(i);
				if(testCase.numberOfAccepted(i) != 0){
					outputs[alphanumSwitch(i)] += " "+testCase.averageEntries(i)+" "+testCase.averageTime(i);
				}
			}

			for(int i=0 ; i<outputs.length ; i++){
				System.out.println(outputs[i]);
			}
			
		}
  	
	}
	public static int alphanumSwitch(char letter){ 
		letter = Character.toUpperCase(letter);
		int letterIndex = ((int)letter>=65 && (int)letter<=90) ? letter-65 : -1;
		return letterIndex;
	}
	public static char alphanumSwitch(int number){ 
		char indexLetter = (number>=0 && number<=25) ? (char)(number+65) : ' ';
		return indexLetter;
	}
}

class Entry{
	public int time;
	public String teamID;
	public char problemID;
	public char outcome;
	public Entry(int timeInput, String teamInput, char problemInput, char outcomeInput){
		time = timeInput;
		teamID = teamInput;
		problemID = Character.toUpperCase(problemInput);
		outcome = Character.toUpperCase(outcomeInput);
	}
	/*public String toString(){
		return (""+time+" "+teamID+" "+problemID+" "+outcome);
	}*/
}

class TestCase{
	public HashMap<Character, ArrayList<Entry>> thisCase = new HashMap<Character, ArrayList<Entry>>();
	public char[] allIDs = {'A','B','C','D','E','F','G','H','I'};
	public void addEntry(char problemID, Entry entry){
		problemID=(Character)problemID;
		if(thisCase.get(problemID) == null){
			ArrayList<Entry> temp = new ArrayList<Entry>();
			temp.add(entry);
			thisCase.put(problemID, temp);
		}
		else{
			thisCase.get(problemID).add(entry);
		}
	}
	/*public void removeEntry(char problemID, int index){
		problemID=(Character)problemID;
		thisCase.get(problemID).remove(index);
	}*/
	public void fillWithIDs(){
		for (char i : allIDs){
			i = (Character)Character.toUpperCase(i);
			thisCase.put(i, new ArrayList<Entry>(0));
		}
	}
	/*public String toString(){
		String returnMe = "";
		for (Character problem : thisCase.keySet()) {
			returnMe+=problem+": "+thisCase.get(problem).toString()+"\n";
 		}
		return returnMe;
	}*/
	public TestCase withoutDuplicates(){
		TestCase returnMe = new TestCase();
		returnMe.fillWithIDs();
		for(int j = 0; j<thisCase.values().size(); j++){
			HashSet<String> acceptedTeams = new HashSet<>();
			Character problem = (Character)Main.alphanumSwitch(j);
			for (Entry i : thisCase.get(problem)){
				if (!acceptedTeams.contains(i.teamID) && i.outcome == 'A'){
					returnMe.thisCase.get(problem).add(i);
					acceptedTeams.add(i.teamID);
				}
				else if(!acceptedTeams.contains(i.teamID)){
					returnMe.thisCase.get(problem).add(i);
				}
			}
		}
		return returnMe;
	}
	public int numberOfAccepted(char problem){
		problem = (Character)problem;
		int returnMe = 0;
		for (Entry i : thisCase.get(problem)){
			if(i.outcome == 'A'){
				returnMe++;
			}
		}
		return returnMe;
	}
	public double averageEntries(char problem){
		problem = (Character)problem;
		double totalEntries = 0.0;
		double totalTeams = 0.0;
		HashSet<String> acceptedTeams = new HashSet<String>();
		for (Entry i : thisCase.get(problem)){
			if (!acceptedTeams.contains(i.teamID) && i.outcome == 'A'){
				acceptedTeams.add(i.teamID);
				totalTeams = totalTeams+1.0;
			}
		}
		for (Entry i : thisCase.get(problem)){
			if (acceptedTeams.contains(i.teamID)){
				totalEntries = totalEntries+1.0;
			}
		}
		double returnMe = Math.round(totalEntries/totalTeams*100.0)/100.0;
		return returnMe;
	}
	public double averageTime(char problem){
		problem = (Character)problem;
		double totalTime = 0.0;
		double totalTeams = 0.0;
		HashSet<String> acceptedTeams = new HashSet<String>();
		for (Entry i : thisCase.get(problem)){
			if (!acceptedTeams.contains(i.teamID) && i.outcome == 'A'){
				acceptedTeams.add(i.teamID);
				totalTeams = totalTeams+1.0;
			}
		}
		for (Entry i : thisCase.get(problem)){
			if (acceptedTeams.contains(i.teamID) && i.outcome == 'A'){
				totalTime = totalTime+(double)i.time;
			}
		}
		double returnMe = Math.round(totalTime/totalTeams*100.0)/100.0;
		return returnMe;
	}
}