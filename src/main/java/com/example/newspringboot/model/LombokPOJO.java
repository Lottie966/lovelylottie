package com.example.newspringboot.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Data
@Slf4j
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class LombokPOJO {
    private String name;
    private Integer age;
}
