package rscvanilla.bot.gui.bottom;

import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;

public class PrinterTabPanel extends JPanel {

    private JTextArea textArea;
    private JScrollPane scrollPane;

    public PrinterTabPanel() {
        textArea = createLogOutputTextArea();
        scrollPane = createScrollPane();
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new GridLayout(1, 1));
    }

    private JTextArea createLogOutputTextArea() {
        var textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setEditable(false);

        return textArea;
    }

    private JScrollPane createScrollPane() {
        var scrollPane = new JScrollPane(textArea);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(scrollPane);

        return scrollPane;
    }

    public void appendText(String s) {
        var text = s + "\n";
        if (StringUtils.isEmpty(textArea.getText())) {
            textArea.setText(text);
        } else {
            textArea.append(text);
        }

        scrollToBottom();
    }

    private void scrollToBottom() {
        var vertical = scrollPane.getVerticalScrollBar();
        vertical.setValue(vertical.getMaximum());
    }
}
