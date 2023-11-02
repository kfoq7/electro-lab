package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import models.Producto;
import models.Proveedor;

public class ProductoService {

    private String pathname = "./database/producto.txt";
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<Producto> productos;

    public ProductoService() throws IOException {
        productos = getProducts();
    }

    public ArrayList<Producto> getProducts() throws IOException {
        ArrayList<Producto> lista = new ArrayList<>();

        try {
            fr = new FileReader(pathname);
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

    public Producto findInventarioById(int id) throws Exception {
        for (Producto producto : productos) {
            if (producto.getId() == id) {
                return producto;
            }
        }

        throw new Exception("Invetorio not found");
    }

}
