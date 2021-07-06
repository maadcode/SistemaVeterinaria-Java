
package dao;

import interfaces.ICRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.AdopcionesModel;
import services.BD;

public class AdopcionesDAO implements ICRUD {
    
    private Connection dbConnection = null;
    private String sql = null;
    private Statement dbQ;
    public AdopcionesModel adopcionModel;

    public AdopcionesDAO() {
    }

    public AdopcionesDAO(AdopcionesModel adopcionModel) {
        this.adopcionModel = adopcionModel;
        this.dbConnection = new BD().getConnection();
        try {
            this.dbQ = this.dbConnection.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void create() {
        PreparedStatement ps;
        try {
            sql = "INSERT INTO Adopciones(idAdoptante, idMascota, fechaAdop)"+
                "VALUES(?, ?, CURDATE())";
            ps = this.dbConnection.prepareStatement(sql);
            
            ps.setInt(1, this.adopcionModel.getIdAdoptante());
            ps.setInt(2, this.adopcionModel.getIdMascota());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public ResultSet read() {
        ResultSet rs = null;
        try {
            sql = "SELECT * FROM Adopciones";
            rs = this.dbQ.executeQuery(sql);
            return rs;
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
    }

    @Override
    public void update(String id) {
        PreparedStatement ps;
        try {
            sql = "UPDATE Adopciones SET idAdoptante = ?, idMascota = ?, fechaAdop = ? WHERE idAdopcion = "+id;
            ps = this.dbConnection.prepareStatement(sql);
            
            ps.setInt(1, this.adopcionModel.getIdAdoptante());
            ps.setInt(2, this.adopcionModel.getIdMascota());
            ps.setString(3, this.adopcionModel.getFechaAdop());
            
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    @Override
    public void delete(String id) {
        PreparedStatement ps;
        try {
            sql = "DELETE FROM Adopciones WHERE idAdopcion = "+id;
            ps = this.dbConnection.prepareStatement(sql);
            ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionesDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<AdopcionesModel> getListaAdopciones() {
        ArrayList<AdopcionesModel> listaAdopciones = new ArrayList<>();
        
        try {
            ResultSet rs = read();
            AdopcionesModel adopcion;
            
            while(rs.next()) {
                adopcion = new AdopcionesModel(rs.getInt("idAdopcion"), rs.getInt("idMascota"), rs.getInt("idAdoptante"), rs.getString("fechaAdop"));
                listaAdopciones.add(adopcion);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return listaAdopciones;
    }
    
    public AdopcionesModel getAdopcion(String id) {
        AdopcionesModel adopcion = null;
        PreparedStatement ps;
        try {
            sql = "SELECT * FROM Adopciones WHERE idAdopcion = ?";
            ps = this.dbConnection.prepareStatement(sql);
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                adopcion = new AdopcionesModel();
                adopcion.setIdAdopcion(rs.getInt("idAdoptante"));
                adopcion.setIdMascota(rs.getInt("idMascota"));
                adopcion.setIdAdoptante(rs.getInt("idAdoptante"));
                adopcion.setFechaAdop(rs.getString("fechaAdop"));
            }
            return adopcion;
        } catch (SQLException ex) {
            Logger.getLogger(AdoptanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adopcion;
    }
    
    public ArrayList<AdopcionesModel> getListaAdopcionesRecientes() {
        ArrayList<AdopcionesModel> listaAdopciones = new ArrayList<>();
        
        try {
            sql = "SELECT * FROM Adopciones WHERE MONTH(fechaAdop) = MONTH(CURRENT_DATE())";
            ResultSet rs = this.dbQ.executeQuery(sql);
            AdopcionesModel adopcion;
            
            while(rs.next()) {
                adopcion = new AdopcionesModel(rs.getInt("idAdopcion"), rs.getInt("idAdoptante"), rs.getInt("idMascota"), rs.getString("fechaAdop"));
                listaAdopciones.add(adopcion);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return listaAdopciones;
    }
    
    public int getAdopcionesMensual() {
        int cantidad = 0;
        
        try {
            sql = "SELECT COUNT(*) FROM Adopciones WHERE MONTH(fechaAdop) = MONTH(CURRENT_DATE())";
            ResultSet rs = this.dbQ.executeQuery(sql);
            if(rs.next()) {
                cantidad = rs.getInt(1);
            }
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return cantidad;
    }
    
}
