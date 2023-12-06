package services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSONParser<T> {

    private Gson parser;

    public JSONParser() {
        parser = new Gson();
    }

    public String stringify(T object) {
        try {
            return parser.toJson(object);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public String stringify(ArrayList<T> object) {
        try {
            return parser.toJson(object);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public T parser(String json, Class<T> objectType) {
        try {
            return parser.fromJson(json, objectType);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }

    }

    public ArrayList<T> parserList(String json, Class<T> objectType) {
        try {
            Type type = TypeToken.getParameterized(ArrayList.class, objectType).getType();
            return parser.fromJson(json, type);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
