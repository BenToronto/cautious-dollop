public class FrontendServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    private final String backendUrl;

    public FrontendServlet() {
        super();
        this.backendUrl = System.getProperty("BACKEND_URL", null);
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (this.backendUrl==null) {
            throw new ServletException("h");
        }
        try (PrintWriter out = response.getWriter()) {
            out.print(Request.Get(backendUrl + "?arg=xhgjhghgjxxx").execute().returnContent());
        }
	}
}
