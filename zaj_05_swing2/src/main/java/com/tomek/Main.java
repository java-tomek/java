package com.tomek;

import com.tomek.czasnaswiecie.CzasNaSwiecie;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                CzasNaSwiecie czasNaSwiecie = new CzasNaSwiecie();
            }
        });
    }
}