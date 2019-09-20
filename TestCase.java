import static org.junit.Assert.*;

import org.junit.Test;

public class TestCase {
	
	static Rules rules = new Rules(50, 30, 20, 15);
	
	

	@Test
	public void teste_totals() {
		
		assertEquals(0, price(""));
		assertEquals(50, price("A"));
		assertEquals(80, price("AB"));
		assertEquals(115, price("CDBA"));

		assertEquals(100, price("AA"));
		assertEquals(130, price("AAA"));
		assertEquals(180, price("AAAA"));
		assertEquals(230, price("AAAAA"));
		assertEquals(260, price("AAAAAA"));

		assertEquals(160, price("AAAB"));
		assertEquals(175, price("AAABB"));
		assertEquals(190, price("AAABBD"));
		assertEquals(190, price("DABABA"));
	}
	
//	@Test test_incremental
//	public void test_incremental() {
//		
//		co = CheckOut.new(rules);
//	    assert_equal(  "0", co.total);
//		co.scan("A");  assert_equal("50", co.getTotal());
//		co.scan("B");  assert_equal("80", co.getTotal());
//		co.scan("A");  assert_equal("130", co.getTotal());
//		co.scan("A");  assert_equal("160", co.getTotal());
//		co.scan("B");  assert_equal("175", co.getTotal());
//		
//	}


	private static int price(String... itens) {

		Checkout co = new Checkout(rules);

		for (int i = 0; i < itens.length; i++) {
			co.scan(itens[i]);
		}

		return co.getTotal();

	}
}
