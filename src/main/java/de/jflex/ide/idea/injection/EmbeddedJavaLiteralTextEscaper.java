package de.jflex.ide.idea.injection;

import com.intellij.openapi.util.TextRange;
import com.intellij.psi.LiteralTextEscaper;
import de.jflex.ide.idea.psi.JFlexJavaCode;
import org.jetbrains.annotations.NotNull;

/**
 * @author Max
 */
public class EmbeddedJavaLiteralTextEscaper extends LiteralTextEscaper<JFlexJavaCode> {

    public EmbeddedJavaLiteralTextEscaper(@NotNull JFlexJavaCode host) {
        super(host);
    }

    public boolean decode(@NotNull TextRange textrange, @NotNull StringBuilder stringbuilder) {
        stringbuilder.append(myHost.getText(), textrange.getStartOffset(), textrange.getEndOffset());
        return true;
    }

    public int getOffsetInHost(int i, @NotNull TextRange textrange) {
        int j = i + textrange.getStartOffset();
        if (j < textrange.getStartOffset())
            j = textrange.getStartOffset();
        if (j > textrange.getEndOffset())
            j = textrange.getEndOffset();
        return j;
    }

    public boolean isOneLine() {
        return false;
    }

}