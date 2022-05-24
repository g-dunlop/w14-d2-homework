package com.codeclan.example.folders.components;


import com.codeclan.example.folders.models.File;
import com.codeclan.example.folders.models.Folder;
import com.codeclan.example.folders.models.User;
import com.codeclan.example.folders.repositories.FileRepository;
import com.codeclan.example.folders.repositories.FolderRepository;
import com.codeclan.example.folders.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    UserRepository userRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    FileRepository fileRepository;

    public DataLoader(){

    }

    public void run(ApplicationArguments args) {
        User bill = new User("Bill");
        userRepository.save(bill);

        User tim = new User("Tim");
        userRepository.save(tim);

        Folder documents = new Folder("documents", tim);
        folderRepository.save(documents);

        Folder finished = new Folder("finished", tim);
        folderRepository.save(finished);

        Folder todo = new Folder("todo", bill);
        folderRepository.save(todo);

        File file1 = new File("file1", ".txt", 85, documents);
        fileRepository.save(file1);

        File file2 = new File("file2", ".doc", 328, todo);
        fileRepository.save(file2);
    }


}
