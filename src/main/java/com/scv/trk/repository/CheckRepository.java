package com.scv.trk.repository;

import com.scv.trk.model.CheckInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CheckRepository extends JpaRepository<CheckInfo, Long> {
}
