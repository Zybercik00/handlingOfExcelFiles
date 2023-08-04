package com.github.zybercik00.repository.mappingattribute;

import com.github.zybercik00.metadata.MappingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MappingRepo extends JpaRepository<MappingEntity, String> {
}
