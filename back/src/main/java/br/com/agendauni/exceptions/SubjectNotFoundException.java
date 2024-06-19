package br.com.agendauni.exceptions;

import jakarta.persistence.EntityNotFoundException;

public class SubjectNotFoundException extends EntityNotFoundException {

    public SubjectNotFoundException(String message){
        super (message);
    }
}
