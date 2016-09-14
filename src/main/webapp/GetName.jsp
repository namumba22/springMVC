<HTML>
<BODY>
<FORM METHOD=POST ACTION="SaveName.jsp">
    What's your name? <INPUT TYPE=TEXT NAME=username SIZE=20>
    Sex ? <INPUT TYPE=TEXT NAME=sex SIZE=10>
    <P><INPUT TYPE=SUBMIT>
</FORM>

<h3>File Upload:</h3>
Select a file to upload: <br />
<form action="UploadServlet" method="post"
      enctype="multipart/form-data">
    <input type="file" name="file" size="50" />
    <br />
    <input type="submit" value="Upload File" />
</form>


</BODY>
</HTML>