package view;

import model.Caixa;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CaixaView2 {
    private JPanel panelCaixa;
    private JTextField txtValor;
    private JTextField txtSaldo;
    private JButton entradaButton;
    private JButton retiradaButton;
    private JButton consultaButton;
    private JButton sairButton;
    private JTextArea textArea1;

    protected Caixa caixa;

    public JPanel getPanelCaixa() {
        return panelCaixa;
    }

    public CaixaView2(){
        caixa = new Caixa();

        entradaButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                double valor = Double.parseDouble(txtValor.getText());
                caixa.depositar(valor);
                txtValor.requestFocus();
                txtValor.setText(null);
                textArea1.append("Depósito efetuado com sucesso");

            }
        });
    }
}
