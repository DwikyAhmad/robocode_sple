package jab;

import java.awt.Color;

public class ModuleBot extends Module {
    protected void initialize() {
        // Tema hijau - menggunakan variasi warna hijau
        setBodyColor(new Color(0, 100, 0));     // Dark green
        setGunColor(new Color(144, 238, 144));  // Light green
        setRadarColor(new Color(0, 255, 0));    // Bright green
        setScanColor(new Color(152, 251, 152)); // Pale green
        setBulletColor(new Color(50, 205, 50)); // Lime green
    }
}