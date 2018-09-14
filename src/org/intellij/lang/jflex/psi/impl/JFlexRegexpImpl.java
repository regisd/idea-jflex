package org.intellij.lang.jflex.psi.impl;

import com.intellij.lang.ASTNode;
import org.intellij.lang.jflex.psi.JFlexRegexp;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexRegexpImpl extends JFlexElementImpl implements JFlexRegexp {

    public JFlexRegexpImpl(@NotNull ASTNode node) {
        super(node);
    }

}
