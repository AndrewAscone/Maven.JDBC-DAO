package daos;

import models.BandMember;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class BandMembers implements BandMembersDAO {

    public BandMember findByID(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM BandMembers WHERE id=" + id);

            if(rs.next()){
                return extractBandMemberFromResultSet(rs);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return null;
    }

    public BandMember extractBandMemberFromResultSet(ResultSet rs) throws SQLException {
        BandMember member = new BandMember();

        member.setId(rs.getInt("id"));
        member.setFirstName(rs.getString("first_name"));
        member.setLastName(rs.getString("last_name"));
        member.setBirthYear(rs.getInt("birth_year"));
        member.setInstrument(rs.getString("instrument"));

        return member;
    }

    public List<BandMember> findAll() {
        Connection connection = ConnectionFactory.getConnection();
        try{
            Statement stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM BandMembers");

            List<BandMember> members = new ArrayList<BandMember>();

            while(rs.next()){
                BandMember member = extractBandMemberFromResultSet(rs);
                members.add(member);
            }

            return members;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean update(BandMember dto, int id) {
        Connection connection = ConnectionFactory.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("UPDATE BandMembers SET " +
                    "first_name=?, last_name=?, birth_year=?, instrument=? WHERE id=?");
            ps.setString(1, dto.getFirstName());
            ps.setString(2, dto.getLastName());
            ps.setInt(3, dto.getBirthYear());
            ps.setString(4, dto.getInstrument());
            ps.setInt(5, id);
            int i = ps.executeUpdate();

            if(i == 1){
                System.out.println("Database updated!");
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println("Could not update database!");
        return false;
    }

    public boolean create(BandMember dto) {
        Connection connection = ConnectionFactory.getConnection();
        try{
            PreparedStatement ps = connection.prepareStatement("INSERT INTO BandMembers VALUES" +
                    "(NULL, ?, ?, ?, ?)");
            ps.setString(1, dto.getFirstName());
            ps.setString(2, dto.getLastName());
            ps.setInt(3, dto.getBirthYear());
            ps.setString(4, dto.getInstrument());
            int i = ps.executeUpdate();

            if(i == 1){
                System.out.println("Database updated!");
                return true;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Could not update database!");
        return false;
    }

    public boolean delete(int id) {
        Connection connection = ConnectionFactory.getConnection();
        try{
            Statement stmt = connection.createStatement();
            int i = stmt.executeUpdate("DELETE FROM BandMembers WHERE id=" + id);

            if(i == 1){
                System.out.println("Information at row " + id + " has been deleted!");
                return true;
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return false;
    }
}
