import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//import static org.junit.Assert.*;
//import org.junit.*;

import java.util.ArrayList;
import java.util.List;

class ListExamplesTest {
    @Test
    public void testFilter1(){
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("hello");
        list.add("goodbye");

        List<String> filterList = new ArrayList<>();
        filterList.add("hello");
        filterList.add("goodbye");
        assertEquals(filterList, ListExamples.filter(list, new CustomerStringChecker()));
    }
    @Test
    public void testMerge1(){
        List<String> list1 = new ArrayList<>();
        list1.add("a");

        List<String> list2 = new ArrayList<>();
        list2.add("b");
        list2.add("c");
        list2.add("d");
        list2.add("e");

        List<String> output = new ArrayList<>();
        output.add("a");
        output.add("b");
        output.add("c");
        output.add("d");
        output.add("e");

        assertEquals(output, ListExamples.merge(list1, list2));
    }
}