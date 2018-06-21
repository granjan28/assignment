package com.cgi.uswest.chimpls.assignment;

import java.math.BigDecimal;
import java.util.Set;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface AssignmentRepository extends CrudRepository<Assignment, BigDecimal> {
	
	@Query("select a from Assignment a where a.id_case_prvd = ?1 and a.cd_type = 'C' and a.dt_end is null and cd_role=1")
	Assignment getPrimaryAssignmentByIdCase(@Param("id_case") BigDecimal id_case);
	
	@Query("select a from Assignment a where a.id_case_prvd = ?1 and a.cd_type = 'P' and a.dt_end is null and cd_role=1")
	Assignment getPrimaryAssignmentByIdPrvd(@Param("id_prvd") BigDecimal id_prvd);
	
	@Query("select a from Assignment a where a.id_prsn = ?1 and a.dt_end is null and cd_role=1")
	Set<Assignment> getPrimaryAssignmentByIdPrsn(@Param("id_prsn") BigDecimal id_prsn);
}
