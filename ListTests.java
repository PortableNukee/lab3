import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.*;
public class ListTests {

    class StringCheckerConcreteClass implements StringChecker {
        List<String> compare;
        public StringCheckerConcreteClass(List<String> input){
          this.compare = input;
        }
        public boolean checkString(String s){
          for(String a: this.compare) { if(a.equals(s)){return true;} }
          return false;
        }
      }

    @Test
    public void testListFilter(){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("bye");
       StringChecker checker = new StringCheckerConcreteClass(list);
       List<String> list2 = new ArrayList<String>();
       list2.add("hello");
       list2.add("extra item!");
       list2.add("bye");
       assertEquals(list, ListExamples.filter(list2, checker));
    }

    @Test
    public void testListFilter2(){
        List<String> list = new ArrayList<String>();
        list.add("hello");
        list.add("another item!");
        list.add("bye");
       StringChecker checker = new StringCheckerConcreteClass(list);
       List<String> list2 = new ArrayList<String>();
       list2.add("hello");
       list2.add("extra item!");
       list2.add("bye");
       list.remove(1);
       assertEquals(list, ListExamples.filter(list2, checker));
    }


    @Test
    public void testMerge(){
        List<String> first = new ArrayList<String>();
        first.add("a");
        first.add("b");
        List<String> second = new ArrayList<String>();
        second.add("c");
        second.add("d");
        List<String> res = new ArrayList<String>();
        res.add("a");
        res.add("b");
        res.add("c");
        res.add("d");
        assertEquals(res, ListExamples.merge(first, second));
    }
}
