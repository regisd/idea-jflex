package org.intellij.lang.jflex.psi;

import com.intellij.psi.PsiLanguageInjectionHost;

/**
 * @author Max
 */
public interface JFlexJavaCode extends JFlexElement, PsiLanguageInjectionHost {

    public boolean isMatchAction();

}
