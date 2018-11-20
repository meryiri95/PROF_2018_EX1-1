import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mirigaray
 */
public class ExamenTest {
    public String str1= new String("Hello World!");
    
    private MyString cString;
    
    @Before
    public void init(){
        cString= new MyString(str1);
    }
    /**
     * Test para testear que diferencia dos stings diferentes si tienen 
     * longitud diferente
     */
    @Test
    public void test1(){
        String str1 = new String("World!");
        assertEquals(0,cString.compareTo(str1));
    }
    /**
     * Test para testear que diferencia dos stings diferentes si tienen 
     * igual longitud
     */
    @Test
    public void test2(){
        String strN = new String("Pello World!");
        assertEquals(0,cString.compareTo(strN));
    }
    /**
     * Test para testear que compara correctamente dos strings iguales
     */
    @Test
    public void test3(){
        assertEquals(1,cString.compareTo(str1));
    }
}
