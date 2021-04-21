package datastructures;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AOArrayListTest {

    private AOArrayList listWithZeroElements;
    private AOArrayList listWithFourElements;
    private AOArrayList listWithFiveElements;

    @Before
    public void before(){

        listWithZeroElements = new AOArrayList();

        listWithFourElements = new AOArrayList();
        char c = 'A';
        for (int i = 0; i < 4; i++) {
            String value = String.valueOf(c);
            listWithFourElements.add(value);
            c++;
        }

        listWithFiveElements = new AOArrayList();
        c = 'A';
        for (int i = 0; i < 5; i++) {
//            String value = String.valueOf(c);
            listWithFiveElements.add(c);
            c++;
        }
    }

    @Test
    public void testAddWithNoExtension(){
        char element = 'A';
        String value = String.valueOf(element);
        listWithZeroElements.add(value);
        assertEquals(1, listWithZeroElements.size());
        assertEquals("A", listWithZeroElements.get(0));
    }

    @Test
    public void testAddWithExtension(){
        listWithFiveElements.setSize(5);
        char element = 'G';
        String value = String.valueOf(element);
        listWithFiveElements.add(value);
        assertEquals(6, listWithFiveElements.size());
        assertEquals(10, listWithFiveElements.getLength());
        assertEquals("G", listWithFiveElements.get(5));
    }

    @Test
    public void testAddByIndex(){
        listWithFourElements.setSize(4);
        char element = 'H';
        String value = String.valueOf(element);
        listWithFourElements.add(value, 2);
        assertEquals("H", listWithFourElements.get(2));
        assertEquals("C", listWithFourElements.get(3));
        assertEquals("D", listWithFourElements.get(4));
    }

    @Test
    public void testRemove(){
        listWithFiveElements.setSize(5);
        Object removed = listWithFiveElements.remove(1);
        assertEquals(4, listWithFiveElements.size());
        assertEquals("B", removed);
        assertEquals("A", listWithFiveElements.get(0));
        assertEquals("C", listWithFiveElements.get(1));
        assertEquals("D", listWithFiveElements.get(2));
        assertEquals("E", listWithFiveElements.get(3));
    }

    @Test
    public void testGet(){
        listWithFiveElements.setSize(5);
        char c ='A';
        for(int i=0; i<5; i++){
            String value = String.valueOf(c);
            assertEquals(value, listWithFiveElements.get(i));
            c++;
        }
    }

    @Test
    public void testSet(){
        listWithFourElements.setSize(4);
        Object setter = listWithFourElements.set('K', 2);
        assertEquals(4, listWithFourElements.size());
        assertEquals("K", setter);
        assertEquals("D", listWithFourElements.get(3));
    }

    @Test
    public void testClear(){
        listWithFiveElements.clear();
        assertTrue(listWithFiveElements.isEmpty());
        assertEquals(0, listWithFiveElements.size());
    }

    @Test
    public void testSize(){
        listWithFiveElements.setSize(5);
        assertEquals(5, listWithFiveElements.size());
    }

    @Test
    public void testIsEmpty(){
        assertTrue(listWithZeroElements.isEmpty());
    }

    @Test
    public void testContains(){
        listWithFiveElements.setSize(5);
        assertTrue(listWithFiveElements.contains("B"));
    }

    @Test
    public void testIndexOf(){
        listWithFiveElements.setSize(5);
        assertEquals(0, listWithFiveElements.indexOf('A'));
    }

    @Test
    public void testLastIndexOf(){
        //listWithFiveElements.setSize(5);
        assertEquals(2, listWithFiveElements.lastIndexOf("C"));
    }

    @Test
    public void testShowString(){
        assertEquals("[A, B, C, D, E]", listWithFiveElements.showString());
    }
}
