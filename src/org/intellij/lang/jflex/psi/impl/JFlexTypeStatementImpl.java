package org.intellij.lang.jflex.psi.impl;

import com.intellij.lang.ASTNode;
import org.intellij.lang.jflex.psi.JFlexTypeStatement;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class JFlexTypeStatementImpl extends JFlexOptionStatementBase implements JFlexTypeStatement {

    public JFlexTypeStatementImpl(@NotNull ASTNode node) {
        super(node);
    }

}
