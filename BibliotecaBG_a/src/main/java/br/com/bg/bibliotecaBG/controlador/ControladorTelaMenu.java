package br.com.bg.bibliotecaBG.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author rubens leme
 */
public class ControladorTelaMenu {

    private JLabel jlaDiaSemana;
    private JLabel jlaData;
    private JLabel jlaHora;
    private Timer timer;

    public ControladorTelaMenu(JFrame telaMenu, JDesktopPane desktop,JLabel jlaDiaSemana, JLabel jlaData, JLabel jlaHora) {
        //super(telaMenu, desktop);
        this.jlaDiaSemana = jlaDiaSemana;
        this.jlaData = jlaData;
        this.jlaHora = jlaHora;
        atualizacaoTimer();
    }

    private void atualizacaoTimer() {
        timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                atualizarHora();
            }
        });
        timer.start();
        atualizarData(); 
    }

    private void atualizarHora() {
     jlaHora.setText(new SimpleDateFormat("HH:mm:ss").format(new Date()));
    }

    private void atualizarData() {
      jlaDiaSemana.setText(new SimpleDateFormat("EEEE").format(new Date()));
      
    }

}
