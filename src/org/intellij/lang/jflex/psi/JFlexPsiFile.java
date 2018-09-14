package org.intellij.lang.jflex.psi;

import org.jetbrains.annotations.Nullable;

/**
 * @author Max
 */
public interface JFlexPsiFile extends JFlexElement {

    @Nullable
    JFlexElement getClassname();

    @Nullable
    JFlexElement getReturnType();

    JFlexExpression[] getImplementedInterfaces();

    JFlexMacroDefinition[] getDeclaredMacroses();

    JFlexStateStatement[] getStateStatements();

    @Nullable
    JFlexJavaCode getImports();


}
