package view;

import model.Caixa;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaView extends JFrame implements ActionListener {
    protected Dimension dTextField, dLabel, dFrame, dButton, dTextArea;
    protected Label lblValor, lblSaldo;
    protected TextField txtValor, txtSaldo;
    protected Button cmdEntrada, cmdRetirada, cmdConsulta, cmdSair;
    protected TextArea txtMsg;
    protected Caixa caixa;

    public CaixaView(){
        //construtor personalizado - aparencia e comportamento da janela
        caixa = new Caixa();
        dFrame = new Dimension(350, 400);
        dLabel = new Dimension(40,20);
        dTextField = new Dimension(150, 20);
        dButton = new Dimension(95,20);
        dTextArea = new Dimension(300, 140);
        //personalizar a janela
        this.setTitle("Controle de Caixa");
        this.setSize(dFrame);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        //adicionando os componentes da janela
        lblValor = new Label("Valor: ");
        lblValor.setSize(dLabel);
        lblValor.setLocation(25,50);
        this.add(lblValor);

        lblSaldo = new Label("Saldo: ");
        lblSaldo.setSize(dLabel);
        lblSaldo.setLocation(25,80);
        this.add(lblSaldo);

        txtValor = new TextField(null);
        txtValor.setSize(dTextField);
        txtValor.setLocation(75,50);
        this.add(txtValor);

        txtSaldo = new TextField(null);
        txtSaldo.setSize(dTextField);
        txtSaldo.setLocation(75,80);
        this.add(txtSaldo);

        cmdEntrada = new Button("Entrada");
        cmdEntrada.setSize(dButton);
        cmdEntrada.setLocation(25,150);
        cmdEntrada.addActionListener(this);
        this.add(cmdEntrada);

        cmdConsulta = new Button("Consulta");
        cmdConsulta.setSize(dButton);
        cmdConsulta.setLocation(25,185);
        cmdConsulta.addActionListener(this);
        this.add(cmdConsulta);

        cmdRetirada = new Button("Retirada");
        cmdRetirada.setSize(dButton);
        cmdRetirada.setLocation(225,150);
        cmdRetirada.addActionListener(this);
        this.add(cmdRetirada);

        cmdSair = new Button("Sair");
        cmdSair.setSize(dButton);
        cmdSair.setLocation(225,185);
        cmdSair.addActionListener(this);
        this.add(cmdSair);

        txtMsg = new TextArea(null);
        txtMsg.setSize(dTextArea);
        txtMsg.setLocation(25,220);
        this.add(txtMsg);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==cmdSair){
            String mensagem = "Saindo do sistema!!!";
            String titulo = "Controle de Caixa - Saida";
            JOptionPane.showMessageDialog(null,
                    mensagem,
                    titulo,
                    JOptionPane.INFORMATION_MESSAGE);
            System.exit(0);
        }
        if(e.getSource()==cmdEntrada){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.depositar(valor);
            txtMsg.append("Depósito de R$ " + valor + " efetuado\n");
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==cmdRetirada){
            double valor = Double.parseDouble(txtValor.getText());
            caixa.sacar(valor);
            txtMsg.append("Saque de R$ " + valor + " efetuado\n");
            txtValor.setText(null);
            txtValor.requestFocus();
            return;
        }
        if(e.getSource()==cmdConsulta){
            txtSaldo.setText(Double.toString(caixa.exibirSaldo()));
            txtMsg.append("Saldo consultado com sucesso");
            txtValor.setText(null);
            txtValor.requestFocus();
        }
    }
}
