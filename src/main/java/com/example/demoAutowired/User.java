package com.example.demoAutowired;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String name;


}
