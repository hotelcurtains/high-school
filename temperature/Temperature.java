public class Temperature {	
	private char scale;
	private float temp;
	
	public Temperature(float newTemp){
		temp = newTemp;
		scale = 'C';
	}
	public Temperature(char newScale){
		temp = 0;
		scale = newScale;
	}
	public Temperature(float newTemp,char newScale){
		temp = newTemp;
		scale = newScale;
	}
	public Temperature(){
		temp = 0;
		scale = 'C';
	}

	public float getCelcius(){
		if (scale == 'C'){
			return temp;
		}
		else {
			return ((temp-32)*5/9);
		}
	}
	public float getFahrenheit(){
		if (scale == 'F'){
			return temp;
		}
		else {
			return ((temp*9/5)+32);
		}
	}

	public void setTemp(float newTemp){
		temp = newTemp;
	}
	public void setScale(char newScale){
		scale = newScale;
	}
	public void setTemp(float newTemp, char newScale){
		temp = newTemp;
		scale = newScale;
	}

	public boolean equals(Temperature otherTemp){
		if (this.getCelcius() == otherTemp.getCelcius() || this. getFahrenheit() == otherTemp.getFahrenheit()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean greaterThan(Temperature otherTemp){
		if (this.getCelcius() > otherTemp.getCelcius() || this.getFahrenheit() > otherTemp.getFahrenheit()){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean lessThan(Temperature otherTemp){
		if (this.getCelcius() < otherTemp.getCelcius() || this.getFahrenheit() < otherTemp.getFahrenheit()){
			return true;
		}
		else{
			return false;
		}
	}
	
}