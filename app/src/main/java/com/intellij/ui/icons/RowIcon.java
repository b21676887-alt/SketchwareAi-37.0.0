package com.intellij.ui.icons;

import javax.swing.Icon;

/**
 * Minimal stub of com.intellij.ui.icons.RowIcon to satisfy runtime verification.
 * This is intentionally minimal (no-op) and can be extended if IntelliJ code
 * calls additional methods at runtime.
 */
public class RowIcon implements Icon {
    @Override
    public void paintIcon(Object c, Object g, int x, int y) {
        // no-op: Android has no java.awt.Graphics; keep empty to satisfy verification
    }

    @Override
    public int getIconWidth() {
        return 0;
    }

    @Override
    public int getIconHeight() {
        return 0;
    }
}
