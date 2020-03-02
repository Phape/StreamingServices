package com.streamingservice.StreamingService;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

/**
 * Einfaches Spring Data Repository für den Zugriff auf die in der Datenbank
 * gespeicherten Gästebucheinträge. Spring erzeugt automatisch eine abgeleitete
 * Klasse mit den üblichen Methoden zum Lesen, Schreiben und Löschen von
 * Einträgen.
 */
@RepositoryRestResource(collectionResourceRel = "guestbookEntries", path = "guestbook")
public interface GuestbookEntryRepository extends PagingAndSortingRepository<GuestbookEntry, Long> {
    // Kann leer bleiben
}