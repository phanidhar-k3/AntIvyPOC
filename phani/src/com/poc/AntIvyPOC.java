package com.poc;
import org.apache.log4j.Logger;
public class AntIvyPOC {
final static Logger logger = Logger.getLogger(AntIvyPOC.class);
public static void main(String[] args) {
System.out.println("Welcome");
logger.info(args.toString());	
}
}
