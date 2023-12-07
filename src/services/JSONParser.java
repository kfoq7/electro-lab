package services;

import com.google.gson.internal.$Gson$Types;
import com.google.gson.Gson;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class JSONParser<T> {

    private Gson parser;
    private Class<T> objectType;

    public JSONParser(Class<T> objectType) {
        parser = new Gson();
        this.objectType = objectType;
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

    public T parser(String json) {
        try {
            return parser.fromJson(json, objectType);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

    public ArrayList<T> parserList(String json) {
        try {
            Type type = $Gson$Types.newParameterizedTypeWithOwner(null, ArrayList.class, objectType);

            return parser.fromJson(json, type);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
