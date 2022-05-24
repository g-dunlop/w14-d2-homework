package com.codeclan.example.folders.repositories;

import com.codeclan.example.folders.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRepository extends JpaRepository<File, Long> {
}
