package study.springrestapi.events;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.hateoas.EntityModel;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;

@Getter
@AllArgsConstructor
public class EventResource extends EntityModel<Event> {
    protected EventResource(Event event) {
        super(event);
        add(linkTo(EventController.class).slash(event.getId()).withSelfRel());
    }
}
