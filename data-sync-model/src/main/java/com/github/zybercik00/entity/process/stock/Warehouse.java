package com.github.zybercik00.entity.process.stock;

import jakarta.annotation.Nonnull;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "WAREHOUSE",
        uniqueConstraints = @UniqueConstraint(
                name = "UC_WAREHOUSE",
                columnNames = "WAREHOUSE_NAME"))
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@ToString
public class Warehouse {

    @Id
    @GeneratedValue
    @Nonnull
    @Column(name = "WAREHOUSE_ID")
    private Long id;

    @Nonnull
    @Column(name = "WAREHOUSE_NAME")
    @EqualsAndHashCode.Include
    private String name;

    @Nonnull
    @PrimaryKeyJoinColumn(name = "WAREHOUSE_LOCATION")
    @OneToOne
    private WarehouseLocation warehouseLocation;
}
