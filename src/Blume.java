
public class Blume {

	public String name;
	public String farbe;
	public boolean heimisch;
	public int bluetenblaetter;
	
	public Blume(String name,String farbe, boolean heimisch, int bluetenblaetter){
		this.name = name;
		this.farbe = farbe;
		this.heimisch = heimisch;
		this.bluetenblaetter = bluetenblaetter;
	}
	
	public String toString(){
		String heimischString = "";
		if(heimisch = true){
			heimischString = "heimisch";
		}else{
			heimischString = "nicht heimisch";
		}
		String s = "Name: " + name + ", Farbe: " + farbe + ", Heimisch: " + heimischString + ", Bluetenblaetter: " + bluetenblaetter;
		
		System.out.println(s);
	
		return s;
	}
	
	public static void main(String[] args) {
		
	}

}
