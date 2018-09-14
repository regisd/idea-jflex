package org.intellij.lang.jflex.psi.impl;

import com.intellij.lang.ASTNode;
import org.intellij.lang.jflex.JFlexElementTypes;
import org.intellij.lang.jflex.psi.JFlexExpression;
import org.intellij.lang.jflex.psi.JFlexOptionStatement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @author Max
 */
public abstract class JFlexOptionStatementBase extends JFlexElementImpl implements JFlexOptionStatement {

    public JFlexOptionStatementBase(@NotNull ASTNode node) {
        super(node);
    }

    @Nullable
    public JFlexExpression getValue() {
        final ASTNode node = getNode().findChildByType(JFlexElementTypes.EXPRESSIONS);
        return (JFlexExpression) (node != null ? node.getPsi() : null);
    }

}
