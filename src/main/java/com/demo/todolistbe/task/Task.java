package com.demo.todolistbe.task;

import com.demo.todolistbe.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.List;

@Data @Entity @AllArgsConstructor
@RequiredArgsConstructor
@Builder
public class Task {
    @Id @GeneratedValue
    private Integer Id;
    private String description;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    @OneToMany
    @JoinColumn(name = "member_id")
    private List<User> member;
}
