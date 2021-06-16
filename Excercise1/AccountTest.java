package Excercise1;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

//        - [ ] Write a driver class named AccountTest to test this hierarchy.
//        This application should ask the user to enter the type of account and its balance amount.
//        Then, will create the appropriate object (chequing and savings) and display the account information.
//
//        - [ ] As you create each account object,
//        place an Excercise1.Account reference to each new Excercise1.Account object into an array.
//        Each class has its own setBalancedAmount() method.
//        Write a polymorphic screen manager that walks through the array
//        sending setBalancedAmount messages to each object in the array
//        and displaying this information on the screen.
//        (3 marks)


public class AccountTest extends JFrame {

    ArrayList<Account> accounts = new ArrayList();

    private JPanel frame;
    private JRadioButton rbtnChequing;
    private JRadioButton rbtnSavings;
    private JLabel lblAccountType;
    private JLabel lblBalance;
    private JTextField txtBalance;
    private JLabel lblMain;
    private JButton btnCreate;
    private JButton editBalancesButton;

    public AccountTest(String title)
    {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(frame);
        this.pack();

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

                String message = "Account Created:\n" + accounts.get(accounts.size() - 1).displayInfo();
                JOptionPane.showMessageDialog(frame, message);
                txtBalance.setText("");
            }
        });

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
    //accept input for account type and balance
    //create account

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

    public double balance()
    {
     String entry = txtBalance.getText();
     return Double.parseDouble(entry);
    }

    public static void main(String[] args)
    {
        JFrame frame = new AccountTest("Account Manager");
        frame.setVisible(true);
    }

}
