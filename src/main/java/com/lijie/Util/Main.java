package com.lijie.Util;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceFilter;
import com.lijie.Module.db.DbModule;
import com.lijie.Module.jersey.MyModule;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

/**
 * Created by Administrator on 2017/1/11 0011.
 */
public class Main {
    private  static final int DEFAULT_PORT = 8090;
    public void startServer(int serverPort) throws Exception {
        Server server = new Server(serverPort);
        ServletContextHandler servletContextHandler = new ServletContextHandler(server, "/");
        servletContextHandler.addFilter(GuiceFilter.class, "/*", null);
        servletContextHandler.addServlet(DefaultServlet.class, "/");

        server.start();
        server.join();
    }
    public static void main(String[] args) throws Exception {
        Injector injector = Guice.createInjector(
                new MyModule(),
                new DbModule()
        );

        Main main = injector.getInstance(Main.class);
        main.startServer(DEFAULT_PORT);
    }
}
