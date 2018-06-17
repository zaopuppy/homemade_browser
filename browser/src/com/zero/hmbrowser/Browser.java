package com.zero.hmbrowser;

import com.zero.hmbrowser.log.Log;

import javax.swing.*;
import java.awt.*;

public class Browser {

    private static final String TAG = "Browser";

    public static void main(String[] args) {
        Log.i(TAG, "welcome to homemade browser");

        JFrame frame = new JFrame();

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        frame.setLayout(new BorderLayout());

        {
            Canvas canvas = new Canvas();
            canvas.setSize(new Dimension(720, 1080));
            frame.add(canvas, BorderLayout.CENTER);
            canvas.repaint();
        }

        // frame.setSize(720, 1080);

        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
