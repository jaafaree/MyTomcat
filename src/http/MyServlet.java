package http;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 3/18/2019 9:45 AM
 */
public abstract class MyServlet {

    public abstract void doGet(MyRequest request, MyResponse response);
    public abstract void doPost(MyRequest request, MyResponse response);

    public void service(MyRequest request, MyResponse response) {
        if (request.getMethod().equalsIgnoreCase("POST")) {
            this.doPost(request, response);
        } else if (request.getMethod().equalsIgnoreCase("GET")) {
            this.doGet(request, response);
        }
    }
}
