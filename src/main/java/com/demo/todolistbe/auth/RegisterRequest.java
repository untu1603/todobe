package com.demo.todolistbe.auth;


import com.demo.todolistbe.user.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RegisterRequest {
  private String fullName;
  private String userName;
  private String email;
  private String password;
  private Role role;
}
