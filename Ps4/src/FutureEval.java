import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;


public class FutureEval {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JLabel lblInvestmentAmount;
	private JLabel lblYears;
	private JLabel lblAnnualInterestRate;
	private JLabel lblFutureValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FutureEval window = new FutureEval();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FutureEval() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(246, 11, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		final int amount = Integer.parseInt(textField.getText());
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(246, 42, 144, 20);
		frame.getContentPane().add(textField_1);
		final int years = Integer.parseInt(textField.getText());
		
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(246, 73, 144, 20);
		frame.getContentPane().add(textField_2);
		final double rate = Double.parseDouble(textField.getText());
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(246, 104, 144, 20);
		frame.getContentPane().add(textField_3);
		final int value = Integer.parseInt(textField.getText());
		
		lblInvestmentAmount = new JLabel("Investment Amount");
		lblInvestmentAmount.setBounds(28, 14, 123, 17);
		frame.getContentPane().add(lblInvestmentAmount);
		
		lblYears = new JLabel("Years");
		lblYears.setBounds(28, 44, 123, 17);
		frame.getContentPane().add(lblYears);
		
		lblAnnualInterestRate = new JLabel("Annual Interest Rate");
		lblAnnualInterestRate.setBounds(28, 76, 123, 17);
		frame.getContentPane().add(lblAnnualInterestRate);
		
		lblFutureValue = new JLabel("Future Value");
		lblFutureValue.setBounds(28, 107, 123, 17);
		frame.getContentPane().add(lblFutureValue);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.setBounds(279, 174, 111, 37);
		frame.getContentPane().add(btnCalculate);
		btnCalculate.addActionListener(new ActionListener()
		{
		  public void actionPerformed(ActionEvent e)
		  {
		   CalcEngine c1 = new CalcEngine(amount, years, rate);
		   double fv = c1.getFv();
		   textField_3.setText(String.valueOf(fv));
		  }
		});
		
	}
}
