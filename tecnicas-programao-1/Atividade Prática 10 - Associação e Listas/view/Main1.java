package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import modelo.Empresa;

public class Main1 extends JFrame {

    private JPanel contentPane;
    private JTextField txt_nome;
    private JTextField txt_email;
    private Empresa empresa = new Empresa(); 
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                Main1 frame = new Main1();
                frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    public Main1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 400);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNome = new JLabel("Nome");
        lblNome.setBounds(50, 30, 80, 20);
        contentPane.add(lblNome);

        txt_nome = new JTextField();
        txt_nome.setBounds(130, 30, 200, 20);
        contentPane.add(txt_nome);

        JLabel lblEmail = new JLabel("E-mail");
        lblEmail.setBounds(50, 70, 80, 20);
        contentPane.add(lblEmail);

        txt_email = new JTextField();
        txt_email.setBounds(130, 70, 200, 20);
        contentPane.add(txt_email);

        JButton btnEnviar = new JButton("Enviar Cliente");
        btnEnviar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nome = txt_nome.getText();
                String email = txt_email.getText();

                if (nome.isEmpty() || email.isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
                    return;
                }

                String msg = empresa.adicionarCliente(nome, email);
                JOptionPane.showMessageDialog(null, msg);

                txt_nome.setText("");
                txt_email.setText("");
            }
        });

        btnEnviar.setBounds(130, 110, 150, 25);
        contentPane.add(btnEnviar);

        JButton btnExibir = new JButton("Exibir Clientes");
        btnExibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lista = empresa.exibirClientes();
                JOptionPane.showMessageDialog(null, lista);
            }
        });

        btnExibir.setBounds(130, 150, 150, 25);
        contentPane.add(btnExibir);

        JButton btnAddFuncionario = new JButton("Novo Funcionário");
        btnAddFuncionario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String nome = JOptionPane.showInputDialog("Nome do funcionário:");
                String cargo = JOptionPane.showInputDialog("Cargo:");
                String sal = JOptionPane.showInputDialog("Salário:");

                if (nome == null || cargo == null || sal == null) {
                    return;
                }

                try {
                    double salario = Double.parseDouble(sal);
                    String msg = empresa.adicionarFuncionario(nome, cargo, salario);
                    JOptionPane.showMessageDialog(null, msg);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Salário inválido!");
                }
            }
        });

        btnAddFuncionario.setBounds(130, 190, 150, 25);
        contentPane.add(btnAddFuncionario);

        JButton btnExibirFunc = new JButton("Exibir Funcionários");
        btnExibirFunc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String lista = empresa.exibirFuncionarios();
                JOptionPane.showMessageDialog(null, lista);
            }
        });

        btnExibirFunc.setBounds(130, 230, 150, 25);
        contentPane.add(btnExibirFunc);

        JButton btnMedia = new JButton("Média Salarial");
        btnMedia.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String msg = empresa.exibirMediaSalarial();
                JOptionPane.showMessageDialog(null, msg);
            }
        });

        btnMedia.setBounds(130, 270, 150, 25);
        contentPane.add(btnMedia);
    }
}
