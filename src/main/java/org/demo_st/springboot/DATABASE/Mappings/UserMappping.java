package org.demo_st.springboot.DATABASE.Mappings;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class UserMappping {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long    id;

    private String  name;
    private String  password;
    private String  email;
    private String  mobile;

    @OneToOne(cascade = CascadeType.ALL) //amin thing for one to one mapping(this initializes)
    @JoinColumn(name = "address" , referencedColumnName = "id")
    //referencedColumnName is the pk of address table
    //name is the fk of this table which is referring to the address table
    private Address address;
}
