package package1;
import org.apache.logging.log4j.*;

public class Demo {

	private static Logger log  = LogManager.getLogger(Demo.class.getName());
			
	
	public static void main(String[] args) {
		
		log.debug("I am debugging");
		
			log.debug("object is present");		
			log.info("test information");
			log.error("object is not present");		
			log.fatal("fatal text");
			log.debug("object is present");		
			log.info("test information");
			log.error("object is not present");		
			log.fatal("fatal text");
			log.debug("object is present");		
			log.info("test information");
			log.error("object is not present");		
			log.fatal("fatal text");
			log.debug("object is present");		
			log.info("test information");
			log.error("object is not present");		
			log.fatal("fatal text");
			
		}

	

}

