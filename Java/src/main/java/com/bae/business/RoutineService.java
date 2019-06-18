package com.bae.business;

public interface RoutineService {

	String getAllRoutines();

	String getARoutine(int routineID);

	String createRoutine(String routine);

	String deleteRoutine(int routineID);

	String updateRoutine(int routineID, String routine);
	
	String addToRoutine(int routineID, String poseID);
	
	String removeFromRoutine(int routineID, String poseID);
}
