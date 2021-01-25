package scripts;

import com.rscvanilla.bot.script.ScriptDependencyContext;
import com.rscvanilla.bot.script.antiban.ScriptAntiBanParams;
import com.rscvanilla.bot.script.template.RunnableScript;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class WalkPathGenerator extends RunnableScript {

    public WalkPathGenerator(ScriptDependencyContext dependencyContext, ScriptAntiBanParams argumentContext) {
        super(dependencyContext, argumentContext);
    }

    @Override
    protected void onStart() {
        super.onStart();

        var frame = new GeneratorGUI("Walk Path Generator", Thread.currentThread());
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    @Override
    protected void loop() { }

    private class GeneratorGUI extends JFrame implements ActionListener {
        private JPanel panel;

        private JButton button;
        private JTextArea textArea;
        private JScrollPane scrollPane;
        Thread currentThread;

        public GeneratorGUI(String name, Thread currentThread) {
            super(name);

            this.currentThread = currentThread;
            panel = createPanel();
            button = createButton();
            textArea = createTextArea();
            scrollPane = createScrollPane();

            setPreferredSize(new Dimension(200, 500));
            setResizable(false);

            addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    currentThread.interrupt();
                    super.windowClosing(e);
                }
            });
        }

        private JPanel createPanel() {
            var panel = new JPanel();
            panel.setLayout(new BorderLayout());

            add(panel);
            return panel;
        }

        private JButton createButton() {
            var button = new JButton("Add");
            panel.add(button, BorderLayout.SOUTH);
            button.addActionListener(this);

            return button;
        }

        private JTextArea createTextArea() {
            var textArea = new JTextArea();
            textArea.setLineWrap(true);
            textArea.setWrapStyleWord(true);
            textArea.setEditable(true);

            return textArea;
        }

        private JScrollPane createScrollPane() {
            var scrollPane = new JScrollPane(textArea);
            scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);
            scrollPane.setBackground(Color.BLACK);
            panel.add(scrollPane, BorderLayout.CENTER);

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

        @Override
        public void actionPerformed(ActionEvent e) {
            var text = "walkTo" + getPosition() + ";";
            appendText(text);
        }
    }
}

