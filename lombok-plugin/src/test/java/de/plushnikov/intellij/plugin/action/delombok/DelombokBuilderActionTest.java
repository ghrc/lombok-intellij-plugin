package de.plushnikov.intellij.plugin.action.delombok;

import com.intellij.openapi.actionSystem.AnAction;
import de.plushnikov.intellij.plugin.action.LombokLightActionTest;

public class DelombokBuilderActionTest extends LombokLightActionTest {

  protected AnAction getAction() {
    return new DelombokBuilderAction();
  }

  @Override
  protected String getBasePath() {
    return super.getBasePath() + "/action/delombok/builder";
  }

  public void testBuilderSimple() throws Exception {
    doTest();
  }

  public void testBuilderSimplePredefined() throws Exception {
    doTest();
  }

  public void testBuilderAtMethodSimple() throws Exception {
    doTest();
  }

  public void testBuilderAtMethodSimplePredefined() throws Exception {
    doTest();
  }

  public void testBuilderAtConstructorSimple() throws Exception {
    doTest();
  }

  public void testBuilderAtConstructorSimplePredefined() throws Exception {
    doTest();
  }

}
