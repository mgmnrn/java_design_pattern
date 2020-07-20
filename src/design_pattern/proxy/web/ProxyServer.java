package design_pattern.proxy.web;

import java.util.HashMap;

public class ProxyServer implements Server {
    private HashMap<Integer, String> database;
    private Server proxy;

    public ProxyServer(Server proxy) {
        this.database = new HashMap<>();
        this.proxy = proxy;
    }

    @Override
    public String request(int req) {
        if (database.containsKey(req)) {
            return database.get(req);
        } else {
            String data = proxy.request(req);
            database.put(req, data);
            return data;
        }
    }
}
