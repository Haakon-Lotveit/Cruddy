package cruddy.state.classes;

import static org.junit.Assert.assertEquals;

import org.testng.annotations.Test;

import cruddy.model.classes.fragments.CodeLine;

public class CodeLineTest {

  @Test
  public void format() {
    String whitespace = "____";
    CodeLine cl = new CodeLine(2, "if(foo == bar) {");
    
    String expected = "________if(foo == bar) {";
    
    assertEquals(expected, cl.format(whitespace));
  }
}
