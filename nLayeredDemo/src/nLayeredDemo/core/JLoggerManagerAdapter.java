package nLayeredDemo.core;

import nLayeredDemo.jLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerSevice {

	@Override
	public void logToSysyem(String message) {
		
		JLoggerManager manager = new JLoggerManager();
		manager.log(message);
		
	}

}
