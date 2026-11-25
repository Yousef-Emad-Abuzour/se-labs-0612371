import static org.junit.Assert.*;

import org.junit.Test;

public class mystringTest {

	@Test
	public void test() {
		mystring S = new mystring();
		
		S.setString("?");
		assertEquals(" test case 1:" , "?", S.invert());  
		S.setString("a");
        assertEquals(" test case 2:" ,  "A", S.invert());
        S.setString("A");
        assertEquals(" test case 3:" ,  "a", S.invert());  
        S.setString("good");
	    assertEquals(" test case 4:" ,  "GOOD", S.invert());  
	    S.setString("BAD");
	    assertEquals(" test case 5:" ,  "bad", S.invert());
	    S.setString("GOod");
	    assertEquals(" test case 6:" ,  "goOD", S.invert()); 
	    S.setString("bad?");
	    assertEquals(" test case 7:" ,  "BAD?", S.invert());  
	    S.setString("GOOD?");
	    assertEquals(" test case 8:" ,  "good?", S.invert());
	    S.setString("vERy bad?");
	    assertEquals(" test case 9:" ,  "VerY BAD?", S.invert());
	    
	}

}
