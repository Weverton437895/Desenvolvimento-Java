package swing.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import swing.modelo.Usuario;

public class IPreferenciasUsuario extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private Usuario usuario; 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    IPreferenciasUsuario frame = new IPreferenciasUsuario();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public IPreferenciasUsuario() {
        usuario = new Usuario(); 
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 350);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lbl_tema = new JLabel("Tema");
        lbl_tema.setHorizontalAlignment(SwingConstants.LEFT);
        lbl_tema.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lbl_tema.setBounds(47, 35, 62, 14);
        contentPane.add(lbl_tema);

        JLabel lblNotificacoes = new JLabel("Notificações");
        lblNotificacoes.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNotificacoes.setHorizontalAlignment(SwingConstants.LEFT);
        lblNotificacoes.setBounds(47, 86, 92, 14);
        contentPane.add(lblNotificacoes);

        JLabel lblVolume = new JLabel("Volume");
        lblVolume.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblVolume.setHorizontalAlignment(SwingConstants.LEFT);
        lblVolume.setBounds(47, 135, 86, 14);
        contentPane.add(lblVolume);

        JComboBox<String> box_tema = new JComboBox<>();
        box_tema.setForeground(new Color(0, 0, 0));
        box_tema.setModel(new DefaultComboBoxModel<String>(new String[] {"Claro", "Escuro"}));
        box_tema.setMaximumRowCount(2);
        box_tema.setBounds(150, 33, 111, 22);
        contentPane.add(box_tema);

        JCheckBox chc_notificacoes = new JCheckBox("");
        chc_notificacoes.setBounds(150, 82, 97, 23);
        contentPane.add(chc_notificacoes);

        JSlider slider = new JSlider(0, 100, 50);
        slider.setBounds(150, 135, 200, 26);
        contentPane.add(slider);

        JTextArea txtArea_resultado = new JTextArea();
        txtArea_resultado.setEditable(false);
        txtArea_resultado.setBounds(47, 220, 350, 70);
        contentPane.add(txtArea_resultado);

        JLabel lbl_salvar = new JLabel("");
        lbl_salvar.setBounds(47, 195, 217, 14);
        contentPane.add(lbl_salvar);

        JButton btn_salvar = new JButton("Salvar");
        btn_salvar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String temaSelecionado = (String) box_tema.getSelectedItem();
                boolean notificacoesAtivas = chc_notificacoes.isSelected();
                int volume = slider.getValue();

                usuario.setTema(temaSelecionado);
                usuario.setNotificacoes(notificacoesAtivas);
                usuario.setVolume(volume);

                lbl_salvar.setText("Alterações Salvas!");

                txtArea_resultado.setText(usuario.exibirPreferencias());

                if (temaSelecionado.equals("Escuro")) { 
                    contentPane.setBackground(Color.DARK_GRAY);
                    getContentPane().setBackground(Color.DARK_GRAY); 
                    lbl_tema.setForeground(Color.WHITE);
                    lblNotificacoes.setForeground(Color.WHITE);
                    lblVolume.setForeground(Color.WHITE);
                    lbl_salvar.setForeground(Color.WHITE);
                    txtArea_resultado.setBackground(Color.GRAY);
                    txtArea_resultado.setForeground(Color.WHITE);
                } else {
                    contentPane.setBackground(Color.WHITE);
                    getContentPane().setBackground(Color.WHITE);
                    lbl_tema.setForeground(Color.BLACK);
                    lblNotificacoes.setForeground(Color.BLACK);
                    lblVolume.setForeground(Color.BLACK);
                    lbl_salvar.setForeground(Color.BLACK);
                    txtArea_resultado.setBackground(Color.WHITE);
                    txtArea_resultado.setForeground(Color.BLACK);
                }
            }
        });
        btn_salvar.setBounds(150, 165, 89, 23);
        contentPane.add(btn_salvar);
    }
}