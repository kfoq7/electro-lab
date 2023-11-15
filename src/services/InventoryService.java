package services;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.StringTokenizer;
import models.Inventory;

public class InventoryService {

    private final String filename = "./database/inventario.dat";
    private FileReader fr;
    private BufferedReader br;
    private ArrayList<Inventory> inventarios;

    public InventoryService() throws IOException {
        inventarios = getInvetarios();
    }

    public ArrayList<Inventory> getInvetarios() throws IOException {
        ArrayList<Inventory> lista = new ArrayList<>();

        try {
            fr = new FileReader(filename);
            br = new BufferedReader(fr);

            String linea;

            while ((linea = br.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(linea, "|");
                Inventory inventario = new Inventory();
                inventario.setId(Integer.parseInt(st.nextToken()));
                inventario.setFechaEntrada(new Date(st.nextToken()));
            }
        } catch (IOException e) {
            throw e;
        }

        return lista;
    }

}
