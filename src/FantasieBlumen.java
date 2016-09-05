import java.util.ArrayList;

public class FantasieBlumen{

	public ArrayList<Blume> fantasieBlumen = new ArrayList<Blume>();
	
	public FantasieBlumen(){
		Blume b1 = new Blume("Fantasie1","rot",false,2);
		Blume b2 = new Blume("Fantasie2","gelb",false,4);
		Blume b3 = new Blume("Fantasie3","weiﬂ",false,8);
		Blume b4 = new Blume("Fantasie4","rot",false,2);
		Blume b5 = new Blume("Fantasie5","gelb",false,4);
		Blume b6 = new Blume("Fantasie6","weiﬂ",false,8);
		Blume b7 = new Blume("Fantasie7","rot",false,2);
		Blume b8 = new Blume("Fantasie8","gelb",false,4);
		Blume b9 = new Blume("Fantasie9","weiﬂ",false,8);
		Blume b10 = new Blume("Fantasie10","rot",false,2);
		
		fantasieBlumen.add(b1);
		fantasieBlumen.add(b2);
		fantasieBlumen.add(b3);
		fantasieBlumen.add(b4);
		fantasieBlumen.add(b5);
		fantasieBlumen.add(b6);
		fantasieBlumen.add(b7);
		fantasieBlumen.add(b8);
		fantasieBlumen.add(b9);
		fantasieBlumen.add(b10);
	}
	public void print(){
		for(int i = 0; i < fantasieBlumen.size(); i++){
			System.out.println(fantasieBlumen.get(1).toString());
		}
	}
	
	public ArrayList<Blume> getList(){
		return fantasieBlumen;
	}
	
	public static void main(String[] args) {
		

	}

}
