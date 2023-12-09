package examendiciembre;

import javax.swing.table.DefaultTableModel;

public class TablaCustom extends DefaultTableModel {

    public TablaCustom(Object[] columnNames, int rowCount) {
        super(columnNames, rowCount);
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return switch (columnIndex) {
            case 2 ->
                Integer.class;
            case 4 ->
                Boolean.class;
            default ->
                String.class;
        };
    }

    @Override
    public boolean isCellEditable(int row, int column) {
        return column == 4;
    }
}
