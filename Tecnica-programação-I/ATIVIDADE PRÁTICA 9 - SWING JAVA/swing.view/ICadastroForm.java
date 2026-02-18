package swing.view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JSpinner;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;
import swing.modelo.Cliente;
import javax.swing.SwingConstants;

public class ICadastroForm extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txt_nome;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ICadastroForm frame = new ICadastroForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ICadastroForm() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setBounds(161, 73, 46, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Idade:");
		lblNewLabel_1.setBounds(161, 114, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Sexo:");
		lblNewLabel_2.setBounds(161, 158, 46, 14);
		contentPane.add(lblNewLabel_2);
		
		txt_nome = new JTextField();
		txt_nome.setBounds(204, 70, 86, 20);
		contentPane.add(txt_nome);
		txt_nome.setColumns(10);
		
		JSpinner spinner_idade = new JSpinner();
		spinner_idade.setBounds(204, 111, 86, 20);
		contentPane.add(spinner_idade);
		
		JRadioButton rdb_sexoM = new JRadioButton("Masculino");
		rdb_sexoM.setBounds(194, 154, 71, 23);
		contentPane.add(rdb_sexoM);
		
		JRadioButton rdb_sexoF = new JRadioButton("Feminino");
		rdb_sexoF.setBounds(267, 154, 71, 23);
		contentPane.add(rdb_sexoF);
		
		ButtonGroup grupoSexo = new ButtonGroup();
		grupoSexo.add(rdb_sexoM);
		grupoSexo.add(rdb_sexoF);
		
		JLabel lblResumo = new JLabel("");
		lblResumo.setBounds(32, 230, 281, 20);
		contentPane.add(lblResumo);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        String nome = txt_nome.getText();
		        int idade = (int) spinner_idade.getValue();
		        String sexo = rdb_sexoM.isSelected() ? "Masculino" :
		                      rdb_sexoF.isSelected() ? "Feminino" : "";
		        
		       
		        
		        if (nome.isEmpty() || sexo.isEmpty()) {
		            lblResumo.setText("Preencha todos os campos!");
		            return;
		        } else if (!nome.matches("[a-zA-ZÀ-ÿ\\s]+")) {
		            lblResumo.setText("O nome deve conter apenas letras!");
		            return;
		        }
		        
		        if(idade < 18 || idade > 120) {
		        	lblResumo.setText("A idade deve estar entre 18 e 120 anos!");
		        	return;
		        }
		        
		        Cliente cliente = new Cliente(nome, idade, sexo);

		        JOptionPane.showMessageDialog(btnEnviar,
		                "Nome: " + cliente.getNome() + 
		                "\nIdade: " + cliente.getIdade() + 
		                "\nSexo: " + cliente.getSexo(),
		                "Dados do cliente",
		                JOptionPane.INFORMATION_MESSAGE);
		    }
		});
		
		btnEnviar.setBounds(204, 192, 89, 23);
		contentPane.add(btnEnviar);
		
		JLabel lblNewLabel_3 = new JLabel("Formulario ");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBounds(73, 26, 334, 30);
		contentPane.add(lblNewLabel_3);
	}
}
