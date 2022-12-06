package daos;

import models.BandMember;

import java.util.List;

public interface BandMembersDAO {
    BandMember findByID(int id);
    List<BandMember> findAll();
    BandMember update(BandMember dto);
    BandMember create(BandMember dto);
    void delete(int id);
}
