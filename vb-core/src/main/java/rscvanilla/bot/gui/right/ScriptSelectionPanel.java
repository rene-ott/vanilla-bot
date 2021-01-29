package rscvanilla.bot.gui.right;

import com.google.common.eventbus.EventBus;
import rscvanilla.bot.gui.events.ScriptSelectedEvent;
import rscvanilla.bot.script.template.RunnableScript;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.util.List;

public class ScriptSelectionPanel extends JPanel implements ListSelectionListener {

    private final JList<Class<? extends RunnableScript>> scriptSelectionList;
    private final EventBus eventBus;

    public static int WIDTH = 175;

    public ScriptSelectionPanel(EventBus eventBus) {
        this.eventBus = eventBus;
        this.scriptSelectionList = createScriptNameList();

        scriptSelectionList.addListSelectionListener(this);

        setPreferredSize(new Dimension(60, 200));

        eventBus.register(this);
    }

    @Override
    public void setLayout(LayoutManager mgr) {
        super.setLayout(new BorderLayout());
    }

    @Override
    public void setBorder(Border border) {
        var margin = BorderFactory.createEmptyBorder(10, 10, 10, 10);
        var color = BorderFactory.createLineBorder(Color.black);

        super.setBorder(new CompoundBorder(margin, color));
    }

    private JList<Class<? extends RunnableScript>> createScriptNameList() {
        var list = new JList<>(new DefaultListModel<Class<? extends RunnableScript>>());
        list.setSelectionMode(DefaultListSelectionModel.SINGLE_SELECTION);
        list.setCellRenderer(createCellRenderer());

        add(list, BorderLayout.CENTER);

        var scrollPane = new JScrollPane(list);
        add(scrollPane);

        return list;
    }

    private DefaultListCellRenderer createCellRenderer() {
        return new DefaultListCellRenderer() {
            @Override
            public Component getListCellRendererComponent(JList<?> list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                var renderer = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);

                if (renderer instanceof JLabel && value instanceof Class) {
                    ((JLabel) renderer).setText(((Class<?>) value).getSimpleName());
                }

                return renderer;
            }
        };
    }

    public JList<Class<? extends RunnableScript>> getScriptSelectionList() {
        return scriptSelectionList;
    }

    public void refreshList(List<Class<? extends RunnableScript>> scripts, Class<? extends RunnableScript> selectedScript) {
        scriptSelectionList.setModel(convertToListModel(scripts));

        if (scripts.size() > 0) {
            scriptSelectionList.setSelectedIndex(0);
            scriptSelectionList.setSelectedValue(scripts.get(0), false);
        }

        scriptSelectionList.setEnabled(!scripts.isEmpty());

        if (selectedScript != null) {
            scriptSelectionList.setSelectedIndex(scripts.indexOf(selectedScript));
        }
    }

    private static ListModel<Class<? extends RunnableScript>> convertToListModel(List<Class<? extends RunnableScript>> scripts) {
        var listModel = new DefaultListModel<Class<? extends RunnableScript>>();
        scripts.forEach(listModel::addElement);
        return listModel;
    }

    @Override
    public void valueChanged(ListSelectionEvent e) {
        var selectedValue = ((JList)e.getSource()).getSelectedValue();

        eventBus.post(new ScriptSelectedEvent((Class<? extends RunnableScript>) selectedValue));
    }
}
