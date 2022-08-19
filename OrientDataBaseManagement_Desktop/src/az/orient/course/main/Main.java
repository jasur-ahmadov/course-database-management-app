package az.orient.course.main;

import az.orient.course.gui.LoginFrame;

public class Main {

    public static void main(String[] args) {

        try {

            for (javax.swing.UIManager.LookAndFeelInfo info
                    : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

            LoginFrame loginFrame = new LoginFrame();
            loginFrame.setVisible(true);

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}