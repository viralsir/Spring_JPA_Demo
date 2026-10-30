package org.arham.spring_jpa_demo.repo;

import org.arham.spring_jpa_demo.model.Standard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StandardRepo extends JpaRepository<Standard,Integer>
{
    Standard findByStd(int Std);
}
