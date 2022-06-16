package com.spring.jpa.controller;

import com.spring.jpa.data.LibResponse;
import com.spring.jpa.data.Library;
import com.spring.jpa.service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    private LibraryService libraryService;

    @PostMapping ("/save")
    public Library saveLibrary(@RequestBody Library library){
       return libraryService.createLibrary(library);
    }

    @PostMapping ("/savelist")
    public List<Library> saveLibraries(@RequestBody List<Library> libraries){

       return libraryService.createLibraries(libraries);
    }

    @GetMapping("/{libraryId}")
    public Library getLibrary(@PathParam(value = "libraryId") int libraryId){
        return libraryService.readLibrary(libraryId);
    }

    @GetMapping("/findAllLibraries")
    public List<Library> getLibraries(){
        return libraryService.readLibraries();
    }

    @GetMapping("/booksCount")
    public ResponseEntity libraryBasedBooksCount(){
        List<LibResponse> libResponseList = new ArrayList<>();
        List<Library> libraryList = libraryService.readLibraries();
        if(!CollectionUtils.isEmpty(libraryList)){
          libraryList.stream().forEach(x->{
              libResponseList.add(new LibResponse(x.getLibraryId(),x.getLibraryName(),x.getBooks().size()));
          });


        }
        return ResponseEntity.ok(libResponseList);
    }

}
