package com.xti.eventsourcingbackend.repository;

import com.xti.eventsourcingbackend.domain.event.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends CrudRepository<Event, String> {
}
