package org.demo_st.springboot.DATABASE.One_to_many;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderMapping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String order_name;

    private String address;

    private int amount;

    @ManyToOne
    @JoinColumn(name = "user_fk" , referencedColumnName = "id") //decides owning side
    private UserMapping_onetomany  userMappingOnetomany;
}
