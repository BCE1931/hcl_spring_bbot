package org.demo_st.springboot.DATABASE.One_to_many;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserMappping_one_repo extends JpaRepository<UserMapping_onetomany, Long> {
}
