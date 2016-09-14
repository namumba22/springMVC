<jsp:useBean id="user" class="com.myweb.UserData" scope="session"/>

<jsp:setProperty name="user" property="username" param="username"  />
<jsp:setProperty name="user" property="email" param="sex"  />


<BODY>
<h1> yor name is: <%= user.getUsername() %></h1>
<h1> and gender: <%= user.getEmail() %></h1>

<jsp:forward page="NextPage.jsp"/>

<A HREF="NextPage.jsp">Continue</A>
</BODY>
</HTML>