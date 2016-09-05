import static org.junit.Assert.*;

import org.junit.*;

public class FantasieBlumenTest {

	@Before
	public FantasieBlumen createBlumen(){
		FantasieBlumen blumen = new FantasieBlumen();
		return blumen;
	}
	
	@Test
	public void testFarbe(){
		for(int i = 0;i < createBlumen().getList().size(); i++){
			if(createBlumen().getList().get(i).farbe != "weiß" || createBlumen().getList().get(i).farbe != "rot" || createBlumen().getList().get(i).farbe != "gelb"){
				fail("Farbe ist falsch!");
			}
		}
	}
	@Test
	public void testHeimisch(){
		for(int i = 0;i < createBlumen().getList().size(); i++){
			if(createBlumen().getList().get(i).heimisch != false){
				fail("Blume kommt in Oesterreich vor!");
			}
		}
	}
	
	public static void main(String[] args) {
		

	}

}
