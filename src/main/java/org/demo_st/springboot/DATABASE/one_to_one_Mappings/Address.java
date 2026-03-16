package org.demo_st.springboot.DATABASE.one_to_one_Mappings;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.demo_st.springboot.DATABASE.User;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
//this is the clid or inverse class
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long  id;

    private String street;
    private String city;
    private String state;
    private String zip;
    private String country;

    //one to one bidirectionsla
    @OneToOne(mappedBy = "address")
    @JsonBackReference //to solve inverse problem infinite
    //in this class or inverse side no need of join column because table strutre is same for
    //both unidirectional and bidirectional one to one mapping
    private User user;
}
