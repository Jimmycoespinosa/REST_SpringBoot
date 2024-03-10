package com.example.model;

import jakarta.persistence.*;
import java.io.Serializable;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Data
@Entity
@Table(name = "user")
public class User implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//Autoincremental.
    private Long id;
    
    private String name;
    private String email;
    
    @CreationTimestamp
    @Column(name = "created_at", updatable = false)
    private String created_at;
    
    @UpdateTimestamp 
    @Column(name = "update_at", insertable = false)
    private String update_at;
    
    @Column(name = "deleted_at", nullable = true)
    private String deleted_at;
}
