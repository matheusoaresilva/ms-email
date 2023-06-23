package com.ms.repositories;

import com.ms.model.EmailModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface EmailRepo extends JpaRepository<EmailModel, UUID> {

}
