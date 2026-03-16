package org.demo_st.springboot.DATABASE.One_to_many;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.demo_st.springboot.DATABASE.one_to_one_Mappings.Address;

import java.util.List;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserMapping_onetomany {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;

    private String  name;
    private String  password;
    private String  email;
    private String  mobile;

    @OneToMany(cascade =  CascadeType.ALL , mappedBy = "userMappingOnetomany")
//    @JoinColumn(name = "user_id_fk" , referencedColumnName = "id")//creates fk in child table
    @JsonManagedReference
    private List<OrderMapping> orderMappingList;
}
