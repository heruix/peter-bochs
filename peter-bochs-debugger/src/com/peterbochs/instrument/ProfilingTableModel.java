package com.peterbochs.instrument;

import java.text.DecimalFormat;
import java.util.TreeSet;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class ProfilingTableModel extends DefaultTableModel {
	String columnNames[] = { "From", "To", "Hit", "No of addr", "Address" };
	Vector<Long> fromAddresses = new Vector<Long>();
	Vector<Long> toAddresses = new Vector<Long>();
	Vector<Long> hitCounts = new Vector<Long>();
	Vector<TreeSet<Long>> hitAddresses = new Vector<TreeSet<Long>>();
	DecimalFormat decimalFormatter = new DecimalFormat("###,###,###,###");

	public boolean needToTellBochsToUpdateZone = false;

	public void addZone(long fromAddress, long toAddress) {
		if (fromAddress >= 0 && toAddress >= 0) {
			fromAddresses.add(fromAddress);
			toAddresses.add(toAddress);
			hitCounts.add(0l);
			hitAddresses.add(new TreeSet<Long>());

			needToTellBochsToUpdateZone = true;
			this.fireTableDataChanged();
		}
	}

	public String getColumnName(int column) {
		return columnNames[column];
	}

	public int getColumnCount() {
		return columnNames.length;
	}

	public int getRowCount() {
		try {
			return fromAddresses.size();
		} catch (Exception ex) {
			return 0;
		}
	}

	public void setValueAt(Object aValue, int row, int column) {
		if (column == 0) {
			fromAddresses.set(row, (Long) aValue);
		} else if (column == 1) {
			toAddresses.set(row, (Long) aValue);
		} else if (column == 2) {
			hitCounts.set(row, (Long) aValue);
		} else if (column == 3) {
		} else if (column == 4) {
			hitAddresses.set(row, (TreeSet<Long>) aValue);
		}
		this.fireTableDataChanged();
	}

	public Object getValueAt(int row, int column) {
		if (column == 0) {
			return "0x" + Long.toHexString(fromAddresses.get(row));
		} else if (column == 1) {
			return "0x" + Long.toHexString(toAddresses.get(row));
		} else if (column == 2) {
			return decimalFormatter.format(hitCounts.get(row));
		} else if (column == 3) {
			return hitAddresses.get(row).size();
		} else if (column == 4) {
			String str = "";
			for (int x = 0; x < hitAddresses.get(row).size(); x++) {
				str += "0x" + Long.toHexString((Long) hitAddresses.get(row).toArray()[x]) + ":";
			}
			return str;
		} else {
			return "";
		}
	}

	public void addHitAddress(int row, long address) {
		hitAddresses.get(row).add(address);
		this.fireTableDataChanged();
	}

	public boolean isCellEditable(int row, int column) {
		return false;
	}

	public void removeAll() {
		fromAddresses.removeAllElements();
		toAddresses.removeAllElements();
		hitCounts.removeAllElements();
		hitAddresses.removeAllElements();
		this.fireTableDataChanged();
	}
}
