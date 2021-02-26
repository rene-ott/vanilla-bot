package rscvanilla.bot.gui.right.ignoredplayers;

import rscvanilla.bot.gui.right.ignoredplayers.listeners.IgnoredPlayersSaveButtonClickedListener;

import javax.swing.*;
import javax.swing.border.CompoundBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SuppressWarnings("serial")
public class IgnoredPlayersDialog extends JDialog implements ActionListener {

    private final IgnoredPlayersSaveButtonClickedListener saveButtonClickedListener;

    private final DefaultListModel<String> userNameListModel;
    private final JList<String> usernameList;

    private final JPanel inputPanel;
    private JButton inputAddUsernameButton;
    private final JTextField inputUsernameTextField;

    private JButton saveButton;

    public IgnoredPlayersDialog(JFrame frame,
                                List<String> ignoredUsers,
                                IgnoredPlayersSaveButtonClickedListener saveButtonClickedListener
    ) {
        super(frame, "Ignored players", ModalityType.APPLICATION_MODAL);
        this.saveButtonClickedListener = saveButtonClickedListener;

        userNameListModel = new DefaultListModel<>();
        userNameListModel.addAll(ignoredUsers);

        usernameList = createList(userNameListModel);

        inputAddUsernameButton = createInputAddUsernameButton();
        inputUsernameTextField = createInputUsernameTextField();

        inputPanel = createInputPanel(inputUsernameTextField, inputAddUsernameButton);
        saveButton = createSaveButton();

        setResizable(false);
        setPreferredSize(new Dimension(300, 200));
        setLocationRelativeTo(frame);

        pack();
        setVisible(true);
    }

    @Override
    public void setLayout(LayoutManager manager) {
        super.setLayout(new BorderLayout());
    }

    private JPanel createInputPanel(JTextField usernameTextField, JButton addUsernameButton) {
        var p = new JPanel();
        p.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        p.setPreferredSize(new Dimension(130, p.getHeight()));
        p.setLayout(new GridLayout(4, 0, 5, 5));

        p.add(new JLabel("Username:"));
        p.add(usernameTextField);
        p.add(addUsernameButton);

        add(p, BorderLayout.CENTER);

        return inputPanel;
    }

    private JButton createInputAddUsernameButton() {
        var button = new JButton("Add");
        button.addActionListener(this);

        return button;
    }

    private JTextField createInputUsernameTextField() {
        return new JTextField("");
    }

    private JList<String> createList(ListModel<String> listModel) {
        var list = new JList<>(listModel);
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);

        list.setBorder(createListBorder());

        list.addKeyListener(new KeyListener() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_DELETE) {
                    userNameListModel.remove(usernameList.getSelectedIndex());
                    usernameList.revalidate();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) { }
            @Override
            public void keyTyped(KeyEvent e) { }
        });

        var scrollPane = new JScrollPane(list);
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        scrollPane.setPreferredSize(new Dimension(130, scrollPane.getHeight()));

        add(scrollPane, BorderLayout.EAST);

        return list;
    }

    private CompoundBorder createListBorder() {
        var margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        var color = BorderFactory.createLineBorder(Color.black);
        return new CompoundBorder(margin, color);
    }

    private JButton createSaveButton() {
        var button = new JButton("Update");
        var panel = new JPanel();
        panel.add(button);

        button.addActionListener(this);
        add(panel, BorderLayout.SOUTH);

        return button;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        var command = e.getActionCommand();
        if (command.equals("Update")) {
            saveButtonClickedListener.onSave(Collections.list(userNameListModel.elements()));
            dispose();
        }

        if (command.equals("Add")) {
            userNameListModel.addElement(inputUsernameTextField.getText());
            inputUsernameTextField.setText("");
            usernameList.updateUI();
        }
    }
}
