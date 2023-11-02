package services;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import models.Producto;
import models.Proveedor;

 public class ProductoService {

    String filename = "./database/producto.txt";
    File fl;
    FileReader fr;
    BufferedReader br;

    public ProductoService() {
        fl = new File(filename);
    }

    public ArrayList<Producto> getProducts() throws IOException {
        ArrayList<Producto> lista = new ArrayList<>();

        try {
            fr = new FileReader(fl);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "|");
                Producto producto = new Producto();
                producto.setId(Integer.parseInt(st.nextToken()));
                producto.setNombre(st.nextToken());
                producto.setStock(Integer.parseInt(st.nextToken()));
                producto.setProveedor(new Proveedor());
                lista.add(producto);
            }
        } catch (IOException e) {
            throw e;
        }

        return lista;
    }

}
