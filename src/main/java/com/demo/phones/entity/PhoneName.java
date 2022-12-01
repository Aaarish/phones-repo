package com.demo.phones.entity;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Embeddable
@Data
@AttributeOverrides(
        {
                @AttributeOverride(name = "phoneModelName", column = @Column(name = "phone_model")),
                @AttributeOverride(name = "phoneCompanyName", column = @Column(name = "phone_company"))
        }
)
public class PhoneName {
    private String phoneModelName;
    private String phoneCompanyName;
}
