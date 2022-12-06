package daos;

import models.BandMember;

import java.util.List;

public interface BandMembersDAO {
    BandMember findByID(int id);
    List<BandMember> findAll();
    boolean update(BandMember dto);
    boolean create(BandMember dto);
    void delete(int id);
}
