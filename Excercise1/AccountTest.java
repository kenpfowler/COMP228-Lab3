package Excercise1;

//import swing library and event listeners to create UI
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//create GUI class
public class AccountTest extends JFrame {

    //array to store
    ArrayList<Account> accounts = new ArrayList();

    //variables to control GUI
    private JPanel frame;
    private JRadioButton rbtnChequing;
    private JRadioButton rbtnSavings;
    private JLabel lblAccountType;
    private JLabel lblBalance;
    private JTextField txtBalance;
    private JLabel lblMain;
    private JButton btnCreate;
    private JButton editBalancesButton;

    //constructor for GUI
    public AccountTest(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(frame);
        this.pack();

        //button to create account
        btnCreate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isChequing())
                {
                    accounts.add(new Chequing(balance()));
                }
                else
                {
                    accounts.add(new Savings(balance()));
                }
                //display account information
                String message = "Account Created:\n" + accounts.get(accounts.size() - 1).displayInfo();
                JOptionPane.showMessageDialog(frame, message);
                txtBalance.setText("");
            }
        });

        //button to edit existing account
        editBalancesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (accounts.isEmpty())
                {
                JOptionPane.showMessageDialog(frame, "There are no accounts. Create one!");
                }
                else {
                    for (Account account : accounts) {
                       account.setBalance(Double.parseDouble(JOptionPane.showInputDialog(frame,   account.displayInfo() + "\nEnter the new balance", account.getBalance())));
                    }
                }
            }
        });
    }

    //check which button is clicked
    public boolean isChequing()
    {
        if (rbtnChequing.isSelected())
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //get the balance entered
    public double balance()
    {
     String entry = txtBalance.getText();
     return Double.parseDouble(entry);
    }
    //display the GUI
    public static void main(String[] args)
    {
        JFrame frame = new AccountTest("Account Manager");
        frame.setVisible(true);
    }

}
