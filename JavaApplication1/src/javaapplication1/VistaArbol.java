package javaapplication1;

import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class VistaArbol extends JPanel {

    private ArbolBinario arbol;
    private int radio = 20;
    private int verticalSeparation = 50;

    public VistaArbol(ArbolBinario arbol) {
        this.arbol = arbol;
        setBackground(new Color(240, 248, 255)); // Fondo color Alice Blue
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(0, 0, 128)); // Color Navy para el título
        drawCenteredString(g, "ARBOL BINARIO", getWidth(), 30);

        if (arbol.getNodoRaiz() != null) {
            dibujarNodo(g, arbol.getNodoRaiz(), getWidth() / 2, 60, getWidth() / 4);
        }
    }

    private void dibujarNodo(Graphics g, NodoArbol nodo, int x, int y, int hSeparation) {
        if (nodo == null) {
            return;
        }

        // Color claro para los nodos (ej. azul claro)
        g.setColor(new Color(173, 216, 230)); // RGB para Light Blue
        g.fillOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g.setColor(new Color(0, 0, 128)); // RGB para Navy
        g.drawOval(x - radio, y - radio, 2 * radio, 2 * radio);
        g.drawString(Integer.toString(nodo.valor), x - 6, y + 4);

        // Color templado para las líneas (ej. naranja claro)
        g.setColor(new Color(255, 165, 0)); // RGB para Orange
        if (nodo.getNodoIzquierdo() != null) {
            g.drawLine(x - radio, y + radio, x - hSeparation + radio, y + verticalSeparation - radio);
            dibujarNodo(g, nodo.getNodoIzquierdo(), x - hSeparation, y + verticalSeparation, hSeparation / 2);
        }

        if (nodo.getNodoDerecho() != null) {
            g.drawLine(x + radio, y + radio, x + hSeparation - radio, y + verticalSeparation - radio);
            dibujarNodo(g, nodo.getNodoDerecho(), x + hSeparation, y + verticalSeparation, hSeparation / 2);
        }
    }

    private void drawCenteredString(Graphics g, String text, int width, int y) {
        FontMetrics fm = g.getFontMetrics();
        int x = (width - fm.stringWidth(text)) / 2;
        g.drawString(text, x, y);
    }
}
