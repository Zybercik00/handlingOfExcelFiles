package com.github.zybercik00.domain.proces;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "MARGIN")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class Margin {

    @Id
    @GeneratedValue
    @Column(name = "MARGIN_ID")
    private Long id;

    @EqualsAndHashCode.Include
    @Column(name = "MARGIN_NAME")
    private String name;

    @OneToMany(mappedBy = "margin")
    private List<SalePrice> prices;
}
