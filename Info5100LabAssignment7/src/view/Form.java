/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package view;


import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.UserModel;

public class Form extends javax.swing.JPanel {
 JPanel bottomPanel;
    ImageIcon picture;
  
    public Form() {
        initComponents();
    }
    public Form(JPanel bottomPanel, UserModel selectedUser) {
        initComponents();
        this.bottomPanel = bottomPanel;
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        registrationTitleLable = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        nameLable = new javax.swing.JLabel();
        collageNameLabel = new javax.swing.JLabel();
        submitButton = new javax.swing.JButton();
        collegeComboBox = new javax.swing.JComboBox<>();
        ageLabel = new javax.swing.JLabel();
        ageTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        hobbiesTextArea1 = new javax.swing.JTextArea();
        hobbiesLabel = new javax.swing.JLabel();
        imageButton = new javax.swing.JButton();
        uploadImageLabel = new javax.swing.JLabel();
        imgLabel = new javax.swing.JLabel();
        dobDateChooser = new com.toedter.calendar.JDateChooser();
        dobLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(192,192,192));

        registrationTitleLable.setBackground(new java.awt.Color(255, 255, 255));
        registrationTitleLable.setFont(new java.awt.Font("Arial", 3, 24)); // NOI18N
        registrationTitleLable.setForeground(new java.awt.Color(255, 255, 255));
        registrationTitleLable.setText("Registration");

        nameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTextFieldActionPerformed(evt);
            }
        });

        nameLable.setText("Name (first name & Last name) ");

        collageNameLabel.setText("College");

        submitButton.setBackground(new java.awt.Color(0, 255, 0));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        collegeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CPS", "COE", "CSS" }));
        collegeComboBox.setSelectedIndex(-1);
        collegeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collegeComboBoxActionPerformed(evt);
            }
        });

        ageLabel.setText("Age");

        hobbiesTextArea1.setColumns(20);
        hobbiesTextArea1.setRows(5);
        jScrollPane1.setViewportView(hobbiesTextArea1);

        hobbiesLabel.setText("Hobbies");

        imageButton.setText("Select Image");
        imageButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imageButtonActionPerformed(evt);
            }
        });

        uploadImageLabel.setText("Upload Image");

        dobDateChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        dobLabel.setText("Date of Birth");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(submitButton)
                .addGap(50, 50, 50))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(117, 117, 117)
                        .addComponent(registrationTitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(30, 30, 30)
                            .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(21, 21, 21)
                            .addComponent(uploadImageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(82, 82, 82)
                            .addComponent(imageButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(hobbiesLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(collageNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(nameLable, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(ageTextField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(collegeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addComponent(dobLabel)
                                .addGap(73, 73, 73)
                                .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(registrationTitleLable, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nameLable)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(1, 1, 1)
                            .addComponent(dobDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(dobLabel)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collageNameLabel)
                    .addComponent(collegeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(hobbiesLabel))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(imageButton)
                            .addComponent(uploadImageLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(submitButton)
                        .addGap(14, 14, 14))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                        .addComponent(imgLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
    }// </editor-fold>

    private void nameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {
        
    }
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {
    try {
        UserModel userObject = new UserModel();
        userObject.setName(this.nameTextField.getText());
        userObject.setGender(this.collegeComboBox.getSelectedItem().toString());
        userObject.setAge(Integer.parseInt(this.ageTextField.getText()));
        userObject.setHobby(this.hobbiesTextArea1.getText());
        userObject.setPicture(this.picture);
        userObject.setDob(this.dobDateChooser.getDate());

        if (userObject.getName().isBlank()) {
            JOptionPane.showMessageDialog(this, "Enter your name.", "Oops!", HEIGHT);
            return;
        }

        // Convert to database-compatible User
        model.UserModel dbUser = new model.UserModel();
        dbUser.setName(userObject.getName());
        dbUser.setCollege(userObject.getGender());
        dbUser.setAge(userObject.getAge());
        dbUser.setHobby(userObject.getHobby());
        // dbUser.setDob(userObject.getDob()); // if you add DOB in DB later

        // Save to DB
        utility.DatabaseConnector.addUser(dbUser);

        // Confirmation dialog
        JOptionPane.showMessageDialog(this, "Student added to database!", "Success", HEIGHT, this.picture);

        // Switch to View panel
        View viewJPanelObject = new View();  // no args
        this.bottomPanel.add(viewJPanelObject);
        CardLayout layout = (CardLayout) this.bottomPanel.getLayout();
        layout.next(bottomPanel);

    } catch (NullPointerException ne) {
        JOptionPane.showMessageDialog(this, "Select gender.", "Oops!", HEIGHT);
        ne.printStackTrace();
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Enter age correctly.", "Oops!", HEIGHT);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Oops, something went wrong!", "Failed!", HEIGHT);
        e.printStackTrace();
    }
}


    private void collegeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void imageButtonActionPerformed(java.awt.event.ActionEvent evt) {       
    JFileChooser file = new JFileChooser();
    if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
        try {
            BufferedImage img = ImageIO.read(file.getSelectedFile());
            Image edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
            if (edited_image != null) {
                this.picture = new ImageIcon(edited_image);
                imgLabel.setIcon(picture);

              
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Upload correct Image", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
    }
    
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel collageNameLabel;
    private javax.swing.JComboBox<String> collegeComboBox;
    private com.toedter.calendar.JDateChooser dobDateChooser;
    private javax.swing.JLabel dobLabel;
    private javax.swing.JLabel hobbiesLabel;
    private javax.swing.JTextArea hobbiesTextArea1;
    private javax.swing.JButton imageButton;
    private javax.swing.JLabel imgLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLable;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel registrationTitleLable;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel uploadImageLabel;
}