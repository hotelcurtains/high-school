class Mainj {
  public static void main(String[] args) {
		//testing freezing points
		Temperature freezeC = new Temperature(0);
		Temperature freezeF = new Temperature(32,'F');
    if (freezeC.greaterThan(freezeF)){		//to prove greaterThan() can output false
			System.out.println(freezeC.getCelcius()+" deg. C > "+freezeF.getFahrenheit()+" deg. F\n");
		}
		else if (freezeC.lessThan(freezeF)){	//to prove lessThan() can output false
			System.out.println(freezeC.getCelcius()+" deg. C < "+freezeF.getFahrenheit()+" deg. F\n");
		}
		else if (freezeC.equals(freezeF)){ 
			System.out.println(freezeC.getCelcius()+" deg. C = "+freezeF.getFahrenheit()+" deg. F\n");
		}

		//testing equivalent temps
		Temperature foo = new Temperature(-40,'C');
		Temperature bar = new Temperature(-40,'F');
	if (foo.equals(bar)){
			System.out.println(foo.getCelcius()+" deg. C = "+bar.getFahrenheit()+" deg. F\n");
		}

		//testing boiling points
		Temperature ros = new Temperature(100);
		Temperature guil = new Temperature(212,'F');
	if (ros.equals(guil)){
			System.out.println(ros.getCelcius()+" deg. C = "+guil.getFahrenheit()+" deg. F\n");
		}

		if (ros.greaterThan(foo)){ 	//true, will output
			System.out.println(ros.getCelcius()+" deg. C > "+foo.getFahrenheit()+" deg. F\n");
		}
		
		if (bar.lessThan(freezeC)){	//true, will output
			System.out.println(bar.getCelcius()+" deg. C < "+freezeC.getFahrenheit()+" deg. F\n");
		}
		
		if (bar.equals(freezeF)){		//false, will not output
			System.out.println(bar.getCelcius()+" deg. C = "+freezeF.getFahrenheit()+" deg. F\n");
		}
		else{										//true, will output
			System.out.println(bar.getCelcius()+" deg. C != "+freezeF.getFahrenheit()+" deg. F\n");
		}
  }
}