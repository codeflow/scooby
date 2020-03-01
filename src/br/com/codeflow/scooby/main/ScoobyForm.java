
package br.com.codeflow.scooby.main;

import br.com.codeflow.scooby.form.FrmCustomer;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JInternalFrame;

/**
 *
 * @author codeflow
 */
public class ScoobyForm extends javax.swing.JFrame {
    
    private FrmCustomer customerForm;

    public ScoobyForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        tollbar = new javax.swing.JToolBar();
        btnCustomer = new javax.swing.JToggleButton();
        btnPets = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        separator = new javax.swing.JSeparator();
        lblBalanceStatus = new javax.swing.JLabel();
        progressBar = new javax.swing.JProgressBar();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        customerMenuItem = new javax.swing.JMenuItem();
        petsMenuItem = new javax.swing.JMenuItem();
        mainMenu = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("br/com/codeflow/scooby/resources/i18n/messages_pt_BR"); // NOI18N
        setTitle(bundle.getString("ScoobyForm.title")); // NOI18N
        setBackground(java.awt.Color.lightGray);

        desktopPane.setBackground(new java.awt.Color(255, 255, 255));
        desktopPane.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/customers.png"))); // NOI18N
        btnCustomer.setText(bundle.getString("ScoobyForm.btnCustomer.text")); // NOI18N
        btnCustomer.setActionCommand(bundle.getString("ScoobyForm.btnCustomer.text")); // NOI18N
        btnCustomer.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCustomer.setFocusable(false);
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCustomer.setMaximumSize(new java.awt.Dimension(30, 30));
        btnCustomer.setMinimumSize(new java.awt.Dimension(30, 30));
        btnCustomer.setPreferredSize(new java.awt.Dimension(30, 30));
        btnCustomer.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        tollbar.add(btnCustomer);

        btnPets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/pets.png"))); // NOI18N
        btnPets.setText(bundle.getString("ScoobyForm.btnPets.text")); // NOI18N
        btnPets.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnPets.setFocusable(false);
        btnPets.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPets.setMaximumSize(new java.awt.Dimension(30, 30));
        btnPets.setMinimumSize(new java.awt.Dimension(30, 30));
        btnPets.setPreferredSize(new java.awt.Dimension(30, 30));
        btnPets.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tollbar.add(btnPets);

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/login.png"))); // NOI18N
        jToggleButton1.setText(bundle.getString("ScoobyForm.jToggleButton1.text")); // NOI18N
        jToggleButton1.setToolTipText(bundle.getString("ScoobyForm.jToggleButton1.toolTipText")); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jToggleButton1.setFocusable(false);
        jToggleButton1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jToggleButton1.setMaximumSize(new java.awt.Dimension(30, 30));
        jToggleButton1.setMinimumSize(new java.awt.Dimension(30, 30));
        jToggleButton1.setPreferredSize(new java.awt.Dimension(30, 30));
        jToggleButton1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        tollbar.add(jToggleButton1);

        desktopPane.add(tollbar);
        tollbar.setBounds(0, 0, 650, 30);

        separator.setOrientation(javax.swing.SwingConstants.VERTICAL);

        lblBalanceStatus.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/off.png")));
        lblBalanceStatus.setText(bundle.getString("ScoobyForm.lblBalanceStatus.text")); // NOI18N

        progressBar.setIndeterminate(true);

        fileMenu.setMnemonic('f');
        fileMenu.setText(bundle.getString("ScoobyForm.fileMenu.text")); // NOI18N
        fileMenu.setToolTipText(bundle.getString("ScoobyForm.fileMenu.toolTipText")); // NOI18N

        customerMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_1, java.awt.event.InputEvent.CTRL_MASK));
        customerMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/customers.png")));
        customerMenuItem.setMnemonic('o');
        customerMenuItem.setText(bundle.getString("ScoobyForm.customerMenuItem.text")); // NOI18N
        customerMenuItem.setActionCommand("");
        customerMenuItem.setLabel(bundle.getString("ScoobyForm.customerMenuItem.text")); // NOI18N
        customerMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customerMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(customerMenuItem);

        petsMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_2, java.awt.event.InputEvent.CTRL_MASK));
        petsMenuItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/pets.png"))); // NOI18N
        petsMenuItem.setText(bundle.getString("ScoobyForm.petsMenuItem.text")); // NOI18N
        fileMenu.add(petsMenuItem);

        menuBar.add(fileMenu);

        mainMenu.setText(bundle.getString("ScoobyForm.mainMenu.text")); // NOI18N
        menuBar.add(mainMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPane)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 311, Short.MAX_VALUE)
                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblBalanceStatus)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(separator, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 437, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(lblBalanceStatus))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(progressBar, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );

        this.setExtendedState(MAXIMIZED_BOTH);
        customerForm = new FrmCustomer();

        javax.swing.JLabel lblIcon = new javax.swing.JLabel();

        lblIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/logo.png"))); // NOI18N
        int height = (int) Toolkit.getDefaultToolkit().getScreenSize().getHeight();
        int width = (int) Toolkit.getDefaultToolkit().getScreenSize().getWidth();
        lblIcon.setBounds(0, 0, width, height);
        desktopPane.add(lblIcon);

        tollbar.setBounds(0, 0, (int)Toolkit.getDefaultToolkit().getScreenSize().getWidth(), tollbar.getHeight());
        lblBalanceStatus.getAccessibleContext().setAccessibleName(bundle.getString("ScoobyForm.lblBalanceStatus.text")); // NOI18N

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customerMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customerMenuItemActionPerformed
        showDialog(customerForm);
    }//GEN-LAST:event_customerMenuItemActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        showDialog(customerForm);
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void showDialog(JInternalFrame frame) {
        if(frame.isVisible()) {
            frame.toFront();
            frame.requestFocus();
        } else {
            desktopPane.add(frame);
            frame.setVisible(true);
            
            Dimension dimension = frame.getDesktopPane().getSize();
            
            int width = (dimension.width - frame.getSize().width) / 2;
            int height = (dimension.height - frame.getSize().height) / 2;
            
            frame.setLocation(width, height);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnCustomer;
    private javax.swing.JToggleButton btnPets;
    private javax.swing.JMenuItem customerMenuItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel lblBalanceStatus;
    private javax.swing.JMenu mainMenu;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem petsMenuItem;
    private javax.swing.JProgressBar progressBar;
    private javax.swing.JSeparator separator;
    private javax.swing.JToolBar tollbar;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
