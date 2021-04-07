package br.unicesumar.aula20210401.adapter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;

import javax.swing.JButton;
import javax.swing.JDialog;

public class AppAdapter {
    public static void main(String[] args) {
        AppAdapter app = new AppAdapter();
        app.show();
    }
    private void show() {
        JDialog dialog = new JDialog();
        dialog.setSize(120,100);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        JButton btnOk = new JButton("Ok");
        btnOk.addActionListener(new DateManagerToActionListenerAdapter(new DateManager()));
        dialog.add(btnOk);
        dialog.setVisible(true);
    }

    private class DateManagerToActionListenerAdapter implements ActionListener {
        private DateManager dateManager;
        public DateManagerToActionListenerAdapter(DateManager dateManager) {
            this.dateManager = dateManager;
        }
        @Override
        public void actionPerformed(ActionEvent arg0) {
            dateManager.showCurrentDate();;
        }

    }
    private class DateManager {
        private void showCurrentDate() {
            System.out.println(LocalDate.now().toString());
        }
    }
}
