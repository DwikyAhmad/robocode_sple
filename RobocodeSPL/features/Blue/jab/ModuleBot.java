package jab;

import java.awt.Color;

public class ModuleBot extends Module {
    protected void initialize() {
        // Tema biru - menggunakan variasi warna biru
        setBodyColor(new Color(0, 0, 139));     // Dark blue
        setGunColor(new Color(135, 206, 235));  // Sky blue
        setRadarColor(new Color(0, 191, 255));  // Deep sky blue
        setScanColor(new Color(173, 216, 230)); // Light blue
        setBulletColor(new Color(30, 144, 255)); // Dodger blue
    }
}