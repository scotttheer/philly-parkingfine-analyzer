package edu.upenn.cit594.datamanagement;

import java.io.File;
import java.util.LinkedList;

import edu.upenn.cit594.data.ParkingViolation;

public interface ReadMethod {
	public LinkedList<ParkingViolation> read(File f);
}
