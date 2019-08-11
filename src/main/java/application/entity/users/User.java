package application.entity.users;

import application.entity.orders.Order;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.*;

import static application.entity.users.RoleUser.USER;

@Data
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    @Column(name="role",nullable = false,length = 20)
    @Enumerated(EnumType.STRING)
    RoleUser roleUser=RoleUser.USER;
    @Column(length = 30)
    String email;
    @Column(length = 30)
    String firstname;
    @Column(length = 30)
    String lastname;
    @Column(length = 30)
    String patronymic;//отчество
    @Column(length = 40)
    String hashpassword;//hash пароля
    @Column(length = 40)
    String hashrecovery;//hash востановления пароля
    String company;
    String phone;
    String location;
    Date lastvisit;
    Date dateregirter;
    String postarrival;//почта получения
    @OneToMany(mappedBy = "user",targetEntity = Order.class, cascade = CascadeType.ALL, fetch = FetchType.LAZY, orphanRemoval = true)
    private List<Order> order=new ArrayList<>();



}
