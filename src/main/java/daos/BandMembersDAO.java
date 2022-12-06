package daos;

import models.BandMember;

import java.util.List;

public interface BandMembersDAO {
    BandMember findByID(int id);
    List<BandMember> findAll();
    boolean update(BandMember dto, int id);
    boolean create(BandMember dto);
    boolean delete(int id);
}
