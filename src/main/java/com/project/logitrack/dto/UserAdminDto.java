package com.project.logitrack.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserAdminDto {
	private Long id;
	private String name;	
    private String email;
    private String role;
    private String logisticCenter;
}
