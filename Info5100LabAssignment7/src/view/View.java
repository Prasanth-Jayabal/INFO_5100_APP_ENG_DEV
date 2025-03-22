package view;

import model.UserModel;
import utility.DatabaseConnector;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class View extends JPanel {

    private JTable studentTable;
    private JScrollPane tableScrollPane;
    private List<UserModel> userList;
    private JButton editButton, deleteButton, submitButton;
    private UserModel selectedUser;
    private JPanel bottomPanel;

    public View() {
        initComponents();
        loadStudentData();
    }

    public View(JPanel bottomPanel) {
        this.bottomPanel = bottomPanel;
        initComponents();
        loadStudentData();
    }

    private void initComponents() {
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        studentTable = new JTable();
        tableScrollPane = new JScrollPane(studentTable);
        studentTable.setFillsViewportHeight(true);

        JPanel buttonPanel = new JPanel();
        editButton = new JButton("Edit");
        deleteButton = new JButton("Delete");
        submitButton = new JButton("Submit");

        buttonPanel.add(editButton);
        buttonPanel.add(deleteButton);
        buttonPanel.add(submitButton);

        add(new JLabel("Student List", SwingConstants.CENTER), BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        studentTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                int selectedRow = studentTable.getSelectedRow();
                if (selectedRow >= 0 && selectedRow < userList.size()) {
                    selectedUser = userList.get(selectedRow);
                }
            }
        });

        editButton.addActionListener(e -> {
            if (selectedUser != null) {
                Form editForm = new Form(bottomPanel, selectedUser);
                bottomPanel.removeAll();
                bottomPanel.add(editForm);
                CardLayout layout = (CardLayout) bottomPanel.getLayout();
                layout.next(bottomPanel);
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to edit.");
            }
        });

        deleteButton.addActionListener(e -> {
            if (selectedUser != null) {
                DatabaseConnector.deleteUser(selectedUser);
                loadStudentData();
                JOptionPane.showMessageDialog(this, "User deleted successfully.");
            } else {
                JOptionPane.showMessageDialog(this, "Please select a row to delete.");
            }
        });

        submitButton.addActionListener(e -> loadStudentData());
    }

    public void loadStudentData() {
        userList = DatabaseConnector.getUsers();
        String[] columnNames = {"Student ID", "First Name", "College", "Age", "Hobbies"};
        Object[][] rowData = new Object[userList.size()][5];

        for (int i = 0; i < userList.size(); i++) {
            UserModel u = userList.get(i);
            rowData[i][0] = u.getUserid();
            rowData[i][1] = u.getName();
            rowData[i][2] = u.getCollege();
            rowData[i][3] = u.getAge();
            rowData[i][4] = u.getHobby();
        }

        studentTable.setModel(new javax.swing.table.DefaultTableModel(rowData, columnNames));
    }
} 