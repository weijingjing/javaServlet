public class HelloServlet implements Servlet {

    @Override
    public void destory(){
        System.out.println("Servlet start");
    }


    @Override
    public @OverrideServletConfig getServletConfig(){
        System.out.println("Hello Servlet");
        return null;
    }

    @Override
    public String getServletInfo(){
        System.out.println("getServletInfo");
        return null;
    }

    @Override
    public void init(ServletConfig arg0) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException{
        System.out.println("service");
    }

    public HelloServlet(){
        System.out.println("HelloServlet's constructor...");
    }
}
