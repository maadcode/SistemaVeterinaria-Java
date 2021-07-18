
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import dto.AdopcionDTO;
import services.BD;

public class AdopcionDAO {
    
    private Connection dbConnection = null;

    public AdopcionDAO() {
        this.dbConnection = new BD().getConnection();
    }

    public void create(AdopcionDTO adopcion) {
        PreparedStatement ps;
        try {
            /*
                SELECT Adopciones.idAdopcion, Adoptantes.nombreAdoptante, Mascotas.nombreMascota, Adopciones.fechaAdop FROM Adopciones
                INNER JOIN Adoptantes ON Adopciones.idAdoptante = Adoptantes.idAdoptante
                INNER JOIN Mascotas ON Adopciones.idMascota = Mascotas.idMascota
            */
            String sql = "INSERT INTO Adopciones(idAdoptante, idMascota, fechaAdop)"+
                "VALUES(?, ?, CURDATE())";
            ps = this.dbConnection.prepareStatement(sql);
            
            ps.setInt(1, adopcion.getIdAdoptante());
            ps.setInt(2, adopcion.getIdMascota());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<AdopcionDTO> read() {
        ArrayList<AdopcionDTO> listaAdopciones = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            String sql = "SELECT * FROM Adopciones";
            st = this.dbConnection.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                AdopcionDTO adopcion = new AdopcionDTO(rs.getInt("idAdopcion"), rs.getInt("idMascota"), rs.getInt("idAdoptante"), rs.getString("fechaAdop"));
                listaAdopciones.add(adopcion);
            }
            rs.close();
            st.close();
            return listaAdopciones;
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaAdopciones;
    }

    public void update(AdopcionDTO adopcion) {
        PreparedStatement ps;
        try {
            String sql = "UPDATE Adopciones SET idAdoptante = ?, idMascota = ?, fechaAdop = ? WHERE idAdopcion = ?";
            ps = this.dbConnection.prepareStatement(sql);
            
            ps.setInt(1, adopcion.getIdAdoptante());
            ps.setInt(2, adopcion.getIdMascota());
            ps.setString(3, adopcion.getFechaAdop());
            ps.setInt(4, adopcion.getIdAdopcion());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void delete(int id) {
        PreparedStatement ps;
        try {
            String sql = "DELETE FROM Adopciones WHERE idAdopcion = ?";
            ps = this.dbConnection.prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            Logger.getLogger(AdopcionDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public AdopcionDTO getAdopcion(int id) {
        AdopcionDTO adopcion = null;
        PreparedStatement ps;
        ResultSet rs;
        try {
            String sql = "SELECT * FROM Adopciones WHERE idAdopcion = ?";
            ps = this.dbConnection.prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            if(rs.next()) {
                adopcion = new AdopcionDTO(rs.getInt("idAdopcion"), rs.getInt("idMascota"), rs.getInt("idAdoptante"), rs.getString("fechaAdop"));
            }
            rs.close();
            ps.close();
            return adopcion;
        } catch (SQLException ex) {
            Logger.getLogger(AdoptanteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return adopcion;
    }
    
    public ArrayList<AdopcionDTO> getListaAdopcionesRecientes() {
        ArrayList<AdopcionDTO> listaAdopciones = new ArrayList<>();
        Statement st;
        ResultSet rs;
        try {
            String sql = "SELECT * FROM Adopciones WHERE MONTH(fechaAdop) = MONTH(CURRENT_DATE())";
            st = this.dbConnection.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                AdopcionDTO adopcion = new AdopcionDTO(rs.getInt("idAdopcion"), rs.getInt("idAdoptante"), rs.getInt("idMascota"), rs.getString("fechaAdop"));
                listaAdopciones.add(adopcion);
            }
            rs.close();
            st.close();
            return listaAdopciones;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return listaAdopciones;
    }
    
    public int getAdopcionesMensual() {
        int cantidad = 0;
        Statement st;
        ResultSet rs;
        try {
            String sql = "SELECT COUNT(*) FROM Adopciones WHERE MONTH(fechaAdop) = MONTH(CURRENT_DATE())";
            st = this.dbConnection.createStatement();
            rs = st.executeQuery(sql);
            if(rs.next()) {
                cantidad = rs.getInt(1);
            }
            rs.close();
            st.close();
            return cantidad;
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return cantidad;
    }
    
}
