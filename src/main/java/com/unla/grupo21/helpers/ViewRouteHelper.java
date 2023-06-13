package com.unla.grupo21.helpers;

public class ViewRouteHelper {
	/**** Views ****/
	//HOME
	public final static String INDEX = "home/index";
	
	//DISPOSITIVO
	public final static String DISPOSITIVO_INDEX = "dispositivo/listaDispositivos";
	public final static String DISPOSITIVO_NEW = "dispositivo/new";
	public final static String DISPOSITIVO_UPDATE = "dispositivo/update";
	public final static String DISPOSITIVO_LIST = "dispositivo/listaDispositivos";
	
	
	//ALUMBRADO
	public final static String ALUMBRADO_INDEX = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADO_NEW = "alumbrado/new";
	public final static String ALUMBRADO_UPDATE = "alumbrado/update";
	public final static String ALUMBRADO_LIST = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADOYEVENTO_LIST = "alumbrado/listaEventosAlumbrado";
	
	
	//EVENTO
	public final static String EVENTO_INDEX = "evento/index";
	public final static String EVENTO_NEW = "alumbrado/eventos/newEvento";
	
	
	//MEDICION
	public final static String MEDICION_INDEX = "medicion/listaMediciones";
	

	//USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";

	/**** Redirects ****/
	public final static String ROUTE = "/index";
	public final static String ALUMBRADO_ROOT = "/alumbrado";
	public final static String DISPOSITIVO_ROOT = "/dispositivo";
	public final static String EVENTO_ROOT = "/alumbrado/eventos";
	public final static String MEDICION_ROOT = "/medicion";
	
	
}
