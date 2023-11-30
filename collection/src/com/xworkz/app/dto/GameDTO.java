package com.xworkz.app.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class GameDTO implements Serializable{
	
	private Integer id;
	private String name;
	private Integer participants;
	private Integer points;
	private LocalDate eventDate;
	private String winner;
	private String runner;
	private Double duration;
	
	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", name=" + name + ", participants=" + participants + ", points=" + points
				+ ", eventDate=" + eventDate + ", Winner=" + winner + ", runner=" + runner + ", duration=" + duration
				+ "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParticipants() {
		return participants;
	}

	public void setParticipants(Integer participants) {
		this.participants = participants;
	}

	public Integer getPoints() {
		return points;
	}

	public void setPoints(Integer points) {
		this.points = points;
	}

	public LocalDate getEventDate() {
		return eventDate;
	}

	public void setEventDate(LocalDate eventDate) {
		this.eventDate = eventDate;
	}

	public String getWinner() {
		return winner;
	}

	public void setWinner(String winner) {
		this.winner = winner;
	}

	public String getRunner() {
		return runner;
	}

	public void setRunner(String runner) {
		this.runner = runner;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public GameDTO(Integer id, String name, Integer participants, Integer points, LocalDate eventDate, String winner,
			String runner, Double duration) {
		super();
		this.id = id;
		this.name = name;
		this.participants = participants;
		this.points = points;
		this.eventDate = eventDate;
		this.winner = winner;
		this.runner = runner;
		this.duration = duration;
	}

	@Override
	public int hashCode() {
		return Objects.hash(duration, eventDate, id, name, participants, points, runner, winner);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameDTO other = (GameDTO) obj;
		return Objects.equals(duration, other.duration) && Objects.equals(eventDate, other.eventDate)
				&& Objects.equals(id, other.id) && Objects.equals(name, other.name)
				&& Objects.equals(participants, other.participants) && Objects.equals(points, other.points)
				&& Objects.equals(runner, other.runner) && Objects.equals(winner, other.winner);
	}

	
	

}
