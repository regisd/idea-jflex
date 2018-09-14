package org.intellij.lang.jflex.psi.impl;

import com.intellij.lang.ASTNode;
import org.intellij.lang.jflex.JFlexElementTypes;
import org.intellij.lang.jflex.psi.JFlexExpression;
import org.intellij.lang.jflex.psi.JFlexImplementsStatement;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexImplementsStatementImpl extends JFlexElementImpl implements JFlexImplementsStatement {

    public JFlexImplementsStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

    public JFlexExpression[] getInterfaces() {
        ASTNode[] nodes = getNode().getChildren(JFlexElementTypes.EXPRESSIONS);
        JFlexExpression[] result = new JFlexExpression[nodes.length];
        int i = 0;
        for (ASTNode node : nodes) {
            result[i++] = (JFlexExpression) node.getPsi();
        }
        return result;
    }

}
