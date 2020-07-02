package com.dedeirwanto.app;

import java.util.List;
import javax.swing.table.AbstractTableModel;

public class TransaksiTableModel extends AbstractTableModel {

    private List<Transaksi> dataTransaksi;
    
    public TransaksiTableModel(List<Transaksi> dataTransaksi) {
        this.dataTransaksi = dataTransaksi;
    }
    
    @Override
    public int getRowCount() {
        return dataTransaksi.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int baris, int kolom) {
        Transaksi t = dataTransaksi.get(baris);
        
        if(kolom == 0) {
            return t.getTanggal();
        }
        if(kolom == 1) {
            return t.getJenis();
        }
        if(kolom == 2) {
            return t.getNominal();
        }        
        if(kolom == 3) {
            return t.getKeterangan();
        }        
        return "undefined";
    }
    
    @Override
    public String getColumnName(int kolom) {
        if(kolom == 0) {
            return "Tanggal";
        }
        if(kolom == 1) {
            return "Jenis";
        }
        if(kolom == 2) {
            return "Nominal";
        }        
        if(kolom == 3) {
            return "Keterangan";
        }        
        return "undefined";        
    }
    
}
