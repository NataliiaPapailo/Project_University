package ua.lviv.lgs.univercity.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.lviv.lgs.univercity.domain.Students;

public interface StudentsRepository extends JpaRepository<Students, Integer>{

}
