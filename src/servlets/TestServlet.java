package servlets;

import http.MyRequest;
import http.MyResponse;
import http.MyServlet;

import java.io.IOException;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 3/18/2019 9:52 AM
 */
public class TestServlet extends MyServlet {
    @Override
    public void doGet(MyRequest request, MyResponse response) {
        try {
            response.write("test GET...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest request, MyResponse response) {
        try {
            response.write("test POST...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
