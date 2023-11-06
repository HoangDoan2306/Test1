package test;

import java.util.ArrayList;
import java.util.List;

public class Test {

  public static void main(String[] args) {
   String a = "";
   System.out.println(a.isEmpty());
   List integers = new ArrayList<>();
   integers.add("a");
  }
  public static String changeName(String name) {
    return name+"New";
  }
  
  public static String changeNameObj(Child c) {
    return c.name+"New";
  }
  
  
}