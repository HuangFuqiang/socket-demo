package com.code.socket.socket2;

import java.awt.EventQueue;


public class StartClient {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow frame = new MainWindow();
                    frame.setVisible(true);
                    ChatManager.getCM().setWindow(frame);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

}