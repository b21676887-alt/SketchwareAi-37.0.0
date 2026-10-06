package javax.swing;

/**
 * Minimal stub of javax.swing.Icon for Android embedding of IntelliJ classes.
 * Avoids any reference to java.awt so it can compile on Android.
 */
public interface Icon {
    // Use Object to avoid depending on java.awt.Component or java.awt.Graphics
    void paintIcon(Object c, Object g, int x, int y);
    int getIconWidth();
    int getIconHeight();
}
