package com.codeclan.example.folders.controllers;

import com.codeclan.example.folders.models.File;
import com.codeclan.example.folders.models.Folder;
import com.codeclan.example.folders.models.User;
import com.codeclan.example.folders.repositories.FolderRepository;
import com.codeclan.example.folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

    @RestController
    public class FolderController {
        @Autowired
        FolderRepository folderRepository;

        @GetMapping(value = "/folders")
        public ResponseEntity<List<Folder>> getAllFolder() {
            return new ResponseEntity<>(folderRepository.findAll(), HttpStatus.OK);
        }

        @GetMapping(value = "/folders/{id}")
        public ResponseEntity getFolder(@PathVariable Long id) {
            return new ResponseEntity<>(folderRepository.findById(id), HttpStatus.OK);
        }

        @PostMapping(value = "/folders")
        public ResponseEntity<Folder> postFolder(@RequestBody Folder folder){
            folderRepository.save(folder);
            return new ResponseEntity<>(folder, HttpStatus.CREATED);
        }

    }

