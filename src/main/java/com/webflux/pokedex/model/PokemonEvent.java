package com.webflux.pokedex.model;

public class PokemonEvent {
	
	private Long eventId;
	private String eventType;
	
	
	public PokemonEvent(Long eventId, String eventType) {
		this.eventId = eventId;
		this.eventType = eventType;
	}
	
	

	public Long getEventId() {
		return eventId;
	}



	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}



	public String getEventType() {
		return eventType;
	}



	public void setEventType(String eventType) {
		this.eventType = eventType;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((eventId == null) ? 0 : eventId.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PokemonEvent other = (PokemonEvent) obj;
		if (eventId == null) {
			if (other.eventId != null)
				return false;
		} else if (!eventId.equals(other.eventId))
			return false;
		return true;
	}



	@Override
	public String toString() {
		return "PokemonEvent [eventId=" + eventId + ", eventType=" + eventType + "]";
	}
	
	
	
	
	
	

}
