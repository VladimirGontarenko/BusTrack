package ru.aptek.bustrack.entities;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Entity
@Getter
@Setter
@ToString
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(generator = "uuid-gibernate-generator)")
    @GenericGenerator(name = "uuid-gibernate-generator", strategy = "org.hibernate.id.UUIDGenerator")
    private UUID id;
    private String login;
    private String password;
}
