package huluobo;

/**
 * my name is huluobo
 */
public class FirstServlet extends MyServlet {

    @Override
    public void doGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("huluobo get first blood...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.write("huluobo post first blood...");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
