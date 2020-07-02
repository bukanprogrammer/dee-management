package com.dedeirwanto.app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class TransaksiDao {
    
    private Connection koneksi;
    
    private void connect() {
        try {
            String dbDriver = "org.mariadb.jdbc.Driver";
            String dbUrl = "jdbc:mariadb://localhost/dmdb";
            String dbUsername = "root";
            String dbPassword = "kotamobagu";
            
            Class.forName(dbDriver);
            koneksi = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        } catch(ClassNotFoundException | SQLException ex) {
            Logger.getLogger(TransaksiDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private void disconnect() {
        try {
            koneksi.close();
        } catch (SQLException ex) {
            Logger.getLogger(TransaksiDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addTransaksi(Date tglTransaksi, Integer jnsTransaksi, String nmlTransaksi, String ketTransaksi) {
        try {
            connect();
            String sql = "INSERT INTO transaksi(id, tanggal, jenis, nominal, keterangan) VALUES(null, ?, ?, ?, ?)";
            PreparedStatement statement = koneksi.prepareStatement(sql);
            statement.setDate(1, new java.sql.Date(tglTransaksi.getTime()));
            statement.setInt(2, jnsTransaksi);
            statement.setString(3, nmlTransaksi);
            statement.setString(4, ketTransaksi);
            
            statement.executeUpdate();
            
            disconnect();
            
        } catch(SQLException ex) {
            Logger.getLogger(TransaksiDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public List<Transaksi> showAllTransaksi() {
        List<Transaksi> hasil = new ArrayList<Transaksi>();
        
        try {
            String sql = "SELECT * FROM transaksi ORDER BY id DESC";
            
            connect();
            ResultSet rs = koneksi.prepareStatement(sql).executeQuery();
            
            while(rs.next()) {
                Transaksi t = konversiResultSetJadiTransaksi(rs);
                hasil.add(t);
            }
            disconnect();
        } catch(SQLException ex) {
            Logger.getLogger(TransaksiDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return hasil;
    }

    private Transaksi konversiResultSetJadiTransaksi(ResultSet rs) throws SQLException {
        Transaksi t = new Transaksi();
        
        t.setId(rs.getInt("id"));
        t.setTanggal(new Date(rs.getDate("tanggal").getTime()));
        t.setJenis(rs.getInt("jenis"));
        t.setNominal(rs.getString("nominal"));
        t.setKeterangan(rs.getString("keterangan"));
        return t;
    }
}
