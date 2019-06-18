package com.bae.persistence.repository;

public interface RoutineRepository {
	String getAllRoutines();

	String getARoutine(int routineID);

	String createRoutine(String routine);

	String deleteRoutine(int routineID);

	String updateRoutine(int routineID, String routine);
	
	String addToRoutine(int routineID, String poseID);
	
	String removeFromRoutine(int routineID, String poseID);

}
