package total.MavenTest;

import junit.framework.TestCase;

public class CalculMetierTest extends TestCase {
	private CalculMetier metier;
	@Override
	protected void setUp() throws Exception {
		super.setUp();
		metier = new CalculMetier();
	}
   public void testSomme(){
	   assertTrue(metier.sommme(9, 10)==19);	   
   }
   public void testProduit(){
	   assertTrue(metier.produit(9, 10)==90);	   
   }
}
