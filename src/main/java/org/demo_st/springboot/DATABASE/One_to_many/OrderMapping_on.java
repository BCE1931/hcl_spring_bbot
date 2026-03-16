package org.demo_st.springboot.DATABASE.One_to_many;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderMapping_on extends JpaRepository<OrderMapping , Long> {
}
