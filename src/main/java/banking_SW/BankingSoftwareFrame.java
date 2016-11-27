package banking_SW;

import supermarket_SW.Customer;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Angelos
 */
public class BankingSoftwareFrame extends JFrame {

    /**
     * Creates new form BankingSoftwareFrame
     */
    public BankingSoftwareFrame() {
        initComponents();
        clientLoginGui();
       // Customers = new customerList();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contaierLayeredPane = new JLayeredPane();
        clientLoginPane = new JPanel();
        jSeparator1 = new JSeparator();
        jLabel2 = new JLabel();
        custLoginUsernameTextField = new JTextField();
        jLabel3 = new JLabel();
        jLabel4 = new JLabel();
        jPasswordField1 = new JPasswordField();
        custLoginButton = new JButton();
        custSignUpButton = new JButton();
        jLabel20 = new JLabel();
        clientLayeredPane = new JLayeredPane();
        tab1 = new JPanel();
        calculatorLabel = new JLabel();
        tab2 = new JPanel();
        clientAccountLabel = new JLabel();
        tab4 = new JPanel();
        clientDetailsLabel = new JLabel();
        tab3 = new JPanel();
        clientBranchLabel = new JLabel();
        tab5 = new JPanel();
        tab6 = new JPanel();
        tab7 = new JPanel();
        calculatorPanel = new JPanel();
        clientAccountPanel = new JPanel();
        jLabel7 = new JLabel();
        jLabel8 = new JLabel();
        jLabel37 = new JLabel();
        jLabel38 = new JLabel();
        jLabel39 = new JLabel();
        jLabel40 = new JLabel();
        jLabel41 = new JLabel();
        jLabel42 = new JLabel();
        sortCodeTextField = new JTextField();
        accountNoTextField = new JTextField();
        bankNameTextField = new JTextField();
        rateTextField = new JTextField();
        accountHolderTextField = new JTextField();
        lastTransactionTextField = new JTextField();
        balanceTextField = new JTextField();
        jLabel163 = new JLabel();
        makeDepositButton = new JButton();
        openNewAccountButton = new JButton();
        clientAccountPanel1 = new JPanel();
        jLabel43 = new JLabel();
        jLabel48 = new JLabel();
        jLabel50 = new JLabel();
        amountTextField = new JTextField();
        jTextField27 = new JTextField();
        jLabel164 = new JLabel();
        finishDepositButton = new JButton();
        makeDepositButton1 = new JButton();
        clientBranchPanel = new JPanel();
        clientDetailsPanel = new JPanel();
        jLabel6 = new JLabel();
        jLabel9 = new JLabel();
        jLabel10 = new JLabel();
        jLabel11 = new JLabel();
        jLabel12 = new JLabel();
        jLabel16 = new JLabel();
        jLabel34 = new JLabel();
        jLabel36 = new JLabel();
        jLabel35 = new JLabel();
        jLabel5 = new JLabel();
        jLabel13 = new JLabel();
        jLabel14 = new JLabel();
        jLabel15 = new JLabel();
        passDisPasswordField = new JPasswordField();
        firstnameDisTextField = new JTextField();
        lastnameDisTextField = new JTextField();
        emailDisTextField = new JTextField();
        phoneDisTextField = new JTextField();
        jTextField12 = new JTextField();
        houseNameDisTextField = new JTextField();
        streetDisTextField = new JTextField();
        houseNumberDisTextField = new JTextField();
        areaDisTextField = new JTextField();
        cityDisTextField = new JTextField();
        countryDisTextField = new JTextField();
        postcodeDisTextField = new JTextField();
        jButton3 = new JButton();
        statusPane = new JPanel();
        jProgressBar = new JProgressBar();
        jLabel1 = new JLabel();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem2 = new JMenuItem();
        jMenuItem1 = new JMenuItem();

        setTitle("Banking Software");
        setBackground(new Color(51, 51, 51));
        setBounds(new Rectangle(0, 22, 700, 500));
        setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        setLocation(new Point(0, 0));
        setMaximumSize(new Dimension(700, 478));
        setMinimumSize(new Dimension(700, 478));
        setName("Banking "); // NOI18N
        setPreferredSize(new Dimension(700, 478));
        setResizable(false);
        setSize(new Dimension(700, 478));

        contaierLayeredPane.setMaximumSize(new Dimension(700, 478));
        contaierLayeredPane.setMinimumSize(new Dimension(700, 478));
        contaierLayeredPane.setSize(new Dimension(700, 478));

        clientLoginPane.setBackground(new Color(204, 204, 204));
        clientLoginPane.setBounds(new Rectangle(0, 0, 700, 450));
        clientLoginPane.setMaximumSize(new Dimension(700, 450));

        jSeparator1.setBackground(new Color(153, 153, 153));
        jSeparator1.setOrientation(SwingConstants.VERTICAL);
        jSeparator1.setMaximumSize(new Dimension(10, 300));
        jSeparator1.setMinimumSize(new Dimension(10, 300));
        jSeparator1.setPreferredSize(new Dimension(10, 300));
        jSeparator1.setSize(new Dimension(10, 300));

        jLabel2.setFont(new Font("Tamil Sangam MN", 0, 60)); // NOI18N
        jLabel2.setForeground(new Color(102, 102, 102));
        jLabel2.setText("Banking");

        custLoginUsernameTextField.setForeground(new Color(102, 102, 102));
        custLoginUsernameTextField.setHorizontalAlignment(JTextField.CENTER);
        custLoginUsernameTextField.setMaximumSize(new Dimension(150, 28));
        custLoginUsernameTextField.setMinimumSize(new Dimension(150, 28));
        custLoginUsernameTextField.setPreferredSize(new Dimension(150, 28));
        custLoginUsernameTextField.setSize(new Dimension(150, 28));

        jLabel3.setForeground(new Color(51, 51, 51));
        jLabel3.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel3.setText("Username");
        jLabel3.setMaximumSize(new Dimension(150, 16));
        jLabel3.setMinimumSize(new Dimension(150, 16));
        jLabel3.setPreferredSize(new Dimension(150, 16));
        jLabel3.setSize(new Dimension(150, 16));

        jLabel4.setForeground(new Color(51, 51, 51));
        jLabel4.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel4.setText("Password");
        jLabel4.setMaximumSize(new Dimension(150, 16));
        jLabel4.setMinimumSize(new Dimension(150, 16));
        jLabel4.setPreferredSize(new Dimension(150, 16));
        jLabel4.setSize(new Dimension(150, 16));

        jPasswordField1.setForeground(new Color(51, 51, 51));
        jPasswordField1.setHorizontalAlignment(JTextField.CENTER);
        jPasswordField1.setMaximumSize(new Dimension(150, 28));
        jPasswordField1.setMinimumSize(new Dimension(150, 28));
        jPasswordField1.setPreferredSize(new Dimension(150, 28));
        jPasswordField1.setSize(new Dimension(150, 28));

        custLoginButton.setForeground(new Color(51, 51, 51));
        custLoginButton.setText("Login");
        custLoginButton.setMaximumSize(new Dimension(150, 29));
        custLoginButton.setMinimumSize(new Dimension(150, 29));
        custLoginButton.setPreferredSize(new Dimension(150, 29));
        custLoginButton.setSize(new Dimension(150, 29));
        custLoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                custLoginButtonActionPerformed(evt);
            }
        });

        custSignUpButton.setForeground(new Color(51, 51, 51));
        custSignUpButton.setText("Sign up");
        custSignUpButton.setMaximumSize(new Dimension(150, 29));
        custSignUpButton.setMinimumSize(new Dimension(150, 29));
        custSignUpButton.setPreferredSize(new Dimension(150, 29));
        custSignUpButton.setSize(new Dimension(150, 29));

        jLabel20.setFont(new Font("Tamil Sangam MN", 0, 24)); // NOI18N
        jLabel20.setForeground(new Color(102, 102, 102));
        jLabel20.setText("Services");

        org.jdesktop.layout.GroupLayout clientLoginPaneLayout = new org.jdesktop.layout.GroupLayout(clientLoginPane);
        clientLoginPane.setLayout(clientLoginPaneLayout);
        clientLoginPaneLayout.setHorizontalGroup(
            clientLoginPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, clientLoginPaneLayout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .add(jLabel2)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jLabel20)
                .add(83, 83, 83)
                .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(26, 26, 26)
                .add(clientLoginPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(custLoginUsernameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(custLoginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(custSignUpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(60, 60, 60))
        );
        clientLoginPaneLayout.setVerticalGroup(
            clientLoginPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientLoginPaneLayout.createSequentialGroup()
                .add(clientLoginPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientLoginPaneLayout.createSequentialGroup()
                        .add(89, 89, 89)
                        .add(jLabel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(custLoginUsernameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(23, 23, 23)
                        .add(jLabel4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPasswordField1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(67, 67, 67)
                        .add(custLoginButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(custSignUpButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(clientLoginPaneLayout.createSequentialGroup()
                        .add(63, 63, 63)
                        .add(jSeparator1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 300, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(clientLoginPaneLayout.createSequentialGroup()
                        .add(186, 186, 186)
                        .add(clientLoginPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel20)
                            .add(jLabel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 60, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(87, Short.MAX_VALUE))
        );

        clientLoginPane.setBounds(0, 0, 700, 450);
        contaierLayeredPane.add(clientLoginPane, JLayeredPane.DEFAULT_LAYER);

        clientLayeredPane.setMaximumSize(new Dimension(700, 450));
        clientLayeredPane.setPreferredSize(new Dimension(700, 450));
        clientLayeredPane.setSize(new Dimension(700, 450));

        tab1.setBackground(new Color(169, 186, 157));
        tab1.setLocation(new Point(0, 400));
        tab1.setMaximumSize(new Dimension(100, 50));
        tab1.setMinimumSize(new Dimension(100, 50));

        calculatorLabel.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        calculatorLabel.setForeground(new Color(51, 51, 51));
        calculatorLabel.setHorizontalAlignment(SwingConstants.CENTER);
        calculatorLabel.setMaximumSize(new Dimension(100, 22));
        calculatorLabel.setMinimumSize(new Dimension(100, 22));
        calculatorLabel.setPreferredSize(new Dimension(100, 16));
        calculatorLabel.setSize(new Dimension(100, 16));

        org.jdesktop.layout.GroupLayout tab1Layout = new org.jdesktop.layout.GroupLayout(tab1);
        tab1.setLayout(tab1Layout);
        tab1Layout.setHorizontalGroup(
            tab1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab1Layout.createSequentialGroup()
                .add(calculatorLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        tab1Layout.setVerticalGroup(
            tab1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab1Layout.createSequentialGroup()
                .addContainerGap()
                .add(calculatorLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tab1.setBounds(0, 400, 100, 50);
        clientLayeredPane.add(tab1, JLayeredPane.DEFAULT_LAYER);

        tab2.setBackground(new Color(169, 186, 157));
        tab2.setMaximumSize(new Dimension(100, 50));
        tab2.setMinimumSize(new Dimension(100, 50));
        tab2.setPreferredSize(new Dimension(100, 50));
        tab2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab2MouseExited(evt);
            }
        });
        tab2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                tab2MouseMoved(evt);
            }
        });

        clientAccountLabel.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        clientAccountLabel.setForeground(new Color(51, 51, 51));
        clientAccountLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clientAccountLabel.setText("Account");
        clientAccountLabel.setMaximumSize(new Dimension(100, 16));
        clientAccountLabel.setMinimumSize(new Dimension(100, 16));
        clientAccountLabel.setPreferredSize(new Dimension(100, 16));
        clientAccountLabel.setSize(new Dimension(100, 16));

        org.jdesktop.layout.GroupLayout tab2Layout = new org.jdesktop.layout.GroupLayout(tab2);
        tab2.setLayout(tab2Layout);
        tab2Layout.setHorizontalGroup(
            tab2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab2Layout.createSequentialGroup()
                .add(clientAccountLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        tab2Layout.setVerticalGroup(
            tab2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab2Layout.createSequentialGroup()
                .addContainerGap()
                .add(clientAccountLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tab2.setBounds(100, 400, 100, 50);
        clientLayeredPane.add(tab2, JLayeredPane.DEFAULT_LAYER);

        tab4.setBackground(new Color(169, 186, 157));
        tab4.setLocation(new Point(300, 400));
        tab4.setMaximumSize(new Dimension(100, 50));
        tab4.setMinimumSize(new Dimension(100, 50));

        clientDetailsLabel.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        clientDetailsLabel.setForeground(new Color(51, 51, 51));
        clientDetailsLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clientDetailsLabel.setMaximumSize(new Dimension(100, 16));
        clientDetailsLabel.setMinimumSize(new Dimension(100, 16));
        clientDetailsLabel.setPreferredSize(new Dimension(100, 16));
        clientDetailsLabel.setSize(new Dimension(100, 16));

        org.jdesktop.layout.GroupLayout tab4Layout = new org.jdesktop.layout.GroupLayout(tab4);
        tab4.setLayout(tab4Layout);
        tab4Layout.setHorizontalGroup(
            tab4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab4Layout.createSequentialGroup()
                .add(clientDetailsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        tab4Layout.setVerticalGroup(
            tab4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab4Layout.createSequentialGroup()
                .addContainerGap()
                .add(clientDetailsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tab4.setBounds(300, 400, 100, 50);
        clientLayeredPane.add(tab4, JLayeredPane.DEFAULT_LAYER);

        tab3.setBackground(new Color(169, 186, 157));
        tab3.setLocation(new Point(200, 400));
        tab3.setMaximumSize(new Dimension(100, 50));
        tab3.setMinimumSize(new Dimension(100, 50));

        clientBranchLabel.setFont(new Font("Lucida Grande", 0, 18)); // NOI18N
        clientBranchLabel.setForeground(new Color(51, 51, 51));
        clientBranchLabel.setHorizontalAlignment(SwingConstants.CENTER);
        clientBranchLabel.setMaximumSize(new Dimension(100, 16));
        clientBranchLabel.setMinimumSize(new Dimension(100, 16));
        clientBranchLabel.setPreferredSize(new Dimension(100, 16));
        clientBranchLabel.setSize(new Dimension(100, 16));

        org.jdesktop.layout.GroupLayout tab3Layout = new org.jdesktop.layout.GroupLayout(tab3);
        tab3.setLayout(tab3Layout);
        tab3Layout.setHorizontalGroup(
            tab3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab3Layout.createSequentialGroup()
                .add(clientBranchLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        tab3Layout.setVerticalGroup(
            tab3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(tab3Layout.createSequentialGroup()
                .addContainerGap()
                .add(clientBranchLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        tab3.setBounds(200, 400, 100, 50);
        clientLayeredPane.add(tab3, JLayeredPane.DEFAULT_LAYER);

        tab5.setBackground(new Color(169, 186, 157));
        tab5.setLocation(new Point(400, 400));
        tab5.setMaximumSize(new Dimension(100, 50));
        tab5.setMinimumSize(new Dimension(100, 50));
        tab5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab5MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab5MouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout tab5Layout = new org.jdesktop.layout.GroupLayout(tab5);
        tab5.setLayout(tab5Layout);
        tab5Layout.setHorizontalGroup(
            tab5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        tab5Layout.setVerticalGroup(
            tab5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 50, Short.MAX_VALUE)
        );

        tab5.setBounds(400, 400, 100, 50);
        clientLayeredPane.add(tab5, JLayeredPane.DEFAULT_LAYER);

        tab6.setBackground(new Color(169, 186, 157));
        tab6.setLocation(new Point(500, 400));
        tab6.setMaximumSize(new Dimension(100, 50));
        tab6.setMinimumSize(new Dimension(100, 50));
        tab6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab6MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab6MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab6MouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout tab6Layout = new org.jdesktop.layout.GroupLayout(tab6);
        tab6.setLayout(tab6Layout);
        tab6Layout.setHorizontalGroup(
            tab6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        tab6Layout.setVerticalGroup(
            tab6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 50, Short.MAX_VALUE)
        );

        tab6.setBounds(500, 400, 100, 50);
        clientLayeredPane.add(tab6, JLayeredPane.DEFAULT_LAYER);

        tab7.setBackground(new Color(169, 186, 157));
        tab7.setLocation(new Point(600, 400));
        tab7.setMaximumSize(new Dimension(100, 50));
        tab7.setMinimumSize(new Dimension(100, 50));
        tab7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tab7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tab7MouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tab7MouseEntered(evt);
            }
        });

        org.jdesktop.layout.GroupLayout tab7Layout = new org.jdesktop.layout.GroupLayout(tab7);
        tab7.setLayout(tab7Layout);
        tab7Layout.setHorizontalGroup(
            tab7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 100, Short.MAX_VALUE)
        );
        tab7Layout.setVerticalGroup(
            tab7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 50, Short.MAX_VALUE)
        );

        tab7.setBounds(600, 400, 100, 50);
        clientLayeredPane.add(tab7, JLayeredPane.DEFAULT_LAYER);

        calculatorPanel.setBackground(new Color(204, 204, 204));
        calculatorPanel.setMaximumSize(new Dimension(700, 400));
        calculatorPanel.setPreferredSize(new Dimension(700, 400));

        org.jdesktop.layout.GroupLayout calculatorPanelLayout = new org.jdesktop.layout.GroupLayout(calculatorPanel);
        calculatorPanel.setLayout(calculatorPanelLayout);
        calculatorPanelLayout.setHorizontalGroup(
            calculatorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 700, Short.MAX_VALUE)
        );
        calculatorPanelLayout.setVerticalGroup(
            calculatorPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        calculatorPanel.setBounds(0, 0, 700, 400);
        clientLayeredPane.add(calculatorPanel, JLayeredPane.DEFAULT_LAYER);

        clientAccountPanel.setBackground(new Color(204, 204, 204));
        clientAccountPanel.setMaximumSize(new Dimension(700, 400));
        clientAccountPanel.setPreferredSize(new Dimension(700, 400));
        clientAccountPanel.setSize(new Dimension(700, 400));

        jLabel7.setFont(new Font("Heiti SC", 0, 35)); // NOI18N
        jLabel7.setForeground(new Color(51, 51, 51));
        jLabel7.setText("Account Discription");

        jLabel8.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel8.setForeground(new Color(51, 51, 51));
        jLabel8.setText("Account Number:");

        jLabel37.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel37.setForeground(new Color(51, 51, 51));
        jLabel37.setText("Bank Name:");

        jLabel38.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel38.setForeground(new Color(51, 51, 51));
        jLabel38.setText("Rate:");

        jLabel39.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel39.setForeground(new Color(51, 51, 51));
        jLabel39.setText("Account Holder:");

        jLabel40.setFont(new Font("Heiti SC", 0, 25)); // NOI18N
        jLabel40.setText("Blance:");

        jLabel41.setFont(new Font("Heiti SC", 0, 16)); // NOI18N
        jLabel41.setForeground(new Color(51, 51, 51));
        jLabel41.setText("Last Transaction on:");

        jLabel42.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel42.setForeground(new Color(51, 51, 51));
        jLabel42.setText("Sort Code:");

        sortCodeTextField.setEditable(false);
        sortCodeTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        sortCodeTextField.setForeground(new Color(102, 102, 102));
        sortCodeTextField.setHorizontalAlignment(JTextField.CENTER);

        accountNoTextField.setEditable(false);
        accountNoTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        accountNoTextField.setForeground(new Color(102, 102, 102));
        accountNoTextField.setHorizontalAlignment(JTextField.CENTER);

        bankNameTextField.setEditable(false);
        bankNameTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        bankNameTextField.setForeground(new Color(102, 102, 102));
        bankNameTextField.setHorizontalAlignment(JTextField.CENTER);

        rateTextField.setEditable(false);
        rateTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        rateTextField.setForeground(new Color(102, 102, 102));
        rateTextField.setHorizontalAlignment(JTextField.CENTER);

        accountHolderTextField.setEditable(false);
        accountHolderTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        accountHolderTextField.setForeground(new Color(102, 102, 102));
        accountHolderTextField.setHorizontalAlignment(JTextField.CENTER);

        lastTransactionTextField.setEditable(false);
        lastTransactionTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        lastTransactionTextField.setForeground(new Color(102, 102, 102));
        lastTransactionTextField.setHorizontalAlignment(JTextField.CENTER);

        balanceTextField.setEditable(false);
        balanceTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        balanceTextField.setForeground(new Color(102, 102, 102));
        balanceTextField.setHorizontalAlignment(JTextField.CENTER);

        jLabel163.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel163.setForeground(new Color(51, 51, 51));
        jLabel163.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel163.setText("£");

        makeDepositButton.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        makeDepositButton.setForeground(new Color(51, 51, 51));
        makeDepositButton.setText("Make Deposit");
        makeDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeDepositButtonActionPerformed(evt);
            }
        });

        openNewAccountButton.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        openNewAccountButton.setForeground(new Color(51, 51, 51));
        openNewAccountButton.setText("Open Account");
        openNewAccountButton.setLocation(new Point(0, 300));
        openNewAccountButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openNewAccountButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout clientAccountPanelLayout = new org.jdesktop.layout.GroupLayout(clientAccountPanel);
        clientAccountPanel.setLayout(clientAccountPanelLayout);
        clientAccountPanelLayout.setHorizontalGroup(
            clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel7, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(clientAccountPanelLayout.createSequentialGroup()
                .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientAccountPanelLayout.createSequentialGroup()
                        .add(40, 40, 40)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(clientAccountPanelLayout.createSequentialGroup()
                                .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel8, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(accountNoTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel37, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(bankNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel38, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(rateTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel42, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(sortCodeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel39, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(accountHolderTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                    .add(clientAccountPanelLayout.createSequentialGroup()
                                        .add(jLabel41, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(lastTransactionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                                .add(0, 0, Short.MAX_VALUE))
                            .add(clientAccountPanelLayout.createSequentialGroup()
                                .add(jLabel40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(balanceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jLabel163, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 179, Short.MAX_VALUE)
                                .add(openNewAccountButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, clientAccountPanelLayout.createSequentialGroup()
                        .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(makeDepositButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        clientAccountPanelLayout.setVerticalGroup(
            clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, clientAccountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientAccountPanelLayout.createSequentialGroup()
                        .add(jLabel7)
                        .add(0, 0, Short.MAX_VALUE))
                    .add(clientAccountPanelLayout.createSequentialGroup()
                        .add(0, 85, Short.MAX_VALUE)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel42)
                            .add(sortCodeTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(accountNoTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel8))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(bankNameTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel37))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel38)
                            .add(rateTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel39)
                            .add(accountHolderTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel41)
                            .add(lastTransactionTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(clientAccountPanelLayout.createSequentialGroup()
                                .add(5, 5, 5)
                                .add(clientAccountPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                                    .add(balanceTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel163)
                                    .add(jLabel40)))
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, clientAccountPanelLayout.createSequentialGroup()
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(openNewAccountButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(6, 6, 6)))
                .add(makeDepositButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        clientAccountPanel.setBounds(0, 0, 700, 400);
        clientLayeredPane.add(clientAccountPanel, JLayeredPane.DEFAULT_LAYER);

        clientAccountPanel1.setBackground(new Color(204, 204, 204));
        clientAccountPanel1.setMaximumSize(new Dimension(700, 400));
        clientAccountPanel1.setPreferredSize(new Dimension(700, 400));

        jLabel43.setFont(new Font("Heiti SC", 0, 35)); // NOI18N
        jLabel43.setForeground(new Color(51, 51, 51));
        jLabel43.setText("Deposit");

        jLabel48.setFont(new Font("Heiti SC", 0, 25)); // NOI18N
        jLabel48.setText("Blance:");

        jLabel50.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel50.setForeground(new Color(51, 51, 51));
        jLabel50.setText("Amount:");

        amountTextField.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        amountTextField.setForeground(new Color(102, 102, 102));
        amountTextField.setHorizontalAlignment(JTextField.CENTER);

        jTextField27.setEditable(false);
        jTextField27.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jTextField27.setForeground(new Color(102, 102, 102));
        jTextField27.setHorizontalAlignment(JTextField.CENTER);

        jLabel164.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        jLabel164.setForeground(new Color(51, 51, 51));
        jLabel164.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel164.setText("£");

        finishDepositButton.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        finishDepositButton.setForeground(new Color(51, 51, 51));
        finishDepositButton.setText("Deposit");
        finishDepositButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finishDepositButtonActionPerformed(evt);
            }
        });

        makeDepositButton1.setFont(new Font("Heiti SC", 0, 17)); // NOI18N
        makeDepositButton1.setForeground(new Color(51, 51, 51));
        makeDepositButton1.setText("Accoutn info");
        makeDepositButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeDepositButton1ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout clientAccountPanel1Layout = new org.jdesktop.layout.GroupLayout(clientAccountPanel1);
        clientAccountPanel1.setLayout(clientAccountPanel1Layout);
        clientAccountPanel1Layout.setHorizontalGroup(
            clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientAccountPanel1Layout.createSequentialGroup()
                .add(clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientAccountPanel1Layout.createSequentialGroup()
                        .add(clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(clientAccountPanel1Layout.createSequentialGroup()
                                .add(46, 46, 46)
                                .add(clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(clientAccountPanel1Layout.createSequentialGroup()
                                        .add(jLabel50, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(amountTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 160, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(finishDepositButton))
                                    .add(clientAccountPanel1Layout.createSequentialGroup()
                                        .add(jLabel48, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jTextField27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 130, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                        .add(jLabel164, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 23, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                            .add(clientAccountPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .add(jLabel43, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 350, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .add(0, 219, Short.MAX_VALUE))
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, clientAccountPanel1Layout.createSequentialGroup()
                        .add(0, 0, Short.MAX_VALUE)
                        .add(makeDepositButton1)))
                .addContainerGap())
        );
        clientAccountPanel1Layout.setVerticalGroup(
            clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, clientAccountPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel43)
                .add(31, 31, 31)
                .add(clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel50)
                    .add(amountTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(finishDepositButton))
                .add(18, 18, 18)
                .add(clientAccountPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel48)
                    .add(jTextField27, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel164))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 200, Short.MAX_VALUE)
                .add(makeDepositButton1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 40, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        clientAccountPanel1.setBounds(0, 0, 700, 400);
        clientLayeredPane.add(clientAccountPanel1, JLayeredPane.DEFAULT_LAYER);

        clientBranchPanel.setBackground(new Color(204, 204, 204));
        clientBranchPanel.setMaximumSize(new Dimension(700, 400));
        clientBranchPanel.setPreferredSize(new Dimension(700, 400));

        org.jdesktop.layout.GroupLayout clientBranchPanelLayout = new org.jdesktop.layout.GroupLayout(clientBranchPanel);
        clientBranchPanel.setLayout(clientBranchPanelLayout);
        clientBranchPanelLayout.setHorizontalGroup(
            clientBranchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 700, Short.MAX_VALUE)
        );
        clientBranchPanelLayout.setVerticalGroup(
            clientBranchPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 400, Short.MAX_VALUE)
        );

        clientBranchPanel.setBounds(0, 0, 700, 400);
        clientLayeredPane.add(clientBranchPanel, JLayeredPane.DEFAULT_LAYER);

        clientDetailsPanel.setBackground(new Color(204, 204, 204));
        clientDetailsPanel.setMaximumSize(new Dimension(700, 400));

        jLabel6.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel6.setForeground(new Color(51, 51, 51));
        jLabel6.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel6.setText("Password:");
        jLabel6.setMaximumSize(new Dimension(121, 19));
        jLabel6.setMinimumSize(new Dimension(121, 19));
        jLabel6.setPreferredSize(new Dimension(121, 19));
        jLabel6.setSize(new Dimension(121, 19));

        jLabel9.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel9.setForeground(new Color(51, 51, 51));
        jLabel9.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel9.setText("Firstname:");
        jLabel9.setMaximumSize(new Dimension(121, 19));
        jLabel9.setMinimumSize(new Dimension(121, 19));
        jLabel9.setPreferredSize(new Dimension(121, 19));
        jLabel9.setSize(new Dimension(121, 19));

        jLabel10.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel10.setForeground(new Color(51, 51, 51));
        jLabel10.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel10.setText("Lastname:");
        jLabel10.setMaximumSize(new Dimension(121, 19));
        jLabel10.setMinimumSize(new Dimension(121, 19));
        jLabel10.setPreferredSize(new Dimension(121, 19));
        jLabel10.setSize(new Dimension(121, 19));

        jLabel11.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel11.setForeground(new Color(51, 51, 51));
        jLabel11.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel11.setText("e-mail:");
        jLabel11.setMaximumSize(new Dimension(121, 19));
        jLabel11.setMinimumSize(new Dimension(121, 19));
        jLabel11.setPreferredSize(new Dimension(121, 19));
        jLabel11.setSize(new Dimension(121, 19));

        jLabel12.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel12.setForeground(new Color(51, 51, 51));
        jLabel12.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel12.setText("Contact number:");
        jLabel12.setSize(new Dimension(121, 19));

        jLabel16.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel16.setForeground(new Color(51, 51, 51));
        jLabel16.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel16.setText("Date of birth:");
        jLabel16.setMaximumSize(new Dimension(121, 16));
        jLabel16.setMinimumSize(new Dimension(121, 16));
        jLabel16.setPreferredSize(new Dimension(121, 16));
        jLabel16.setSize(new Dimension(121, 16));

        jLabel34.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel34.setForeground(new Color(51, 51, 51));
        jLabel34.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel34.setText("House name:");
        jLabel34.setSize(new Dimension(121, 121));

        jLabel36.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel36.setForeground(new Color(51, 51, 51));
        jLabel36.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel36.setText("Street:");
        jLabel36.setSize(new Dimension(121, 121));

        jLabel35.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel35.setForeground(new Color(51, 51, 51));
        jLabel35.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel35.setText("House number:");
        jLabel35.setSize(new Dimension(121, 121));

        jLabel5.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel5.setForeground(new Color(51, 51, 51));
        jLabel5.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel5.setText("Area:");
        jLabel5.setSize(new Dimension(121, 121));

        jLabel13.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel13.setForeground(new Color(51, 51, 51));
        jLabel13.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel13.setText("City:");
        jLabel13.setMaximumSize(new Dimension(121, 19));
        jLabel13.setMinimumSize(new Dimension(121, 19));
        jLabel13.setPreferredSize(new Dimension(121, 19));
        jLabel13.setSize(new Dimension(121, 19));

        jLabel14.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel14.setForeground(new Color(51, 51, 51));
        jLabel14.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel14.setText("Country:");
        jLabel14.setMaximumSize(new Dimension(121, 19));
        jLabel14.setMinimumSize(new Dimension(121, 19));
        jLabel14.setPreferredSize(new Dimension(121, 19));
        jLabel14.setSize(new Dimension(121, 19));

        jLabel15.setFont(new Font("Lucida Grande", 0, 15)); // NOI18N
        jLabel15.setForeground(new Color(51, 51, 51));
        jLabel15.setHorizontalAlignment(SwingConstants.RIGHT);
        jLabel15.setText("Postcode:");
        jLabel15.setMaximumSize(new Dimension(121, 19));
        jLabel15.setMinimumSize(new Dimension(121, 19));
        jLabel15.setPreferredSize(new Dimension(121, 19));
        jLabel15.setSize(new Dimension(121, 19));

        passDisPasswordField.setEditable(false);
        passDisPasswordField.setBackground(new Color(246, 244, 244));
        passDisPasswordField.setForeground(new Color(51, 51, 51));
        passDisPasswordField.setHorizontalAlignment(JTextField.CENTER);
        passDisPasswordField.setDragEnabled(false);
        passDisPasswordField.setMaximumSize(new Dimension(200, 28));
        passDisPasswordField.setMinimumSize(new Dimension(200, 28));
        passDisPasswordField.setPreferredSize(new Dimension(200, 28));
        passDisPasswordField.setSize(new Dimension(200, 28));

        firstnameDisTextField.setEditable(false);
        firstnameDisTextField.setBackground(new Color(246, 244, 244));
        firstnameDisTextField.setForeground(new Color(51, 51, 51));
        firstnameDisTextField.setHorizontalAlignment(JTextField.CENTER);
        firstnameDisTextField.setDragEnabled(false);
        firstnameDisTextField.setMaximumSize(new Dimension(200, 28));
        firstnameDisTextField.setMinimumSize(new Dimension(200, 28));
        firstnameDisTextField.setPreferredSize(new Dimension(200, 28));
        firstnameDisTextField.setSize(new Dimension(200, 28));

        lastnameDisTextField.setEditable(false);
        lastnameDisTextField.setBackground(new Color(246, 244, 244));
        lastnameDisTextField.setForeground(new Color(51, 51, 51));
        lastnameDisTextField.setHorizontalAlignment(JTextField.CENTER);
        lastnameDisTextField.setDragEnabled(false);
        lastnameDisTextField.setMaximumSize(new Dimension(200, 28));
        lastnameDisTextField.setMinimumSize(new Dimension(200, 28));
        lastnameDisTextField.setPreferredSize(new Dimension(200, 28));
        lastnameDisTextField.setSize(new Dimension(200, 28));

        emailDisTextField.setEditable(false);
        emailDisTextField.setBackground(new Color(246, 244, 244));
        emailDisTextField.setForeground(new Color(51, 51, 51));
        emailDisTextField.setHorizontalAlignment(JTextField.CENTER);
        emailDisTextField.setDragEnabled(false);
        emailDisTextField.setMaximumSize(new Dimension(200, 28));
        emailDisTextField.setMinimumSize(new Dimension(200, 28));
        emailDisTextField.setPreferredSize(new Dimension(200, 28));
        emailDisTextField.setSize(new Dimension(200, 28));

        phoneDisTextField.setEditable(false);
        phoneDisTextField.setBackground(new Color(246, 244, 244));
        phoneDisTextField.setForeground(new Color(51, 51, 51));
        phoneDisTextField.setHorizontalAlignment(JTextField.CENTER);
        phoneDisTextField.setDragEnabled(false);
        phoneDisTextField.setMaximumSize(new Dimension(200, 28));
        phoneDisTextField.setMinimumSize(new Dimension(200, 28));
        phoneDisTextField.setPreferredSize(new Dimension(200, 28));
        phoneDisTextField.setSize(new Dimension(200, 28));

        jTextField12.setEditable(false);
        jTextField12.setBackground(new Color(246, 244, 244));
        jTextField12.setForeground(new Color(51, 51, 51));
        jTextField12.setHorizontalAlignment(JTextField.CENTER);
        jTextField12.setDragEnabled(false);
        jTextField12.setMaximumSize(new Dimension(200, 28));
        jTextField12.setMinimumSize(new Dimension(200, 28));
        jTextField12.setPreferredSize(new Dimension(200, 28));
        jTextField12.setSize(new Dimension(200, 28));

        houseNameDisTextField.setEditable(false);
        houseNameDisTextField.setBackground(new Color(246, 244, 244));
        houseNameDisTextField.setHorizontalAlignment(JTextField.CENTER);
        houseNameDisTextField.setDragEnabled(false);
        houseNameDisTextField.setMaximumSize(new Dimension(200, 28));
        houseNameDisTextField.setMinimumSize(new Dimension(200, 28));
        houseNameDisTextField.setSize(new Dimension(200, 28));

        streetDisTextField.setEditable(false);
        streetDisTextField.setBackground(new Color(246, 244, 244));
        streetDisTextField.setHorizontalAlignment(JTextField.CENTER);
        streetDisTextField.setDragEnabled(false);
        streetDisTextField.setMaximumSize(new Dimension(200, 28));
        streetDisTextField.setMinimumSize(new Dimension(200, 28));
        streetDisTextField.setSize(new Dimension(200, 28));

        houseNumberDisTextField.setEditable(false);
        houseNumberDisTextField.setBackground(new Color(246, 244, 244));
        houseNumberDisTextField.setHorizontalAlignment(JTextField.CENTER);
        houseNumberDisTextField.setDragEnabled(false);
        houseNumberDisTextField.setMaximumSize(new Dimension(200, 28));
        houseNumberDisTextField.setMinimumSize(new Dimension(200, 28));
        houseNumberDisTextField.setSize(new Dimension(200, 28));

        areaDisTextField.setEditable(false);
        areaDisTextField.setBackground(new Color(246, 244, 244));
        areaDisTextField.setHorizontalAlignment(JTextField.CENTER);
        areaDisTextField.setDragEnabled(false);
        areaDisTextField.setMaximumSize(new Dimension(200, 28));
        areaDisTextField.setMinimumSize(new Dimension(200, 28));
        areaDisTextField.setSize(new Dimension(200, 28));

        cityDisTextField.setEditable(false);
        cityDisTextField.setBackground(new Color(246, 244, 244));
        cityDisTextField.setForeground(new Color(51, 51, 51));
        cityDisTextField.setHorizontalAlignment(JTextField.CENTER);
        cityDisTextField.setDragEnabled(false);
        cityDisTextField.setMaximumSize(new Dimension(200, 28));
        cityDisTextField.setMinimumSize(new Dimension(200, 28));
        cityDisTextField.setPreferredSize(new Dimension(200, 28));
        cityDisTextField.setSize(new Dimension(200, 28));

        countryDisTextField.setEditable(false);
        countryDisTextField.setBackground(new Color(246, 244, 244));
        countryDisTextField.setForeground(new Color(51, 51, 51));
        countryDisTextField.setHorizontalAlignment(JTextField.CENTER);
        countryDisTextField.setDragEnabled(false);
        countryDisTextField.setMaximumSize(new Dimension(200, 28));
        countryDisTextField.setMinimumSize(new Dimension(200, 28));
        countryDisTextField.setPreferredSize(new Dimension(200, 28));
        countryDisTextField.setSize(new Dimension(200, 28));

        postcodeDisTextField.setEditable(false);
        postcodeDisTextField.setBackground(new Color(246, 244, 244));
        postcodeDisTextField.setForeground(new Color(51, 51, 51));
        postcodeDisTextField.setHorizontalAlignment(JTextField.CENTER);
        postcodeDisTextField.setDragEnabled(false);
        postcodeDisTextField.setMaximumSize(new Dimension(200, 28));
        postcodeDisTextField.setMinimumSize(new Dimension(200, 28));
        postcodeDisTextField.setPreferredSize(new Dimension(200, 28));
        postcodeDisTextField.setSize(new Dimension(200, 28));

        jButton3.setForeground(new Color(51, 51, 51));
        jButton3.setText("Edit");
        jButton3.setMaximumSize(new Dimension(100, 29));
        jButton3.setMinimumSize(new Dimension(100, 29));
        jButton3.setPreferredSize(new Dimension(100, 29));
        jButton3.setSize(new Dimension(100, 29));

        org.jdesktop.layout.GroupLayout clientDetailsPanelLayout = new org.jdesktop.layout.GroupLayout(clientDetailsPanel);
        clientDetailsPanel.setLayout(clientDetailsPanelLayout);
        clientDetailsPanelLayout.setHorizontalGroup(
            clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientDetailsPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 100, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(clientDetailsPanelLayout.createSequentialGroup()
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(passDisPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(firstnameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(lastnameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(emailDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(phoneDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel34, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(houseNameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel35, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel36, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(streetDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(houseNumberDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(countryDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(postcodeDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(clientDetailsPanelLayout.createSequentialGroup()
                                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                    .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(jLabel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(cityDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(areaDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 200, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        clientDetailsPanelLayout.setVerticalGroup(
            clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(clientDetailsPanelLayout.createSequentialGroup()
                .add(34, 34, 34)
                .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(clientDetailsPanelLayout.createSequentialGroup()
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel6, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(passDisPasswordField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(firstnameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel9, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(lastnameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel10, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(10, 10, 10)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel11, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(emailDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(phoneDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jTextField12, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 28, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(clientDetailsPanelLayout.createSequentialGroup()
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel34)
                            .add(houseNameDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(12, 12, 12)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(streetDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel36))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(houseNumberDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel35))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(areaDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(jLabel5))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel13, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(cityDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel14, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(countryDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(clientDetailsPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                            .add(jLabel15, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 19, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(postcodeDisTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 37, Short.MAX_VALUE)
                .add(jButton3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 29, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(32, 32, 32))
        );

        clientDetailsPanel.setBounds(0, 0, 700, 400);
        clientLayeredPane.add(clientDetailsPanel, JLayeredPane.DEFAULT_LAYER);

        clientLayeredPane.setBounds(0, 0, 700, 450);
        contaierLayeredPane.add(clientLayeredPane, JLayeredPane.DEFAULT_LAYER);

        statusPane.setBackground(new Color(169, 186, 157));
        statusPane.setMaximumSize(new Dimension(700, 28));
        statusPane.setSize(new Dimension(700, 28));

        jLabel1.setForeground(new Color(51, 51, 51));
        jLabel1.setMaximumSize(new Dimension(150, 16));
        jLabel1.setMinimumSize(new Dimension(150, 16));
        jLabel1.setPreferredSize(new Dimension(150, 16));
        jLabel1.setSize(new Dimension(150, 16));

        org.jdesktop.layout.GroupLayout statusPaneLayout = new org.jdesktop.layout.GroupLayout(statusPane);
        statusPane.setLayout(statusPaneLayout);
        statusPaneLayout.setHorizontalGroup(
            statusPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, statusPaneLayout.createSequentialGroup()
                .addContainerGap()
                .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 150, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(392, 392, 392)
                .add(jProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        statusPaneLayout.setVerticalGroup(
            statusPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(statusPaneLayout.createSequentialGroup()
                .add(statusPaneLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jProgressBar, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 16, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(0, 8, Short.MAX_VALUE))
        );

        statusPane.setBounds(0, 450, 700, 28);
        contaierLayeredPane.add(statusPane, JLayeredPane.DEFAULT_LAYER);

        jMenuBar1.setBackground(new Color(204, 204, 204));
        jMenuBar1.setMaximumSize(new Dimension(700, 22));
        jMenuBar1.setMinimumSize(new Dimension(700, 22));
        jMenuBar1.setPreferredSize(new Dimension(700, 22));
        jMenuBar1.setSize(new Dimension(700, 22));

        jMenu1.setBackground(new Color(204, 204, 204));
        jMenu1.setText("Banking");

        jMenuItem2.setText("Admin login");
        jMenu1.add(jMenuItem2);

        jMenuItem1.setText("Logout");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(contaierLayeredPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 700, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(contaierLayeredPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 478, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 /******************************Startup GUI*************************************
 *
 * The method bellow is used to set the GUI in startup and when the user is log
 * out from the system.
 *
 ******************************************************************************/
    public final void startupGui(){

        clientLoginPane.setVisible(false);
        clientLayeredPane.setVisible(false);
        jProgressBar.setVisible(false);

    }
 /*********************************Client Login GUI*****************************
 *
 * The method bellow is used to set the GUI when the Client is going to log in
 * to the system.
 *
 ******************************************************************************/
    public final void clientLoginGui(){

        clientLoginPane.setVisible(true);
        clientLayeredPane.setVisible(false);
        jProgressBar.setVisible(false);
        custSignUpButton.setVisible(false);
        jMenuBar1.setVisible(false);
    }
 /*********************************Client GUI***********************************
 *
 * The method bellow is used to set the GUI when the Client is logged in to
 * the system.
 *
 ******************************************************************************/
    public void clientGui(){
        clientLoginPane.setVisible(false);
        clientLayeredPane.setVisible(true);

        calculatorPanel.setVisible(false);
        clientAccountPanel.setVisible(true);
        clientAccountPanel1.setVisible(false);
        clientBranchPanel.setVisible(false);
        clientDetailsPanel.setVisible(false);

        tab1.setBackground(typeOfGreen);
        tab2.setBackground(typeOfGrey);
        tab3.setBackground(typeOfGreen);
        tab4.setBackground(typeOfGreen);
    }






 /************************Set text fields editable******************************
 ******************************************************************************/
    private void editable(){
        passDisPasswordField.setEditable(true);
        firstnameDisTextField.setEditable(true);
        lastnameDisTextField.setEditable(true);
        emailDisTextField.setEditable(true);
        phoneDisTextField.setEditable(true);
        houseNameDisTextField.setEditable(true);
        streetDisTextField.setEditable(true);
        houseNumberDisTextField.setEditable(true);
        areaDisTextField.setEditable(true);
        cityDisTextField.setEditable(true);
        countryDisTextField.setEditable(true);
        postcodeDisTextField.setEditable(true);
    }
 /************************Set text fields un-editable******************************
 ******************************************************************************/
     private void uneditable(){
        passDisPasswordField.setEditable(false);
        firstnameDisTextField.setEditable(false);
        lastnameDisTextField.setEditable(false);
        emailDisTextField.setEditable(false);
        phoneDisTextField.setEditable(false);
        houseNameDisTextField.setEditable(false);
        streetDisTextField.setEditable(false);
        houseNumberDisTextField.setEditable(false);
        areaDisTextField.setEditable(false);
        cityDisTextField.setEditable(false);
        countryDisTextField.setEditable(false);
        postcodeDisTextField.setEditable(false);
     }
 /********************************Tabs GUI**************************************
 *
 * The code bellow uses JPanels as tab for the navigation in the software.
 *
 ******************************************************************************/

    Color typeOfGreen = new Color(169,186,157);
    Color typeOfGrey = new Color(204,204,204);

    private void tab2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseClicked
        calculatorPanel.setVisible(false);
        clientAccountPanel.setVisible(true);
        clientDetailsPanel.setVisible(false);
        clientBranchPanel.setVisible(false);

        tab1.setBackground(typeOfGreen);
        tab2.setBackground(typeOfGrey);
        tab4.setBackground(typeOfGreen);
        tab3.setBackground(typeOfGreen);
    }//GEN-LAST:event_tab2MouseClicked

    private void tab2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseMoved
         tab2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
         clientAccountLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_tab2MouseMoved

    private void tab2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab2MouseExited
         clientAccountLabel.setForeground(Color.DARK_GRAY);
    }//GEN-LAST:event_tab2MouseExited

    private void custLoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_custLoginButtonActionPerformed

        customer = new Customer();
        //Check if the person that tries to login to the systes is registered
        if(customer.isUser(custLoginUsernameTextField, jPasswordField1, "customers.txt")){
            clientGui();
            //Load customer details.
            customer.load(custLoginUsernameTextField.getText(),"customers.txt");
            //Hide the Open Account button if the customer has an account already./
            if(!customer.getOwnedAccount().getAccountNo().isEmpty()){
                openNewAccountButton.setVisible(false);
            }
            //Display the account details of the customer.
            customer.getOwnedAccount().display(sortCodeTextField, accountNoTextField, bankNameTextField, rateTextField,
                                                    accountHolderTextField, lastTransactionTextField, balanceTextField);

        }
        else{
             JOptionPane.showMessageDialog(null,"Wrong Username or Password");
        }
    }//GEN-LAST:event_custLoginButtonActionPerformed

    private void tab5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab5MouseClicked

    private void tab5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tab5MouseEntered

    private void tab5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tab5MouseExited

    private void tab6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab6MouseClicked

    private void tab6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tab6MouseEntered

    private void tab6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab6MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tab6MouseExited

    private void tab7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tab7MouseClicked

    private void tab7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tab7MouseEntered

    private void tab7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tab7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tab7MouseExited

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        startupGui();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void makeDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeDepositButtonActionPerformed
        clientAccountPanel.setVisible(false);
        clientAccountPanel1.setVisible(true);
    }//GEN-LAST:event_makeDepositButtonActionPerformed

    private void makeDepositButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeDepositButton1ActionPerformed
        clientAccountPanel.setVisible(true);
        clientAccountPanel1.setVisible(false);
    }//GEN-LAST:event_makeDepositButton1ActionPerformed

    private void openNewAccountButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openNewAccountButtonActionPerformed
        customer.getOwnedAccount().create();
        openNewAccountButton.setVisible(false);
    }//GEN-LAST:event_openNewAccountButtonActionPerformed

    private void finishDepositButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finishDepositButtonActionPerformed
        customer.getOwnedAccount().deposit(Double.parseDouble(amountTextField.getText()));
        JOptionPane.showMessageDialog(null,"Deposit was completed successfully ");
        customer.getOwnedAccount().display(sortCodeTextField, accountNoTextField, bankNameTextField, rateTextField,
                                                accountHolderTextField, lastTransactionTextField, balanceTextField);
    }//GEN-LAST:event_finishDepositButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BankingSoftwareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BankingSoftwareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BankingSoftwareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BankingSoftwareFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BankingSoftwareFrame().setVisible(true);
            }
        });
    }

    private static Customer customer;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JTextField accountHolderTextField;
    private JTextField accountNoTextField;
    private JTextField amountTextField;
    private JTextField areaDisTextField;
    private JTextField balanceTextField;
    private JTextField bankNameTextField;
    private JLabel calculatorLabel;
    private JPanel calculatorPanel;
    private JTextField cityDisTextField;
    private JLabel clientAccountLabel;
    private JPanel clientAccountPanel;
    private JPanel clientAccountPanel1;
    private JLabel clientBranchLabel;
    private JPanel clientBranchPanel;
    private JLabel clientDetailsLabel;
    private JPanel clientDetailsPanel;
    private JLayeredPane clientLayeredPane;
    private JPanel clientLoginPane;
    private JLayeredPane contaierLayeredPane;
    private JTextField countryDisTextField;
    private JButton custLoginButton;
    private JTextField custLoginUsernameTextField;
    private JButton custSignUpButton;
    private JTextField emailDisTextField;
    private JButton finishDepositButton;
    private JTextField firstnameDisTextField;
    private JTextField houseNameDisTextField;
    private JTextField houseNumberDisTextField;
    private JButton jButton3;
    private JLabel jLabel1;
    private JLabel jLabel10;
    private JLabel jLabel11;
    private JLabel jLabel12;
    private JLabel jLabel13;
    private JLabel jLabel14;
    private JLabel jLabel15;
    private JLabel jLabel16;
    private JLabel jLabel163;
    private JLabel jLabel164;
    private JLabel jLabel2;
    private JLabel jLabel20;
    private JLabel jLabel3;
    private JLabel jLabel34;
    private JLabel jLabel35;
    private JLabel jLabel36;
    private JLabel jLabel37;
    private JLabel jLabel38;
    private JLabel jLabel39;
    private JLabel jLabel4;
    private JLabel jLabel40;
    private JLabel jLabel41;
    private JLabel jLabel42;
    private JLabel jLabel43;
    private JLabel jLabel48;
    private JLabel jLabel5;
    private JLabel jLabel50;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel8;
    private JLabel jLabel9;
    private JMenu jMenu1;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JPasswordField jPasswordField1;
    private JProgressBar jProgressBar;
    private JSeparator jSeparator1;
    private JTextField jTextField12;
    private JTextField jTextField27;
    private JTextField lastTransactionTextField;
    private JTextField lastnameDisTextField;
    private JButton makeDepositButton;
    private JButton makeDepositButton1;
    private JButton openNewAccountButton;
    private JPasswordField passDisPasswordField;
    private JTextField phoneDisTextField;
    private JTextField postcodeDisTextField;
    private JTextField rateTextField;
    private JTextField sortCodeTextField;
    private JPanel statusPane;
    private JTextField streetDisTextField;
    private JPanel tab1;
    private JPanel tab2;
    private JPanel tab3;
    private JPanel tab4;
    private JPanel tab5;
    private JPanel tab6;
    private JPanel tab7;
    // End of variables declaration//GEN-END:variables
}
