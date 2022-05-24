package com.codeclan.example.folders.repositories;

import com.codeclan.example.folders.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FolderRepository extends JpaRepository<Folder, Long> {
}
