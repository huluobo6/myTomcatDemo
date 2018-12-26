package huluobo;

/**
 * my name is huluobo
 */
public class ErrorServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("huluobo get 404...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("huluobo post 404...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
