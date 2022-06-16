package com.spring.jpa.service;

import com.spring.jpa.data.Library;
import com.spring.jpa.repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class LibraryService {

    @Autowired
    private LibraryRepository libraryRepository;

    @Transactional
    public Library createLibrary(Library library) {
        return libraryRepository.save(library);
    }

    public List<Library> createLibraries(List<Library> libraries) {
       return  libraryRepository.saveAll(libraries);
    }

    public Library readLibrary(int libraryId) {
       return libraryRepository.findById(libraryId).get();
    }

    public List<Library> readLibraries() {
        return libraryRepository.findAll();
    }
}


