package com.example.TaskTracker.entity;

import lombok.Data;
import org.hibernate.envers.Audited;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;

@Data
@Entity
@Table(name="task")
@EntityListeners(AuditingEntityListener.class)
@Audited
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="text",nullable = false)
    private String text;
    @Column(name="day")
    private String day;
    @Column(name="reminder")
    private boolean reminder;

}
