package org.spring.springcore.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@AllArgsConstructor
public class Company {
    private String companyName;
    private String companyAddress;

    private List<Emploe> emploe;
}
