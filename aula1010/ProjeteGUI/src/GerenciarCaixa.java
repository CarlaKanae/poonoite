import view.CaixaView;
import view.CaixaView2;

import javax.swing.*;

public class GerenciarCaixa {
    public static void main(String[] args) {
        //Código para abrir a janela CaixaView
        //CaixaView tela = new CaixaView();
        //tela.setVisible(true);
        JFrame tela = new JFrame();
        tela.setContentPane(new CaixaView2().getPanelCaixa());
        tela.setTitle("Controle de Caixa");
        tela.setSize(350,400);
        tela.setLocationRelativeTo(null);
        tela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        tela.setVisible(true);
    }
}