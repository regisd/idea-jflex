package org.intellij.lang.jflex.psi.impl;

import com.intellij.lang.ASTNode;
import org.intellij.lang.jflex.psi.JFlexSection;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexSectionImpl extends JFlexElementImpl implements JFlexSection {

    public JFlexSectionImpl(@NotNull ASTNode node) {
        super(node);
    }

}
