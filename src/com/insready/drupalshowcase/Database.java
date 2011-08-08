package com.insready.drupalshowcase;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;

public class Database extends SQLiteOpenHelper {
	private Context mCtx;
	private static final int DATABASE_VERSION = 1;
	private final static String DATABASE_NAME = "drupalshowcase.db";
	public static final String DATABASE_TABLE_MAIN = "main";
	public static final String DATABASE_TABLE_CATEGORIES = "categories";
	public static final String DATABASE_TABLE_SITETYPE = "sitetype";
	
	private static final String DATABASE_CREATE_MAIN = "CREATE TABLE "
			+ DATABASE_TABLE_MAIN
			+ " (_id INTEGER NOT NULL, title TEXT DEFAULT NULL, "
			+ "picture TEXT DEFAULT NULL, url TEXT DEFAULT NULL,"
			+ "content TEXT DEFAULT NULL, sitedeveloper TEXT DEFAULT NULL, sitedesigner TEXT DEFAULT NULL,"
			+ "country TEXT DEFAULT NULL, industry TEXT DEFAULT NULL);";
	
	private static final String DATABASE_CREATE_CATEGORIES = "CREATE TABLE "
			+ DATABASE_TABLE_CATEGORIES
			+ " (_id INTEGER NOT NULL, title TEXT DEFAULT NULL, "
			+ "categories TEXT DEFAULT NULL);";
	
	
	private static final String DATABASE_CREATE_SITETYPE = "CREATE TABLE "
			+ DATABASE_TABLE_SITETYPE
			+ " (_id INTEGER NOT NULL, title TEXT DEFAULT NULL, "
			+ "sitetype TEXT DEFAULT NULL);";