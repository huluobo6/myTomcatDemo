package huluobo;

/**
 * my name is huluobo
 */
public abstract class MyServlet {

    private static final String HTTP_METHOD_GET = "get";
    private static final String HTTP_METHOD_POST = "post";

    public abstract void doGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    public void service(MyRequest myRequest, MyResponse myResponse) {
        System.out.println("Myservlet....");
        if (HTTP_METHOD_GET.equalsIgnoreCase(myRequest.getMethod())) {
            System.out.println("Myservlet doGet....");
            doGet(myRequest, myResponse);
        } else if (HTTP_METHOD_POST.equalsIgnoreCase(myRequest.getMethod())) {
            System.out.println("Myservlet doPost....");
            doPost(myRequest, myResponse);
        }
    }
}
