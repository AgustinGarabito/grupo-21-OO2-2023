package com.unla.grupo21OO22023.helpers;

public class ViewRouteHelper {

	// HOME
	public final static String INDEX = "home/index";
	
	//USER
	public final static String USER_LOGIN = "user/login";
	public final static String USER_LOGOUT = "user/logout";
	
	// DISPOSITIVO
	public final static String LISTA_DISPOSITIVOS = "dispositivo/listaDispositivos";
	
	
	// RIEGO
	public final static String RIEGO_INDEX = "riego/index";
	public final static String RIEGO_NEW = "riego/new";
	public final static String RIEGO_UPDATE = "riego/update";
	
	// EVENTO
	public final static String EVENTO_INDEX = "evento/index";
	public final static String EVENTO_PARTICULAR = "evento/particular";
	public final static String EVENTO_ERROR = "evento/error";
	
	
	//MEDICION
	public final static String MEDICION_INDEX = "medicion/listaMediciones";
	
	//ALUMBRADO
	public final static String ALUMBRADO_INDEX = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADO_NEW = "alumbrado/new";
	public final static String ALUMBRADO_UPDATE = "alumbrado/update";
	public final static String ALUMBRADO_LIST = "alumbrado/listaAlumbrado";
	public final static String ALUMBRADOYEVENTO_LIST = "alumbrado/listaEventosAlumbrado";
	
	
	// REDIRECTS
	public final static String ROUTE = "/index";
	public final static String RIEGO_ROOT = "/riego";
	public final static String EVENTOS_SINGLE = "/evento/riegos/";
	public final static String R_EVENTO_ERROR = "/evento/error";
	
	
	public final static String ALUMBRADO_ROOT = "/alumbrado";
	public final static String EVENTO_ROOT = "/alumbrado/eventos";
	public final static String MEDICION_ROOT = "/medicion";
	
	
}
