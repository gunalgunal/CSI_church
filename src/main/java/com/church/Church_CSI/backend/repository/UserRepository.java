package com.church.Church_CSI.backend.repository;

import com.church.Church_CSI.backend.model.UserDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDetails,Long> {
}
