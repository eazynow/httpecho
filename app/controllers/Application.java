package controllers;

import play.*;
import play.mvc.*;

import java.util.*;

import models.*;

public class Application extends Controller {

    public static void index() {
    	StringBuilder sb = new StringBuilder();

    	Map<String,Http.Header> headers = request.headers;

    	sb.append("Host: " + request.host + "\n");
    	sb.append("URI Path: " + request.path + "\n");


    	sb.append("\nHeaders\n=======\n");
    	for (Map.Entry<String, Http.Header> entry : headers.entrySet())
		{
		    sb.append(entry.getKey() + ": " + entry.getValue() + "\n");
		}

        sb.append("\n\nBody & Params\n=============\n");
        sb.append(request.params.allSimple());
        renderText(sb);
    }

}