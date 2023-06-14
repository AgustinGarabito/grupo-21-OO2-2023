package com.unla.grupo21.helpers;

public class ViewRouteHelper {
	/**** Views ****/
	//HOME
	public final static String INDEX = "home/index";
		
	
	//ALUMBRADO
	public final static String ALUMBRADO_INDEX = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADO_NEW = "alumbrado/new";
	public final static String ALUMBRADO_UPDATE = "alumbrado/update";
	public final static String ALUMBRADO_LIST = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADOYEVENTO_LIST = "alumbrado/listaEventosAlumbrado";
		
	//MEDICION
	public final static String MEDICION_INDEX = "medicion/listaMediciones";
	

	//USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";

	/**** Redirects ****/
	public final static String ROUTE = "/index";
	public final static String ALUMBRADO_ROOT = "/alumbrado";
	public final static String EVENTO_ROOT = "/alumbrado/eventos";
	public final static String MEDICION_ROOT = "/medicion";
	
	
}
