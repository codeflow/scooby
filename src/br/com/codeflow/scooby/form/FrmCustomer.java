
package br.com.codeflow.scooby.form;

import br.com.codeflow.business.facade.CustomerFacade;
import br.com.codeflow.scooby.business.entity.Address;
import br.com.codeflow.scooby.business.entity.Contact;
import br.com.codeflow.scooby.business.entity.Customer;

import br.com.codeflow.scooby.main.Bootstrap;

import br.com.codeflow.scooby.ui.TableRenderer;
import br.com.codeflow.scooby.ui.model.CustomerTableModel;

import br.com.codeflow.scooby.util.Keyboard;

import java.awt.Color;
import java.text.ParseException;

import javax.swing.BorderFactory;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.text.MaskFormatter;

/**
 *
 * @author codeflow
 */
public class FrmCustomer extends JInternalFrame {
    
    private Customer customer;
    
    private Border border;
    private final CustomerTableModel tableModel;
    
    private MaskFormatter phoneFormatter;
    
    private boolean opened;
    private boolean typing;
    private boolean editing;
    
    private final CustomerFacade customerFacade;
    
    public FrmCustomer() {
        initComponents();
        
        Address address = new Address();
        Contact contact = new Contact();
        
        customerFacade = new CustomerFacade();
        
        customer = new Customer("", address, contact);
        
        tableModel = new CustomerTableModel();
        
        tableCustomer.setModel(tableModel);
        tableCustomer.setDefaultRenderer(Object.class, new TableRenderer());
        
        if(!Bootstrap.customers.isEmpty())
            Bootstrap.customers.forEach(c -> {
                tableModel.add(c);
            });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelForm = new javax.swing.JPanel();
        lblCustomerName = new javax.swing.JLabel();
        txtCustomerName = new javax.swing.JTextField();
        lblCustomerNameError = new javax.swing.JLabel();
        lblCustomerStreet = new javax.swing.JLabel();
        txtCustomerAddressStreet = new javax.swing.JTextField();
        lblCustomerAddressNumber = new javax.swing.JLabel();
        txtCustomerAddressNumber = new javax.swing.JTextField();
        lblCustomerNeighbourhood = new javax.swing.JLabel();
        txtCustomerNeighbourhood = new javax.swing.JTextField();
        lblCustomerPhone = new javax.swing.JLabel();
        try {
            phoneFormatter = new MaskFormatter("(##) #####-####");
        } catch(ParseException error) {
            error.printStackTrace();
        }
        txtCustomerPhone = new javax.swing.JFormattedTextField(phoneFormatter);
        lblCustomerPhoneError = new javax.swing.JLabel();
        lblCustomerMail = new javax.swing.JLabel();
        txtCustomerMail = new javax.swing.JTextField();
        btnCustomerSave = new javax.swing.JButton();
        btnCustomerDelete = new javax.swing.JButton();
        panelList = new javax.swing.JPanel();
        scrollPaneCustomer = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();

        setClosable(true);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("br/com/codeflow/scooby/resources/i18n/messages_pt_BR"); // NOI18N
        setTitle(bundle.getString("FrmCustomer.title")); // NOI18N
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        panelForm.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), bundle.getString("FrmCustomer.panelForm.add.title"))); // NOI18N
        panelForm.setPreferredSize(new java.awt.Dimension(570, 300));

        lblCustomerName.setText(bundle.getString("FrmCustomer.lblCustomerName.text")); // NOI18N

        txtCustomerName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerNameKeyReleased(evt);
            }
        });

        lblCustomerNameError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/error.png"))); // NOI18N
        lblCustomerNameError.setToolTipText(bundle.getString("FrmCustomer.lblCustomerNameError.tip")); // NOI18N

        lblCustomerStreet.setText(bundle.getString("FrmCustomer.lblCustomerAddressStreet.text")); // NOI18N

        txtCustomerAddressStreet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerAddressStreetKeyReleased(evt);
            }
        });

        lblCustomerAddressNumber.setText(bundle.getString("FrmCustomer.lblCustomerAddressNumber.text")); // NOI18N

        txtCustomerAddressNumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerAddressNumberKeyReleased(evt);
            }
        });

        lblCustomerNeighbourhood.setText(bundle.getString("FrmCustomer.lblCustomerNeighborhood.text")); // NOI18N

        txtCustomerNeighbourhood.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerNeighbourhoodKeyReleased(evt);
            }
        });

        lblCustomerPhone.setText(bundle.getString("FrmCustomer.lblCustomerPhone.text")); // NOI18N

        txtCustomerPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerPhoneKeyReleased(evt);
            }
        });

        lblCustomerPhoneError.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/error.png"))); // NOI18N
        lblCustomerPhoneError.setToolTipText(bundle.getString("FrmCustomer.lblCustomerPhoneError.tip")); // NOI18N

        lblCustomerMail.setText(bundle.getString("FrmCustomer.lblCustomerMail.text")); // NOI18N

        txtCustomerMail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtCustomerMailKeyReleased(evt);
            }
        });

        btnCustomerSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/customizer.png"))); // NOI18N
        btnCustomerSave.setText(bundle.getString("FrmCustomer.btnSave.add.text")); // NOI18N
        btnCustomerSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerSaveActionPerformed(evt);
            }
        });

        btnCustomerDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/codeflow/scooby/resources/img/remove.png"))); // NOI18N
        btnCustomerDelete.setText(bundle.getString("FrmCustomer.btnDelete.delete.text")); // NOI18N
        btnCustomerDelete.setEnabled(false);
        btnCustomerDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelFormLayout = new javax.swing.GroupLayout(panelForm);
        panelForm.setLayout(panelFormLayout);
        panelFormLayout.setHorizontalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerNeighbourhood)
                            .addComponent(txtCustomerNeighbourhood, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addComponent(lblCustomerPhone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCustomerPhoneError)))
                        .addGap(28, 28, 28)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addComponent(lblCustomerMail)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtCustomerMail)))
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelFormLayout.createSequentialGroup()
                                .addComponent(lblCustomerName)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lblCustomerNameError)))
                        .addGap(30, 30, 30)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblCustomerStreet)
                            .addComponent(txtCustomerAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCustomerAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCustomerAddressNumber)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCustomerSave)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCustomerDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelFormLayout.setVerticalGroup(
            panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblCustomerName)
                        .addComponent(lblCustomerStreet)
                        .addComponent(lblCustomerAddressNumber))
                    .addComponent(lblCustomerNameError))
                .addGap(8, 8, 8)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelFormLayout.createSequentialGroup()
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerAddressStreet, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCustomerAddressNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblCustomerNeighbourhood)
                                .addComponent(lblCustomerPhone))
                            .addComponent(lblCustomerMail)))
                    .addComponent(lblCustomerPhoneError))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCustomerNeighbourhood, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCustomerMail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCustomerDelete)
                    .addComponent(btnCustomerSave))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lblCustomerNameError.setVisible(false);
        lblCustomerPhoneError.setVisible(false);

        panelList.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createEtchedBorder(), bundle.getString("FrmCustomer.panelList.title"))); // NOI18N

        tableCustomer.setAutoCreateRowSorter(true);
        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tableCustomer.setRowHeight(18);
        tableCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCustomerMouseClicked(evt);
            }
        });
        tableCustomer.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableCustomerKeyReleased(evt);
            }
        });
        scrollPaneCustomer.setViewportView(tableCustomer);

        javax.swing.GroupLayout panelListLayout = new javax.swing.GroupLayout(panelList);
        panelList.setLayout(panelListLayout);
        panelListLayout.setHorizontalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCustomer)
                .addContainerGap())
        );
        panelListLayout.setVerticalGroup(
            panelListLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelListLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPaneCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 870, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelForm, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelList, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerSaveActionPerformed
        addCustomer();
    }//GEN-LAST:event_btnCustomerSaveActionPerformed

    private void txtCustomerNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyReleased
        if(opened) {
            customer.setName(txtCustomerName.getText().toUpperCase());
            txtCustomerName.setText(customer.getName());

            typing = true;

            if(validateCustomerNameField())
                if(evt.getKeyCode() == Keyboard.ENTER.getKey())
                    txtCustomerAddressStreet.grabFocus();
        }
    }//GEN-LAST:event_txtCustomerNameKeyReleased

    private void txtCustomerAddressStreetKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerAddressStreetKeyReleased
        customer.getAddress().setStreet(txtCustomerAddressStreet.getText().toUpperCase());
        txtCustomerAddressStreet.setText(customer.getAddress().getStreet());
        
        if(evt.getKeyCode() == Keyboard.ENTER.getKey())
            txtCustomerAddressNumber.grabFocus();
    }//GEN-LAST:event_txtCustomerAddressStreetKeyReleased

    private void txtCustomerAddressNumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerAddressNumberKeyReleased
        try {
            customer.getAddress().setNumber(Long.parseLong(txtCustomerAddressNumber.getText()));
            txtCustomerAddressNumber.setText(String.valueOf(customer.getAddress().getNumber()));
        } catch(NumberFormatException error) {
            if(error.getMessage().contains("For input string:"))
                if(txtCustomerAddressNumber.getText().length() > 0)
                    txtCustomerAddressNumber.setText(
                            txtCustomerAddressNumber.getText().substring(
                                    0, txtCustomerAddressNumber.getText().length() - 1
                            )
                    );
        }
        
        if(evt.getKeyCode() == Keyboard.ENTER.getKey())
            txtCustomerNeighbourhood.grabFocus();
    }//GEN-LAST:event_txtCustomerAddressNumberKeyReleased

    private void txtCustomerNeighbourhoodKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNeighbourhoodKeyReleased
        customer.getAddress().setNeighbourhood(txtCustomerNeighbourhood.getText().toUpperCase());
        txtCustomerNeighbourhood.setText(customer.getAddress().getNeighbourhood());
        
        if(evt.getKeyCode() == Keyboard.ENTER.getKey())
            txtCustomerPhone.grabFocus();
    }//GEN-LAST:event_txtCustomerNeighbourhoodKeyReleased

    private void txtCustomerPhoneKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerPhoneKeyReleased
        validateCustomerPhoneField();
        
        try {
            customer.getContact().setPhone(
                    Long.parseLong(txtCustomerPhone.getText().
                            replaceAll("[()]", "").
                            replaceAll("-", "").
                            replaceAll(" ", ""))
                    );
            
            if(evt.getKeyCode() == Keyboard.ENTER.getKey())
                txtCustomerMail.grabFocus();
        } catch(NumberFormatException error) {
            if(error.getMessage().contains("For input string")) {
                txtCustomerPhone.setBackground(Color.PINK);
                txtCustomerPhone.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                lblCustomerPhoneError.setVisible(true);
            }
        }
    }//GEN-LAST:event_txtCustomerPhoneKeyReleased

    private void txtCustomerMailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerMailKeyReleased
        customer.getContact().setMail(txtCustomerMail.getText());
        txtCustomerMail.setText(customer.getContact().getMail());
        
        if(evt.getKeyCode() == Keyboard.ENTER.getKey())
            addCustomer();
    }//GEN-LAST:event_txtCustomerMailKeyReleased

    private void tableCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableCustomerMouseClicked
        removeErrorValidations(txtCustomerName);
        removeErrorValidations(txtCustomerPhone);
        
        int column = tableCustomer.getSelectedColumn();
        int row = tableCustomer.getSelectedRow();
        
        customer = (Customer) tableModel.getValueAt(row, column);
        customer = customerFacade.findById(customer.getId());
        
        if(customer != null)
            editCustomer(customer);
    }//GEN-LAST:event_tableCustomerMouseClicked

    private void tableCustomerKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableCustomerKeyReleased
        removeErrorValidations(txtCustomerName);
        removeErrorValidations(txtCustomerPhone);
        
        int column = tableCustomer.getSelectedColumn();
        int row = tableCustomer.getSelectedRow();
        
        customer = (Customer) tableModel.getValueAt(row, column);
        
        if(customer != null)
            editCustomer(customer);
    }//GEN-LAST:event_tableCustomerKeyReleased

    private void btnCustomerDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerDeleteActionPerformed
        removeCustomer(customer);
    }//GEN-LAST:event_btnCustomerDeleteActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        btnCustomerSave.grabFocus();
        opened = true;
    }//GEN-LAST:event_formComponentShown

    private void txtCustomerNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCustomerNameKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerNameKeyPressed
    
    private boolean validateCustomerNameField() {
        if(border == null)
            border = txtCustomerName.getBorder();
                
        if((customer.getName().isEmpty()) || (customer.getName().equals(""))) {
            if(typing) {
                txtCustomerName.setBackground(Color.PINK);
                txtCustomerName.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
                lblCustomerNameError.setVisible(true);
                
                return false;
            }
        } else {
            txtCustomerName.setBackground(Color.WHITE);
            txtCustomerName.setBorder(border);
            lblCustomerNameError.setVisible(false);
        }
        
        return true;
    }
    
    private boolean validateCustomerPhoneField() {
        if(border == null)
            border = txtCustomerName.getBorder();
        
        if(txtCustomerPhone.getText().contains("(   )") || txtCustomerPhone.getText().contains("(  )")) {
            txtCustomerPhone.setBackground(Color.PINK);
            txtCustomerPhone.setBorder(BorderFactory.createLineBorder(Color.decode("#FF0000")));
            lblCustomerPhoneError.setVisible(true);
            
            return false;
        } else {
            txtCustomerPhone.setBackground(Color.WHITE);
            txtCustomerPhone.setBorder(border);
            lblCustomerPhoneError.setVisible(false);
            
            return true;
        }
    }
    
    private void addCustomer() {
        typing = true;
        
        boolean customerNameFieldValidation = validateCustomerNameField();
        boolean customerPhoneFieldValidation = validateCustomerPhoneField();

        if((customerNameFieldValidation) && (customerPhoneFieldValidation)) {
            if(!editing) {
                try {
                    Bootstrap.entityManager.getTransaction().begin();
                    Bootstrap.entityManager.persist(customer);
                    Bootstrap.entityManager.getTransaction().commit();
                    
                    tableModel.add(customer);
                    Bootstrap.customers.add(customer);

                    customer = new Customer();
                    customer.setName("");

                    Address address = new Address();
                    Contact contact = new Contact();

                    customer.setAddress(address);
                    customer.setContact(contact);

                    clearFields();
                    txtCustomerName.grabFocus();
                } catch(Exception error) {
                    Bootstrap.entityManager.getTransaction().rollback();
                    //TO-DO
                }
            } else {
                try {
                    Bootstrap.entityManager.getTransaction().begin();
                    customerFacade.merge(customer);
                    Bootstrap.entityManager.getTransaction().commit();
                    
                    Bootstrap.customers.add(customer);
                    tableModel.fireTableDataChanged();
                    editing = false;

                    this.customer = new Customer();
                    this.customer.setName("");

                    Address address = new Address();
                    Contact contact = new Contact();

                    this.customer.setAddress(address);
                    this.customer.setContact(contact);

                    clearFields();
                    txtCustomerName.grabFocus();
                } catch(Exception error) {
                    Bootstrap.entityManager.getTransaction().rollback();
                    //TO-DO
                }
            }
        }
    }
    
    private void clearFields() {
        txtCustomerName.setText("");
        txtCustomerAddressStreet.setText("");
        txtCustomerAddressNumber.setText("");
        txtCustomerNeighbourhood.setText("");
        txtCustomerPhone.setText("");
        txtCustomerMail.setText("");
    }
    
    private void editCustomer(Customer customer) {
        Bootstrap.customers.remove(customer);
        
        txtCustomerName.setText(customer.getName());
        
        if(customer.getAddress() != null) {
            txtCustomerAddressStreet.setText(customer.getAddress().getStreet());
            txtCustomerAddressNumber.setText(String.valueOf(customer.getAddress().getNumber()));
            txtCustomerNeighbourhood.setText(customer.getAddress().getNeighbourhood());
        }
        
        if(customer.getContact() != null) {
            txtCustomerPhone.setText(String.valueOf(customer.getContact().getPhone()));
            txtCustomerMail.setText(customer.getContact().getMail());
        }
        
        btnCustomerDelete.setEnabled(true);
        editing = true;
    }
    
    private void removeErrorValidations(JTextField textfield) {
        textfield.setBackground(Color.WHITE);
        textfield.setBorder(txtCustomerMail.getBorder());
        lblCustomerNameError.setVisible(false);
        lblCustomerPhoneError.setVisible(false);
    }
    
    private void removeCustomer(Customer customer) {
        int question = JOptionPane.showConfirmDialog(
                            null, 
                            Bootstrap.bundle.getString("FrmCustomer.removeCustomer.confirmText"), 
                            Bootstrap.bundle.getString("FrmCustomer.removeCustomer.confirmTitle"), 
                            JOptionPane.YES_NO_OPTION, 
                            JOptionPane.QUESTION_MESSAGE
                        );
        
        if(question == 0) {
            Bootstrap.entityManager.getTransaction().begin();

            try {
                customerFacade.remove(customer);
                Bootstrap.entityManager.getTransaction().commit();

                Bootstrap.customers.remove(customer);
                tableModel.removeRow(customer);

                editing = false;
                btnCustomerDelete.setEnabled(false);

                customer = new Customer();
                customer.setName("");

                Address address = new Address();
                Contact contact = new Contact();

                customer.setAddress(address);
                customer.setContact(contact);

                clearFields();
                txtCustomerName.grabFocus();          
            } catch(Exception error) {
                Bootstrap.entityManager.getTransaction().rollback();
                //TO-DO
            }
        }
    }
    
    //<editor-fold defaultstate="collapsed" desc="Variables">
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCustomerDelete;
    private javax.swing.JButton btnCustomerSave;
    private javax.swing.JLabel lblCustomerAddressNumber;
    private javax.swing.JLabel lblCustomerMail;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerNameError;
    private javax.swing.JLabel lblCustomerNeighbourhood;
    private javax.swing.JLabel lblCustomerPhone;
    private javax.swing.JLabel lblCustomerPhoneError;
    private javax.swing.JLabel lblCustomerStreet;
    private javax.swing.JPanel panelForm;
    private javax.swing.JPanel panelList;
    private javax.swing.JScrollPane scrollPaneCustomer;
    private javax.swing.JTable tableCustomer;
    private javax.swing.JTextField txtCustomerAddressNumber;
    private javax.swing.JTextField txtCustomerAddressStreet;
    private javax.swing.JTextField txtCustomerMail;
    private javax.swing.JTextField txtCustomerName;
    private javax.swing.JTextField txtCustomerNeighbourhood;
    private javax.swing.JFormattedTextField txtCustomerPhone;
    // End of variables declaration//GEN-END:variables
    //</editor-fold>
}
