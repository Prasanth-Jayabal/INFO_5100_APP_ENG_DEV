
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.io.*;
import javax.imageio.ImageIO;
import model.User;

public class Info5100LabAssign3 extends JFrame {

    private JTextField firstNameField, lastNameField, ageField, phoneField, emailField;
    private JComboBox<String> genderComboBox;
    private JTextArea hobbiesTextArea;
    private JLabel photoLabel;
    private File selectedPhoto;
    private JButton submitButton, uploadButton;

    public Info5100LabAssign3() {
        setTitle("User Form");
        setSize(400, 650);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(5, 5, 5, 5);
        
     
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("First Name:"), gbc);

        firstNameField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 0;
        add(firstNameField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("Last Name:"), gbc);

        lastNameField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 1;
        add(lastNameField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Gender:"), gbc);

        String[] genders = {"Male", "Female", "Other"};
        genderComboBox = new JComboBox<>(genders);
        gbc.gridx = 1; gbc.gridy = 2;
        add(genderComboBox, gbc);

        
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Age:"), gbc);

        ageField = new JTextField(5);
        gbc.gridx = 1; gbc.gridy = 3;
        add(ageField, gbc);

       
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Phone Number:"), gbc);

        phoneField = new JTextField(10);
        gbc.gridx = 1; gbc.gridy = 4;
        add(phoneField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 5;
        add(new JLabel("Email:"), gbc);

        emailField = new JTextField(20);
        gbc.gridx = 1; gbc.gridy = 5;
        add(emailField, gbc);

        
        gbc.gridx = 0; gbc.gridy = 6;
        add(new JLabel("Hobbies:"), gbc);

        hobbiesTextArea = new JTextArea(5, 20);
        hobbiesTextArea.setLineWrap(true);
        gbc.gridx = 1; gbc.gridy = 6;
        add(new JScrollPane(hobbiesTextArea), gbc);

        
        gbc.gridx = 0; gbc.gridy = 7;
        add(new JLabel("Upload Photo (Optional):"), gbc);

        uploadButton = new JButton("Choose Photo");
        gbc.gridx = 1; gbc.gridy = 7;
        add(uploadButton, gbc);
        photoLabel = new JLabel();
        gbc.gridx = 1; gbc.gridy = 8;
        add(photoLabel, gbc);

        
        submitButton = new JButton("Submit");
        gbc.gridx = 1; gbc.gridy = 9;
        add(submitButton, gbc);

       
        uploadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                uploadPhoto();
            }
        });

        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                submitProfile();
            }
        });

        setVisible(true);
    }

    private void uploadPhoto() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setAcceptAllFileFilterUsed(false);
        fileChooser.addChoosableFileFilter(new FileNameExtensionFilter("Image files", "jpg", "jpeg", "png"));
        int result = fileChooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            selectedPhoto = fileChooser.getSelectedFile();
            try {
                Image img = ImageIO.read(selectedPhoto);
                ImageIcon icon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
                photoLabel.setIcon(icon);
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }

    private void submitProfile() {

        String firstName = firstNameField.getText().trim();
    String lastName = lastNameField.getText().trim();
    String ageText = ageField.getText().trim();
    String phone = phoneField.getText().trim();
    String email = emailField.getText().trim();
    String hobbies = hobbiesTextArea.getText().trim();

    if (firstName.isEmpty() || lastName.isEmpty() || ageText.isEmpty() || phone.isEmpty() || email.isEmpty() || hobbies.isEmpty()) {
        JOptionPane.showMessageDialog(this, "All fields are required except for the photo.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int age = 0;
    try {
        age = Integer.parseInt(ageText);
        if (age < 18 || age > 100) {
            JOptionPane.showMessageDialog(this, "Age must be between 18 and 100.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (NumberFormatException ex) {
        JOptionPane.showMessageDialog(this, "Please enter a valid age.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!phone.matches("\\d{10}")) {
        JOptionPane.showMessageDialog(this, "Phone number must be 10 digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (!email.matches("[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}")) {
        JOptionPane.showMessageDialog(this, "Please enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    User user = new User(firstName, lastName, (String) genderComboBox.getSelectedItem(), age, email, phone, hobbies, selectedPhoto);

    JPanel profilePanel = new JPanel();
    profilePanel.setLayout(new BoxLayout(profilePanel, BoxLayout.Y_AXIS));

    JPanel textPanel = new JPanel();
    textPanel.setLayout(new BoxLayout(textPanel, BoxLayout.Y_AXIS));
    textPanel.add(new JLabel("Name: " + firstName + " " + lastName));
    textPanel.add(new JLabel("Gender: " + user.getGender()));
    textPanel.add(new JLabel("Age: " + age));
    textPanel.add(new JLabel("Phone: " + phone));
    textPanel.add(new JLabel("Email: " + email));
    textPanel.add(new JLabel("Hobbies: " + hobbies));

    profilePanel.add(textPanel);

    if (user.getPhoto() != null) {
        try {
            Image img = ImageIO.read(user.getPhoto());
            ImageIcon imageIcon = new ImageIcon(img.getScaledInstance(100, 100, Image.SCALE_SMOOTH));
            JLabel imageLabel = new JLabel(imageIcon);
            profilePanel.add(imageLabel);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    JOptionPane.showMessageDialog(this, profilePanel, "Profile Information", JOptionPane.INFORMATION_MESSAGE);
}


    public static void main(String[] args) {
        new Info5100LabAssign3();
    }
}
