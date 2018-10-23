/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.bg.bibliotecaBG.controlador;

import br.com.bg.bibliotecaBG.dominio.Usuario;
import javax.swing.JTextField;

/**
 *
 * @author 2binfo
 */
public class ControladorTelaCadastroUsuario {
    
    private JTextField jtfNome;
    private JTextField jtfEmail;
    private JTextField jtfCPF;
    private JTextField jtfRG;
    private JTextField jtfIdade;
    private JTextField jtfSexo;
    
    Usuario usuario;

    public ControladorTelaCadastroUsuario(JTextField jtfNome, JTextField jtfEmail, JTextField jtfCPF, JTextField jtfRG, JTextField jtfIdade, JTextField jtfSexo) {
        this.jtfNome = jtfNome;
        this.jtfEmail = jtfEmail;
        this.jtfCPF = jtfCPF;
        this.jtfRG = jtfRG;
        this.jtfIdade = jtfIdade;
        this.jtfSexo = jtfSexo;
    }

    private void preencherUsuario()
    {
        usuario = new Usuario();
        
        usuario.setNome(jtfNome.getText());
        usuario.seteMail(jtfEmail.getText());
        usuario.setCpf(jtfCPF.getText());
        usuario.setRg(jtfRG.getText());
        usuario.setIdade(Integer.parseInt(jtfIdade.getText()));
        usuario.setSexo(jtfSexo.getText());
        
    }
    
}
