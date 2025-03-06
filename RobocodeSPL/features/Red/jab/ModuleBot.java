package jab;

import java.awt.Color;

public class ModuleBot extends Module {
    protected void initialize() {
        // Tema merah - menggunakan variasi warna merah
        setBodyColor(new Color(139, 0, 0));     // Dark red
        setGunColor(new Color(255, 69, 0));     // Red-orange
        setRadarColor(new Color(255, 0, 0));    // Bright red
        setScanColor(new Color(255, 192, 203)); // Pink
        setBulletColor(new Color(220, 20, 60)); // Crimson
    }
}