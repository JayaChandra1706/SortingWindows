import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Sortingwin extends JFrame {

	private JPanel contentPane;
	private JTextField tfbf;
	private JTextField tfa;
	private JTextField tfd;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sortingwin frame = new Sortingwin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Sortingwin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel heading = new JLabel("Sorting");
		heading.setForeground(new Color(255, 0, 128));
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 35));
		heading.setBounds(153, 11, 134, 35);
		contentPane.add(heading);
		
		JLabel label1 = new JLabel("Enter the numbers to sort:");
		label1.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 19));
		label1.setBounds(10, 57, 236, 31);
		contentPane.add(label1);
		
		tfbf = new JTextField();
		tfbf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		tfbf.setBounds(250, 55, 176, 35);
		contentPane.add(tfbf);
		tfbf.setColumns(10);
		
		JLabel label2 = new JLabel("AcsenDing Order");
		label2.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 19));
		label2.setBounds(10, 122, 230, 31);
		contentPane.add(label2);
		
		tfa = new JTextField();
		tfa.setColumns(10);
		tfa.setBounds(250, 120, 176, 35);
		contentPane.add(tfa);
		
		JButton bubblesortbutton = new JButton("Bubble Sort");
		bubblesortbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sentence=tfbf.getText();
				String arr[]=sentence.split(" ");
				String help;
				String result ="";
				for(int i=0;i<=arr.length-2;i++) {
					for(int j=0;j<=arr.length-2-i;j++) {
						if(Integer.parseInt(arr[j]) > Integer.parseInt(arr[j+1])) {
							help=arr[j];
							arr[j]=arr[j+1];
							arr[j+1]=help;
						}
					}
				}
				for(int i=0;i<=arr.length-1;i++) {
					result= result +arr[i]+" ";
				}
				tfa.setText(result);
				
				
				String sentence1=tfbf.getText();
				String arr1[]=sentence1.split(" ");
				String help1;
				String result1 ="";
				for(int i=0;i<=arr1.length-2;i++) {
					for(int j=0;j<=arr1.length-2-i;j++) {
						if(Integer.parseInt(arr1[j]) < Integer.parseInt(arr1[j+1])) {
							help1=arr1[j];
							arr1[j]=arr1[j+1];
							arr1[j+1]=help1;
						}
					}
				}
				for(int i=0;i<=arr1.length-1;i++) {
					result1= result1 +arr1[i]+" ";
				}
				tfd.setText(result1);
			}
		});
		bubblesortbutton.setBackground(new Color(255, 128, 64));
		bubblesortbutton.setForeground(new Color(0, 0, 255));
		bubblesortbutton.setFont(new Font("Verdana", Font.BOLD, 20));
		bubblesortbutton.setBounds(142, 228, 163, 35);
		contentPane.add(bubblesortbutton);
		
		JLabel label3 = new JLabel("Desending Order");
		label3.setFont(new Font("Viner Hand ITC", Font.BOLD | Font.ITALIC, 19));
		label3.setBounds(10, 186, 215, 31);
		contentPane.add(label3);
		
		tfd = new JTextField();
		tfd.setBounds(250, 180, 176, 31);
		contentPane.add(tfd);
		tfd.setColumns(10);
	}
}
