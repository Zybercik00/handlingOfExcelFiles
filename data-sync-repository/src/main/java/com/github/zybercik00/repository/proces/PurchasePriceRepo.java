package com.github.zybercik00.repository.proces;

import com.github.zybercik00.domain.proces.PurchasePrice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PurchasePriceRepo extends JpaRepository<PurchasePrice, String> {
}