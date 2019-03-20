package ua.lviv.lgs.univercity.dao;


import org.springframework.data.jpa.repository.JpaRepository;

import ua.lviv.lgs.univercity.domain.Subject;

public interface SubjectRepository extends JpaRepository<Subject, Integer>{

}
