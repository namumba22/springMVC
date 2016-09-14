<jsp:useBean id="user" class="com.myweb.UserData" scope="session"/>


<HTML>
<BODY>
Hello, <%= user.getUsername() %>
</p>

your age is: <%= user.getEmail() %>
</p>
<A HREF="GetName.jsp">Go to get Name</A>

</BODY>
</HTML>


