package com.alexey.workshopjavafxjdbc.db;

public class DbIntegrityException extends RuntimeException {

	public DbIntegrityException(String msg) {
		super(msg);
	}
}
