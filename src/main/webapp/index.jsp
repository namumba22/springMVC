<HTML>
<BODY>
<%@ page import="java.util.*,java.text.*" %>
<%!
    int n =12;
%>

<%
    // This scriptlet declares and initializes "date"
    System.out.println( "Evaluating date now" );
    java.util.Date date = new java.util.Date();
%>
Hello!  The time is now
<%
    out.println( date );
    out.println( "<BR>Your machine's address is " );
    out.println( request.getRemoteHost());
%>


    <TABLE BORDER=2>
<%
    for ( int i = 0; i < n; i++ ) {
%>
<TR>
    <TD>Number</TD>
    <TD><%= i+1 %></TD>
</TR>
<%
    }


%>

        <jsp:forward page="./WEB-INF/pages/hallow.jsp"/>
</TABLE>

</BODY>
</HTML>