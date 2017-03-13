package events.service;

import static org.springframework.http.HttpStatus.*;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(NOT_FOUND)
public class EventNotFoundException extends RuntimeException {

	private static final long serialVersionUID = -2411738770351557081L;

	public EventNotFoundException(String message) {
		super(message);
	}

	public EventNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

}
